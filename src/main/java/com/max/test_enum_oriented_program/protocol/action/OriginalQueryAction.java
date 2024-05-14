package com.max.test_enum_oriented_program.protocol.action;

import com.max.test_enum_oriented_program.protocol.bean.IFeignReqBean;
import com.max.test_enum_oriented_program.protocol.bean.IFeignRespBean;

@FunctionalInterface
public interface OriginalQueryAction<T extends IFeignReqBean, U extends IFeignRespBean> {

  U doOriginalQueryAction(T t);

}
