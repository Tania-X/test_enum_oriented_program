package com.max.test_enum_oriented_program.protocol.hierarchy;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.feign.FeignHandler;
import com.max.test_enum_oriented_program.result.HttpResult;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

public class Biz1ModifyHandler extends AbstractModifyHandler{

  @Resource
  private FeignHandler feignHandler;

  @PostConstruct
  public void init() {

  }

  @Override
  protected HttpResult doHandleModify(IFeignReqBean iFeignReqBean) {
    return feignHandler.;
  }
}
