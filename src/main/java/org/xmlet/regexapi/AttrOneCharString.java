package org.xmlet.regexapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.RestrictionValidator;

public final class AttrOneCharString {
   public static void validateRestrictions(String var0) {
      RestrictionValidator.validateLength(1, var0);
   }
}
