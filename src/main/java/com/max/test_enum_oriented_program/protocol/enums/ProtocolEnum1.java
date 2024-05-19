package com.max.test_enum_oriented_program.protocol.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtocolEnum1 {

  /**
   * protocol A
   */
  BIZ_A("sender 1", "receiver 1", "protocol 1"),

  /**
   * protocol B
   */
  BIZ_B("sender 2", "receiver 2", "protocol 2"),

  /**
   * protocol C
   */
  BIZ_C("sender 3", "receiver 2", "protocol 3"),

  ;

  /**
   * message sender
   */
  private final String sender;

  /**
   * message receiver
   */
  private final String receiver;

  /**
   * protocol description
   */
  private final String protocolDesc;

}
