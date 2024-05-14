package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.result.HttpResult;

public interface IModifyHandler<T> extends IProcessHandler {

  HttpResult handleModify(T t);

}
