package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyDigit<Z extends Element> implements CustomAttributeGroup<AnyDigit<Z>, Z>, MatchingOperationsAll1<AnyDigit<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyDigit(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyDigit(this);
   }

   public AnyDigit(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyDigit(this);
   }

   protected AnyDigit(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyDigit(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyDigit(this);
      return this.parent;
   }

   public final AnyDigit<Z> dynamic(Consumer<AnyDigit<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyDigit<Z> of(Consumer<AnyDigit<Z>> consumer) {
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
      return "anyDigit";
   }

   public final AnyDigit<Z> self() {
      return this;
   }
}
