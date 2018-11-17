package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Hexadecimal<Z extends Element> implements CustomAttributeGroup<Hexadecimal<Z>, Z>, MatchingOperationsAll1<Hexadecimal<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Hexadecimal(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementHexadecimal(this);
   }

   public Hexadecimal(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementHexadecimal(this);
   }

   protected Hexadecimal(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementHexadecimal(this);
      }

   }

   public Z __() {
      this.visitor.visitParentHexadecimal(this);
      return this.parent;
   }

   public final Hexadecimal<Z> dynamic(Consumer<Hexadecimal<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Hexadecimal<Z> of(Consumer<Hexadecimal<Z>> consumer) {
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
      return "hexadecimal";
   }

   public final Hexadecimal<Z> self() {
      return this;
   }

   public final Hexadecimal<Z> attrTwoDigits(Integer attrTwoDigits) {
      AttrTwoDigitsInteger.validateRestrictions(attrTwoDigits);
      this.visitor.visitAttributeTwoDigits(attrTwoDigits.toString());
      return this;
   }
}
