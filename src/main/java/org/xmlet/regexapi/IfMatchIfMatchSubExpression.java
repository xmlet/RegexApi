package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfMatchIfMatchSubExpression<Z extends Element> implements CustomAttributeGroup<IfMatchIfMatchSubExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfMatchIfMatchSubExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfMatchIfMatchSubExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfMatchIfMatchSubExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfMatchIfMatchSubExpression(this);
      return this.parent;
   }

   public final IfMatchIfMatchSubExpression<Z> dynamic(Consumer<IfMatchIfMatchSubExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfMatchIfMatchSubExpression<Z> of(Consumer<IfMatchIfMatchSubExpression<Z>> consumer) {
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

   public final IfMatchIfMatchSubExpression<Z> self() {
      return this;
   }

   public IfMatchThenExpression<Z> thenExpression(String thenExpression) {
      ((ThenExpression)(new ThenExpression(this, this.visitor, true)).text(thenExpression)).__();
      return new IfMatchThenExpression(this.parent, this.visitor, true);
   }
}
