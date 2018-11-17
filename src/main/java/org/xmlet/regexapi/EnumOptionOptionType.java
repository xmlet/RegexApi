package org.xmlet.regexapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.EnumInterface;

public enum EnumOptionOptionType implements EnumInterface<String> {
   I(String.valueOf("i")),
   M(String.valueOf("m")),
   N(String.valueOf("n")),
   S(String.valueOf("s")),
   X(String.valueOf("x"));

   private final String value;

   private EnumOptionOptionType(String var3) {
      this.value = var3;
   }

   public final String getValue() {
      return this.value;
   }
}
