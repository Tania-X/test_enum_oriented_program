package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum2;
import com.max.test_enum_oriented_program.result.HttpResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrientedModifyHandler<T extends IFeignReqBean> implements IModifyHandler<T> {

  protected ProtocolEnum2 protocolEnum2;

  @Override
  public HttpResult handleModify(T t) {
    log.info("{} -> {}-{}: [{}]", protocolEnum2.getSender(), protocolEnum2.getReceiver(),
        protocolEnum2.getProtocolDesc(), t);
    HttpResult result = protocolEnum2.getOriginalModifyAction().doOriginalAction(t);
    log.info("{} -> {}-{}: [{}]", protocolEnum2.getReceiver(), protocolEnum2.getSender(),
        protocolEnum2.getProtocolDesc(), result);
    return result;
  }

}
