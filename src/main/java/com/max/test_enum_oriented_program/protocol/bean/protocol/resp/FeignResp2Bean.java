package com.max.test_enum_oriented_program.protocol.bean.protocol.resp;

import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeignResp2Bean implements IFeignRespBean {

  private String desc;

}
