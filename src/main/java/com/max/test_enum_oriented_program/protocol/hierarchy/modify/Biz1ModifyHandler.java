package com.max.test_enum_oriented_program.protocol.hierarchy.modify;

import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq1Bean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum1;
import com.max.test_enum_oriented_program.protocol.feign.FeignHandler;
import com.max.test_enum_oriented_program.protocol.hierarchy.AbstractModifyHandler;
import com.max.test_enum_oriented_program.result.HttpResult;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

public class Biz1ModifyHandler extends AbstractModifyHandler<FeignReq1Bean> {

  @Resource
  private FeignHandler feignHandler;

  @PostConstruct
  public void init() {
    super.protocolEnum1 = ProtocolEnum1.BIZ_A;
  }

  @Override
  protected HttpResult doHandleModify(FeignReq1Bean feignReq1Bean) {
    return feignHandler.modify1(feignReq1Bean);
  }
}
