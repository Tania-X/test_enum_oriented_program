package com.max.test_enum_oriented_program.result;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HttpResult implements IFeignReqBean, IFeignRespBean {

  private Object data;

  private String msg;

  private String code;

}
