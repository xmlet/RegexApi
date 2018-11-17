package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NumberSubstitution<Z extends Element> implements CustomAttributeGroup<NumberSubstitution<Z>, Z>, SubstitutionOperationsAll1<NumberSubstitution<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NumberSubstitution(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNumberSubstitution(this);
   }

   public NumberSubstitution(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNumberSubstitution(this);
   }

   protected NumberSubstitution(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNumberSubstitution(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNumberSubstitution(this);
      return this.parent;
   }

   public final NumberSubstitution<Z> dynamic(Consumer<NumberSubstitution<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NumberSubstitution<Z> of(Consumer<NumberSubstitution<Z>> consumer) {
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
      return "numberSubstitution";
   }

   public final NumberSubstitution<Z> self() {
      return this;
   }

   public final NumberSubstitution<Z> attrNumber(Integer attrNumber) {
      this.visitor.visitAttributeNumber(attrNumber.toString());
      return this;
   }
}
