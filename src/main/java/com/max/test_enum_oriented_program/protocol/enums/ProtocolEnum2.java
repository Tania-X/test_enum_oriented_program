package com.max.test_enum_oriented_program.protocol.enums;

import com.max.test_enum_oriented_program.protocol.action.AnalyzeAction;
import com.max.test_enum_oriented_program.protocol.action.OriginalModifyAction;
import com.max.test_enum_oriented_program.protocol.action.OriginalQueryAction;
import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq1Bean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq2Bean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.resp.FeignResp2Bean;
import com.max.test_enum_oriented_program.protocol.feign.FeignHandler;
import com.max.test_enum_oriented_program.result.HttpResult;
import com.max.test_enum_oriented_program.util.SpringUtil;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtocolEnum2 {

  /**
   * protocol A
   */
  BIZ_A("sender 1", "receiver 1", "protocol 1",
      (bean) -> {
        FeignHandler feignHandler = SpringUtil.getBean(FeignHandler.class);
        return feignHandler.modify1((FeignReq1Bean) bean);
      }, (bean) -> null, (bean) -> null, FeignReq1Bean.class, null),

  /**
   * protocol B
   */
  BIZ_B("sender 2", "receiver 2", "protocol 2",
      bean -> null,
      (bean) -> {
        FeignHandler feignHandler = SpringUtil.getBean(FeignHandler.class);
        return feignHandler.query1((FeignReq2Bean) bean);
      }, (bean) -> {
    FeignResp2Bean resultBean = (FeignResp2Bean) bean;
    HttpResult httpResult = new HttpResult();
    // do handle resultBean with this httpResult instance
    return httpResult;
  }, FeignReq2Bean.class, FeignResp2Bean.class),

  ;

  /**
   * message sender
   */
  private final String sender;

  /**
   * message receiver
   */
  private final String receiver;

  /**
   * protocol description
   */
  private final String protocolDesc;

  /**
   * request handler method
   */
  private final OriginalModifyAction<? super IFeignReqBean> originalModifyAction;

  /**
   * response handler method
   */
  private final OriginalQueryAction<? super IFeignReqBean, ? super IFeignRespBean> originalQueryAction;

  /**
   * response's result handler method
   */
  private final AnalyzeAction<? super IFeignRespBean> analyzeAction;

  /**
   * request class info(be of supplementary use)
   */
  private final Class<?> reqClazz;

  /**
   * response class info(be of supplementary use)
   */
  private final Class<?> respClazz;

}
