package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.result.HttpResult;

/**
 * handle query quests
 *
 * @param <T> bean used to construct http request transmitted by feign
 */
public interface IQueryHandler<T> extends IProcessHandler {

  HttpResult handleQuery(T t);

}
