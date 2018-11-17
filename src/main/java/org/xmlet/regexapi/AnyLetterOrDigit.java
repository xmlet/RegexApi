package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AnyLetterOrDigit<Z extends Element> implements CustomAttributeGroup<AnyLetterOrDigit<Z>, Z>, MatchingOperationsAll1<AnyLetterOrDigit<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AnyLetterOrDigit(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAnyLetterOrDigit(this);
   }

   public AnyLetterOrDigit(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAnyLetterOrDigit(this);
   }

   protected AnyLetterOrDigit(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAnyLetterOrDigit(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAnyLetterOrDigit(this);
      return this.parent;
   }

   public final AnyLetterOrDigit<Z> dynamic(Consumer<AnyLetterOrDigit<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AnyLetterOrDigit<Z> of(Consumer<AnyLetterOrDigit<Z>> consumer) {
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
      return "anyLetterOrDigit";
   }

   public final AnyLetterOrDigit<Z> self() {
      return this;
   }
}
