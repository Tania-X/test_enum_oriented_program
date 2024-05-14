package com.max.test_enum_oriented_program.protocol.feign;

import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq1Bean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.req.FeignReq2Bean;
import com.max.test_enum_oriented_program.protocol.bean.protocol.resp.FeignResp2Bean;
import com.max.test_enum_oriented_program.result.HttpResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public interface FeignHandler {

  @PostMapping
  HttpResult modify1(FeignReq1Bean bean);

  @GetMapping
  FeignResp2Bean query1(FeignReq2Bean bean);

}
