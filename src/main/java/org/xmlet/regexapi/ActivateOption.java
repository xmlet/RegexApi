package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ActivateOption<Z extends Element> implements CustomAttributeGroup<ActivateOption<Z>, Z>, MatchingOperationsAll1<ActivateOption<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ActivateOption(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementActivateOption(this);
   }

   public ActivateOption(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementActivateOption(this);
   }

   protected ActivateOption(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementActivateOption(this);
      }

   }

   public Z __() {
      this.visitor.visitParentActivateOption(this);
      return this.parent;
   }

   public final ActivateOption<Z> dynamic(Consumer<ActivateOption<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ActivateOption<Z> of(Consumer<ActivateOption<Z>> consumer) {
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
      return "activateOption";
   }

   public final ActivateOption<Z> self() {
      return this;
   }

   public final ActivateOption<Z> attrOption(EnumOptionOptionType attrOption) {
      this.visitor.visitAttributeOption(attrOption.getValue());
      return this;
   }
}
