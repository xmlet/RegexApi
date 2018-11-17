package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class IfMatch<Z extends Element> implements CustomAttributeGroup<IfMatch<Z>, Z>, TextGroup<IfMatch<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfMatch(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIfMatch(this);
   }

   public IfMatch(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIfMatch(this);
   }

   protected IfMatch(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIfMatch(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIfMatch(this);
      return this.parent;
   }

   public final IfMatch<Z> dynamic(Consumer<IfMatch<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfMatch<Z> of(Consumer<IfMatch<Z>> consumer) {
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
      return "ifMatch";
   }

   public final IfMatch<Z> self() {
      return this;
   }

   public IfMatchIfMatchSubExpression<Z> ifMatchSubExpression(String ifMatchSubExpression) {
      ((IfMatchSubExpression)(new IfMatchSubExpression(this, this.visitor, true)).text(ifMatchSubExpression)).__();
      return new IfMatchIfMatchSubExpression(this.parent, this.visitor, true);
   }
}
