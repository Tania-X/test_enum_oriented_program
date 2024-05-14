package com.max.test_enum_oriented_program.protocol.action;

@FunctionalInterface
public interface SecondaryAction<T, U> {

  U doSecondaryAction(T t);

}
