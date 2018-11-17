package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Octal<Z extends Element> implements CustomAttributeGroup<Octal<Z>, Z>, MatchingOperationsAll1<Octal<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Octal(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOctal(this);
   }

   public Octal(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOctal(this);
   }

   protected Octal(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOctal(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOctal(this);
      return this.parent;
   }

   public final Octal<Z> dynamic(Consumer<Octal<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Octal<Z> of(Consumer<Octal<Z>> consumer) {
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
      return "octal";
   }

   public final Octal<Z> self() {
      return this;
   }

   public final Octal<Z> attrThreeDigits(Integer attrThreeDigits) {
      AttrThreeDigitsInteger.validateRestrictions(attrThreeDigits);
      this.visitor.visitAttributeThreeDigits(attrThreeDigits.toString());
      return this;
   }
}
