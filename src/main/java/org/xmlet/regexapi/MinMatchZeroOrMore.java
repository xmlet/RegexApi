package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchZeroOrMore<Z extends Element> implements CustomAttributeGroup<MinMatchZeroOrMore<Z>, Z>, MatchingOperationsAll1<MinMatchZeroOrMore<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchZeroOrMore(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchZeroOrMore(this);
   }

   public MinMatchZeroOrMore(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchZeroOrMore(this);
   }

   protected MinMatchZeroOrMore(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchZeroOrMore(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchZeroOrMore(this);
      return this.parent;
   }

   public final MinMatchZeroOrMore<Z> dynamic(Consumer<MinMatchZeroOrMore<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchZeroOrMore<Z> of(Consumer<MinMatchZeroOrMore<Z>> consumer) {
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
      return "minMatchZeroOrMore";
   }

   public final MinMatchZeroOrMore<Z> self() {
      return this;
   }
}
