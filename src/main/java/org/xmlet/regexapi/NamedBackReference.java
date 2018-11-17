package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NamedBackReference<Z extends Element> implements CustomAttributeGroup<NamedBackReference<Z>, Z>, MatchingOperationsAll1<NamedBackReference<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NamedBackReference(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNamedBackReference(this);
   }

   public NamedBackReference(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNamedBackReference(this);
   }

   protected NamedBackReference(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNamedBackReference(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNamedBackReference(this);
      return this.parent;
   }

   public final NamedBackReference<Z> dynamic(Consumer<NamedBackReference<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NamedBackReference<Z> of(Consumer<NamedBackReference<Z>> consumer) {
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
      return "namedBackReference";
   }

   public final NamedBackReference<Z> self() {
      return this;
   }

   public final NamedBackReference<Z> attrName(String attrName) {
      this.visitor.visitAttributeName(attrName);
      return this;
   }
}
