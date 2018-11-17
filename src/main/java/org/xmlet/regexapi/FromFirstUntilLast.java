package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class FromFirstUntilLast<Z extends Element> implements CustomAttributeGroup<FromFirstUntilLast<Z>, Z>, MatchingOperationsAll1<FromFirstUntilLast<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public FromFirstUntilLast(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFromFirstUntilLast(this);
   }

   public FromFirstUntilLast(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFromFirstUntilLast(this);
   }

   protected FromFirstUntilLast(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFromFirstUntilLast(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFromFirstUntilLast(this);
      return this.parent;
   }

   public final FromFirstUntilLast<Z> dynamic(Consumer<FromFirstUntilLast<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final FromFirstUntilLast<Z> of(Consumer<FromFirstUntilLast<Z>> consumer) {
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
      return "fromFirstUntilLast";
   }

   public final FromFirstUntilLast<Z> self() {
      return this;
   }

   public final FromFirstUntilLast<Z> attrFirst(String attrFirst) {
      this.visitor.visitAttributeFirst(attrFirst);
      return this;
   }

   public final FromFirstUntilLast<Z> attrLast(String attrLast) {
      this.visitor.visitAttributeLast(attrLast);
      return this;
   }
}
