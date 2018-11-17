package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class OneOrMore<Z extends Element> implements CustomAttributeGroup<OneOrMore<Z>, Z>, MatchingOperationsAll1<OneOrMore<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public OneOrMore(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOneOrMore(this);
   }

   public OneOrMore(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOneOrMore(this);
   }

   protected OneOrMore(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOneOrMore(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOneOrMore(this);
      return this.parent;
   }

   public final OneOrMore<Z> dynamic(Consumer<OneOrMore<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final OneOrMore<Z> of(Consumer<OneOrMore<Z>> consumer) {
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
      return "oneOrMore";
   }

   public final OneOrMore<Z> self() {
      return this;
   }
}
