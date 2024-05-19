package com.max.test_enum_oriented_program.protocol.hierarchy.query;

import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq2Bean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.resp.FeignResp2Bean;
import com.max.test_enum_oriented_program.protocol.enums.ProtocolEnum1;
import com.max.test_enum_oriented_program.protocol.feign.FeignHandler;
import com.max.test_enum_oriented_program.protocol.hierarchy.AbstractQueryHandler;
import com.max.test_enum_oriented_program.result.HttpResult;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;

public class Biz2QueryHandler extends AbstractQueryHandler<FeignReq2Bean, FeignResp2Bean> {

  @Resource
  private FeignHandler feignHandler;

  @PostConstruct
  public void init() {
    super.protocolEnum1 = ProtocolEnum1.BIZ_B;
  }

  @Override
  protected FeignResp2Bean doHandleQuery(FeignReq2Bean bean) {
    return feignHandler.query1(bean);
  }

  @Override
  protected HttpResult doHandleAnalyze(FeignResp2Bean bean) {
    HttpResult httpResult = new HttpResult();
    // do handle resultBean with this httpResult instance
    return httpResult;
  }

}
