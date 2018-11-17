package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class OtherChar<Z extends Element> implements CustomAttributeGroup<OtherChar<Z>, Z>, MatchingOperationsAll1<OtherChar<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public OtherChar(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementOtherChar(this);
   }

   public OtherChar(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementOtherChar(this);
   }

   protected OtherChar(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementOtherChar(this);
      }

   }

   public Z __() {
      this.visitor.visitParentOtherChar(this);
      return this.parent;
   }

   public final OtherChar<Z> dynamic(Consumer<OtherChar<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final OtherChar<Z> of(Consumer<OtherChar<Z>> consumer) {
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
      return "otherChar";
   }

   public final OtherChar<Z> self() {
      return this;
   }

   public final OtherChar<Z> attrOneChar(String attrOneChar) {
      AttrOneCharString.validateRestrictions(attrOneChar);
      this.visitor.visitAttributeOneChar(attrOneChar);
      return this;
   }
}
