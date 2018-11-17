package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class Or<Z extends Element> implements CustomAttributeGroup<Or<Z>, Z>, MatchingOperationsAll1<Or<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public Or(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOr(this);
   }

   public Or(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOr(this);
   }

   protected Or(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOr(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOr(this);
      return this.parent;
   }

   public final Or<Z> dynamic(Consumer<Or<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final Or<Z> of(Consumer<Or<Z>> consumer) {
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
      return "or";
   }

   public final Or<Z> self() {
      return this;
   }
}
