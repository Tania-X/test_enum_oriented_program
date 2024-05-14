package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum2;
import com.max.test_enum_oriented_program.result.HttpResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractQueryHandler<T extends IFeignReqBean> implements IQueryHandler<T> {

  protected ProtocolEnum2 protocolEnum2;

  @Override
  public HttpResult handleQuery(T t) {
    log.info("{} -> {}-{}: [{}]", protocolEnum2.getSender(), protocolEnum2.getReceiver(),
        protocolEnum2.getProtocolDesc(), t);
    IFeignRespBean respBean = protocolEnum2.getOriginalQueryAction().doOriginalQueryAction(t);
    log.info("{} -> {}-{}: [{}]", protocolEnum2.getReceiver(), protocolEnum2.getSender(),
        protocolEnum2.getProtocolDesc(), respBean);
    return protocolEnum2.getAnalyzeAction().doAnalyzeAction(respBean);
  }

}
