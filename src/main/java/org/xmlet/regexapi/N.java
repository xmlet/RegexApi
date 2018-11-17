package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class N<Z extends Element> implements CustomAttributeGroup<N<Z>, Z>, TextGroup<N<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public N(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementN(this);
   }

   public N(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementN(this);
   }

   protected N(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementN(this);
      }

   }

   public Z __() {
      this.visitor.visitParentN(this);
      return this.parent;
   }

   public final N<Z> dynamic(Consumer<N<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final N<Z> of(Consumer<N<Z>> consumer) {
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
      return "n";
   }

   public final N<Z> self() {
      return this;
   }
}
