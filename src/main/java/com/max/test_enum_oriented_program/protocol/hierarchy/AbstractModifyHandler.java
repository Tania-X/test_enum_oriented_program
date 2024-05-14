package com.max.test_enum_oriented_program.protocol.hierarchy;

import com.max.test_enum_oriented_program.protocol.IModifyHandler;
import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum1;
import com.max.test_enum_oriented_program.result.HttpResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractModifyHandler<T extends IFeignReqBean> implements IModifyHandler<T> {

  protected ProtocolEnum1 protocolEnum1;

  @Override
  public HttpResult handleModify(T t) {
    log.info("{} -> {}-{}: [{}]", protocolEnum1.getSender(), protocolEnum1.getReceiver(),
        protocolEnum1.getProtocolDesc(), t);
    HttpResult result = doHandleModify(t);
    log.info("{} -> {}-{}: [{}]", protocolEnum1.getReceiver(), protocolEnum1.getSender(),
        protocolEnum1.getProtocolDesc(), result);
    return result;
  }

  protected abstract HttpResult doHandleModify(T t);

}
