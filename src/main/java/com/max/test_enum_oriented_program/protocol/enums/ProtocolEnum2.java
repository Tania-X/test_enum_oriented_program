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
   * 协议A
   */
  BIZ_A("sender 1", "receiver 1", "protocol 1",
      (bean) -> {
        FeignHandler feignHandler = SpringUtil.getBean(FeignHandler.class);
        return feignHandler.modify1((FeignReq1Bean) bean);
      }, (bean) -> null, (bean) -> null, FeignReq1Bean.class, null),

  /**
   * 协议B
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
   * 信息发出方
   */
  private final String sender;

  /**
   * 信息接收方
   */
  private final String receiver;

  /**
   * 协议描述
   */
  private final String protocolDesc;

  /**
   * 请求处理方法
   */
  private final OriginalModifyAction<? super IFeignReqBean> originalModifyAction;

  /**
   * 响应处理方法
   */
  private final OriginalQueryAction<? super IFeignReqBean, ? super IFeignRespBean> originalQueryAction;

  /**
   * 响应结果处理方法
   */
  private final AnalyzeAction<? super IFeignRespBean> analyzeAction;

  /**
   * 请求类class信息
   */
  private final Class<?> reqClazz;

  /**
   * 响应类class信息
   */
  private final Class<?> respClazz;

}
