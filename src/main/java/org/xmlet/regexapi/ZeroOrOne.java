package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ZeroOrOne<Z extends Element> implements CustomAttributeGroup<ZeroOrOne<Z>, Z>, MatchingOperationsAll1<ZeroOrOne<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ZeroOrOne(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementZeroOrOne(this);
   }

   public ZeroOrOne(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementZeroOrOne(this);
   }

   protected ZeroOrOne(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementZeroOrOne(this);
      }

   }

   public Z __() {
      this.visitor.visitParentZeroOrOne(this);
      return this.parent;
   }

   public final ZeroOrOne<Z> dynamic(Consumer<ZeroOrOne<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ZeroOrOne<Z> of(Consumer<ZeroOrOne<Z>> consumer) {
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
      return "zeroOrOne";
   }

   public final ZeroOrOne<Z> self() {
      return this;
   }
}
