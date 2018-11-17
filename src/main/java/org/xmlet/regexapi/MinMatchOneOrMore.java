package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class MinMatchOneOrMore<Z extends Element> implements CustomAttributeGroup<MinMatchOneOrMore<Z>, Z>, MatchingOperationsAll1<MinMatchOneOrMore<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchOneOrMore(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementMinMatchOneOrMore(this);
   }

   public MinMatchOneOrMore(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementMinMatchOneOrMore(this);
   }

   protected MinMatchOneOrMore(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementMinMatchOneOrMore(this);
      }

   }

   public Z __() {
      this.visitor.visitParentMinMatchOneOrMore(this);
      return this.parent;
   }

   public final MinMatchOneOrMore<Z> dynamic(Consumer<MinMatchOneOrMore<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchOneOrMore<Z> of(Consumer<MinMatchOneOrMore<Z>> consumer) {
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
      return "minMatchOneOrMore";
   }

   public final MinMatchOneOrMore<Z> self() {
      return this;
   }
}
