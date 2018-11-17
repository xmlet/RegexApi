package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NameSubstitution<Z extends Element> implements CustomAttributeGroup<NameSubstitution<Z>, Z>, SubstitutionOperationsAll1<NameSubstitution<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NameSubstitution(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNameSubstitution(this);
   }

   public NameSubstitution(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNameSubstitution(this);
   }

   protected NameSubstitution(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNameSubstitution(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNameSubstitution(this);
      return this.parent;
   }

   public final NameSubstitution<Z> dynamic(Consumer<NameSubstitution<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NameSubstitution<Z> of(Consumer<NameSubstitution<Z>> consumer) {
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
      return "nameSubstitution";
   }

   public final NameSubstitution<Z> self() {
      return this;
   }

   public final NameSubstitution<Z> attrSubstitutionName(String attrSubstitutionName) {
      this.visitor.visitAttributeSubstitutionName(attrSubstitutionName);
      return this;
   }
}
