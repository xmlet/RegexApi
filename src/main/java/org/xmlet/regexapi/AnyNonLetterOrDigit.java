package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyNonLetterOrDigit<Z extends Element> implements CustomAttributeGroup<AnyNonLetterOrDigit<Z>, Z>, MatchingOperationsAll1<AnyNonLetterOrDigit<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyNonLetterOrDigit(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyNonLetterOrDigit(this);
   }

   public AnyNonLetterOrDigit(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyNonLetterOrDigit(this);
   }

   protected AnyNonLetterOrDigit(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyNonLetterOrDigit(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyNonLetterOrDigit(this);
      return this.parent;
   }

   public final AnyNonLetterOrDigit<Z> dynamic(Consumer<AnyNonLetterOrDigit<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyNonLetterOrDigit<Z> of(Consumer<AnyNonLetterOrDigit<Z>> consumer) {
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
      return "anyNonLetterOrDigit";
   }

   public final AnyNonLetterOrDigit<Z> self() {
      return this;
   }
}
