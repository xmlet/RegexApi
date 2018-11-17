package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyNonDigit<Z extends Element> implements CustomAttributeGroup<AnyNonDigit<Z>, Z>, MatchingOperationsAll1<AnyNonDigit<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyNonDigit(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyNonDigit(this);
   }

   public AnyNonDigit(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyNonDigit(this);
   }

   protected AnyNonDigit(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyNonDigit(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyNonDigit(this);
      return this.parent;
   }

   public final AnyNonDigit<Z> dynamic(Consumer<AnyNonDigit<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyNonDigit<Z> of(Consumer<AnyNonDigit<Z>> consumer) {
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
      return "anyNonDigit";
   }

   public final AnyNonDigit<Z> self() {
      return this;
   }
}
