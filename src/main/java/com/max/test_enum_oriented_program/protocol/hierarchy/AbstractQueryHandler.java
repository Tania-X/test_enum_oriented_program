package com.max.test_enum_oriented_program.protocol.hierarchy;

import com.max.test_enum_oriented_program.protocol.IQueryHandler;
import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum1;
import com.max.test_enum_oriented_program.result.HttpResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractQueryHandler<T extends IFeignReqBean, U extends IFeignRespBean> implements IQueryHandler<T> {

  protected ProtocolEnum1 protocolEnum1;

  @Override
  public HttpResult handleQuery(T t) {
    log.info("{} -> {}-{}: [{}]", protocolEnum1.getSender(), protocolEnum1.getReceiver(),
        protocolEnum1.getProtocolDesc(), t);
    U respBean = doHandleQuery(t);
    log.info("{} -> {}-{}: [{}]", protocolEnum1.getReceiver(), protocolEnum1.getSender(),
        protocolEnum1.getProtocolDesc(), respBean);
    return doHandleAnalyze(respBean);
  }

  protected abstract U doHandleQuery(T t);

  protected abstract HttpResult doHandleAnalyze(U u);

}
