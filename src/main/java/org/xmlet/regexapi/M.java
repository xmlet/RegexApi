package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class M<Z extends Element> implements CustomAttributeGroup<M<Z>, Z>, TextGroup<M<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public M(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementM(this);
   }

   public M(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementM(this);
   }

   protected M(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementM(this);
      }

   }

   public Z __() {
      this.visitor.visitParentM(this);
      return this.parent;
   }

   public final M<Z> dynamic(Consumer<M<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final M<Z> of(Consumer<M<Z>> consumer) {
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
      return "m";
   }

   public final M<Z> self() {
      return this;
   }
}
