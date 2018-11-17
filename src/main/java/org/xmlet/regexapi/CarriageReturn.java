package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CarriageReturn<Z extends Element> implements CustomAttributeGroup<CarriageReturn<Z>, Z>, MatchingOperationsAll1<CarriageReturn<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CarriageReturn(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCarriageReturn(this);
   }

   public CarriageReturn(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCarriageReturn(this);
   }

   protected CarriageReturn(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCarriageReturn(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCarriageReturn(this);
      return this.parent;
   }

   public final CarriageReturn<Z> dynamic(Consumer<CarriageReturn<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CarriageReturn<Z> of(Consumer<CarriageReturn<Z>> consumer) {
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
      return "carriageReturn";
   }

   public final CarriageReturn<Z> self() {
      return this;
   }
}
