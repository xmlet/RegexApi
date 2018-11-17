package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Unicode<Z extends Element> implements CustomAttributeGroup<Unicode<Z>, Z>, MatchingOperationsAll1<Unicode<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Unicode(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementUnicode(this);
   }

   public Unicode(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementUnicode(this);
   }

   protected Unicode(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementUnicode(this);
      }

   }

   public Z __() {
      this.visitor.visitParentUnicode(this);
      return this.parent;
   }

   public final Unicode<Z> dynamic(Consumer<Unicode<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Unicode<Z> of(Consumer<Unicode<Z>> consumer) {
      consumer.accept(this);
      return this;
   }

   public Z getParent() {
      return this.parent;
   }

   public final ElementVisitor getVisitor() {
      return this.visitor;
   }

   public String getName() {
      return "unicode";
   }

   public final Unicode<Z> self() {
      return this;
   }

   public final Unicode<Z> attrFourDigits(Integer attrFourDigits) {
      AttrFourDigitsInteger.validateRestrictions(attrFourDigits);
      this.visitor.visitAttributeFourDigits(attrFourDigits.toString());
      return this;
   }
}
