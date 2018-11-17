package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchZeroOrOne<Z extends Element> implements CustomAttributeGroup<MinMatchZeroOrOne<Z>, Z>, MatchingOperationsAll1<MinMatchZeroOrOne<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchZeroOrOne(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchZeroOrOne(this);
   }

   public MinMatchZeroOrOne(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchZeroOrOne(this);
   }

   protected MinMatchZeroOrOne(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchZeroOrOne(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchZeroOrOne(this);
      return this.parent;
   }

   public final MinMatchZeroOrOne<Z> dynamic(Consumer<MinMatchZeroOrOne<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchZeroOrOne<Z> of(Consumer<MinMatchZeroOrOne<Z>> consumer) {
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
      return "minMatchZeroOrOne";
   }

   public final MinMatchZeroOrOne<Z> self() {
      return this;
   }
}
