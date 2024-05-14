package com.max.test_enum_oriented_program.protocol.bean.protocol.req;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeignReq1Bean implements IFeignReqBean {

  private String desc;

}
