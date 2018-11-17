package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyChar<Z extends Element> implements CustomAttributeGroup<AnyChar<Z>, Z>, MatchingOperationsAll1<AnyChar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyChar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyChar(this);
   }

   public AnyChar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyChar(this);
   }

   protected AnyChar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyChar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyChar(this);
      return this.parent;
   }

   public final AnyChar<Z> dynamic(Consumer<AnyChar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyChar<Z> of(Consumer<AnyChar<Z>> consumer) {
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
      return "anyChar";
   }

   public final AnyChar<Z> self() {
      return this;
   }
}
