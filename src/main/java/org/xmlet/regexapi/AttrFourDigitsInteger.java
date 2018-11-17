package org.xmlet.regexapi;

import org.xmlet.xsdasmfaster.classes.infrastructure.RestrictionValidator;

public final class AttrFourDigitsInteger {
   public static void validateRestrictions(Integer var0) {
      RestrictionValidator.validateMaxInclusive(9999.0D, var0.doubleValue());
      RestrictionValidator.validateMinInclusive(0.0D, var0.doubleValue());
   }
}
