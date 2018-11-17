package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ZeroOrMore<Z extends Element> implements CustomAttributeGroup<ZeroOrMore<Z>, Z>, MatchingOperationsAll1<ZeroOrMore<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ZeroOrMore(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementZeroOrMore(this);
   }

   public ZeroOrMore(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementZeroOrMore(this);
   }

   protected ZeroOrMore(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementZeroOrMore(this);
      }

   }

   public Z __() {
      this.visitor.visitParentZeroOrMore(this);
      return this.parent;
   }

   public final ZeroOrMore<Z> dynamic(Consumer<ZeroOrMore<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ZeroOrMore<Z> of(Consumer<ZeroOrMore<Z>> consumer) {
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
      return "zeroOrMore";
   }

   public final ZeroOrMore<Z> self() {
      return this;
   }
}
