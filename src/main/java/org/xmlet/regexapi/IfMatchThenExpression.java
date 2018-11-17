package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfMatchThenExpression<Z extends Element> implements CustomAttributeGroup<IfMatchThenExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfMatchThenExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfMatchThenExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfMatchThenExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfMatchThenExpression(this);
      return this.parent;
   }

   public final IfMatchThenExpression<Z> dynamic(Consumer<IfMatchThenExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfMatchThenExpression<Z> of(Consumer<IfMatchThenExpression<Z>> consumer) {
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

   public final IfMatchThenExpression<Z> self() {
      return this;
   }

   public IfMatchComplete<Z> elseExpression(String elseExpression) {
      ((ElseExpression)(new ElseExpression(this, this.visitor, true)).text(elseExpression)).__();
      return new IfMatchComplete(this.parent, this.visitor, true);
   }
}
