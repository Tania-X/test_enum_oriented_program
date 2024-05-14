package com.max.test_enum_oriented_program.protocol.action;

import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;
import com.max.test_enum_oriented_program.result.HttpResult;

@FunctionalInterface
public interface AnalyzeAction<T extends IFeignRespBean> {

  HttpResult doAnalyzeAction(T t);

}
