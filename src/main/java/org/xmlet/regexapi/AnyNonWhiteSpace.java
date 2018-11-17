package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyNonWhiteSpace<Z extends Element> implements CustomAttributeGroup<AnyNonWhiteSpace<Z>, Z>, MatchingOperationsAll1<AnyNonWhiteSpace<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyNonWhiteSpace(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyNonWhiteSpace(this);
   }

   public AnyNonWhiteSpace(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyNonWhiteSpace(this);
   }

   protected AnyNonWhiteSpace(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyNonWhiteSpace(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyNonWhiteSpace(this);
      return this.parent;
   }

   public final AnyNonWhiteSpace<Z> dynamic(Consumer<AnyNonWhiteSpace<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyNonWhiteSpace<Z> of(Consumer<AnyNonWhiteSpace<Z>> consumer) {
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
      return "anyNonWhiteSpace";
   }

   public final AnyNonWhiteSpace<Z> self() {
      return this;
   }
}
