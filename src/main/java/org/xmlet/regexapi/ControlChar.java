package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ControlChar<Z extends Element> implements CustomAttributeGroup<ControlChar<Z>, Z>, MatchingOperationsAll1<ControlChar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ControlChar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementControlChar(this);
   }

   public ControlChar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementControlChar(this);
   }

   protected ControlChar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementControlChar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentControlChar(this);
      return this.parent;
   }

   public final ControlChar<Z> dynamic(Consumer<ControlChar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ControlChar<Z> of(Consumer<ControlChar<Z>> consumer) {
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
      return "controlChar";
   }

   public final ControlChar<Z> self() {
      return this;
   }

   public final ControlChar<Z> attrOneChar(String attrOneChar) {
      AttrOneCharString.validateRestrictions(attrOneChar);
      this.visitor.visitAttributeOneChar(attrOneChar);
      return this;
   }
}
