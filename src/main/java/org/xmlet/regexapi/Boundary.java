package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Boundary<Z extends Element> implements CustomAttributeGroup<Boundary<Z>, Z>, MatchingOperationsAll1<Boundary<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Boundary(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBoundary(this);
   }

   public Boundary(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBoundary(this);
   }

   protected Boundary(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBoundary(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBoundary(this);
      return this.parent;
   }

   public final Boundary<Z> dynamic(Consumer<Boundary<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Boundary<Z> of(Consumer<Boundary<Z>> consumer) {
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
      return "boundary";
   }

   public final Boundary<Z> self() {
      return this;
   }
}
