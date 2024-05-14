package com.max.test_enum_oriented_program.protocol.action;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.result.HttpResult;

@FunctionalInterface
public interface OriginalModifyAction<T extends IFeignReqBean> {

  HttpResult doOriginalAction(T t);

}
