package com.max.test_enum_oriented_program.protocol;

import com.max.test_enum_oriented_program.result.HttpResult;

/**
 * handle modify quests
 *
 * @param <T> bean used to construct http request transmitted by feign
 */
public interface IModifyHandler<T> extends IProcessHandler {

  HttpResult handleModify(T t);

}
