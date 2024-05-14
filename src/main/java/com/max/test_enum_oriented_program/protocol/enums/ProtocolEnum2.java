package com.max.test_enum_oriented_program.protocol.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProtocolEnum1 {

  BIZ_A("sender 1", "receiver 1", "protocol 1"),
  BIZ_B("sender 2", "receiver 2", "protocol 2"),
  BIZ_C("sender 3", "receiver 2", "protocol 3"),

  ;

  /**
   * 信息发出方
   */
  private final String sender;

  /**
   * 信息接收方
   */
  private final String receiver;

  /**
   * 协议描述
   */
  private final String protocolDesc;

}
