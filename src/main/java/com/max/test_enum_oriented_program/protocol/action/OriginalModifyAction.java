package com.max.test_enum_oriented_program.protocol.action;

@FunctionalInterface
public interface OriginalAction<T, U> {

  U doOriginalAction(T t);

}
