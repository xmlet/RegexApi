package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyWhiteSpace<Z extends Element> implements CustomAttributeGroup<AnyWhiteSpace<Z>, Z>, MatchingOperationsAll1<AnyWhiteSpace<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyWhiteSpace(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyWhiteSpace(this);
   }

   public AnyWhiteSpace(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyWhiteSpace(this);
   }

   protected AnyWhiteSpace(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyWhiteSpace(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyWhiteSpace(this);
      return this.parent;
   }

   public final AnyWhiteSpace<Z> dynamic(Consumer<AnyWhiteSpace<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyWhiteSpace<Z> of(Consumer<AnyWhiteSpace<Z>> consumer) {
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
      return "anyWhiteSpace";
   }

   public final AnyWhiteSpace<Z> self() {
      return this;
   }
}
