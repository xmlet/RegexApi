package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NoBoundary<Z extends Element> implements CustomAttributeGroup<NoBoundary<Z>, Z>, MatchingOperationsAll1<NoBoundary<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NoBoundary(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNoBoundary(this);
   }

   public NoBoundary(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNoBoundary(this);
   }

   protected NoBoundary(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNoBoundary(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNoBoundary(this);
      return this.parent;
   }

   public final NoBoundary<Z> dynamic(Consumer<NoBoundary<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NoBoundary<Z> of(Consumer<NoBoundary<Z>> consumer) {
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
      return "noBoundary";
   }

   public final NoBoundary<Z> self() {
      return this;
   }
}
