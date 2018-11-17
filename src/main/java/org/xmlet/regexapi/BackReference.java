package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class BackReference<Z extends Element> implements CustomAttributeGroup<BackReference<Z>, Z>, MatchingOperationsAll1<BackReference<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public BackReference(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementBackReference(this);
   }

   public BackReference(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementBackReference(this);
   }

   protected BackReference(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementBackReference(this);
      }

   }

   public Z __() {
      this.visitor.visitParentBackReference(this);
      return this.parent;
   }

   public final BackReference<Z> dynamic(Consumer<BackReference<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final BackReference<Z> of(Consumer<BackReference<Z>> consumer) {
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
      return "backReference";
   }

   public final BackReference<Z> self() {
      return this;
   }

   public final BackReference<Z> attrNumber(Integer attrNumber) {
      this.visitor.visitAttributeNumber(attrNumber.toString());
      return this;
   }
}
