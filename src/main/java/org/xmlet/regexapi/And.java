package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class And<Z extends Element> implements CustomAttributeGroup<And<Z>, Z>, MatchingOperationsAll1<And<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public And(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnd(this);
   }

   public And(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnd(this);
   }

   protected And(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnd(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnd(this);
      return this.parent;
   }

   public final And<Z> dynamic(Consumer<And<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final And<Z> of(Consumer<And<Z>> consumer) {
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
      return "and";
   }

   public final And<Z> self() {
      return this;
   }
}
