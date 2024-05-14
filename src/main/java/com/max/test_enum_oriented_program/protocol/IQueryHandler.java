package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.result.HttpResult;

public interface IQueryHandler<T> extends IProcessHandler {

  HttpResult handleQuery(T t);

}
