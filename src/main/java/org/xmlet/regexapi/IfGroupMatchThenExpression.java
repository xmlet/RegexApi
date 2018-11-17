package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfGroupMatchThenExpression<Z extends Element> implements CustomAttributeGroup<IfGroupMatchThenExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfGroupMatchThenExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfGroupMatchThenExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfGroupMatchThenExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfGroupMatchThenExpression(this);
      return this.parent;
   }

   public final IfGroupMatchThenExpression<Z> dynamic(Consumer<IfGroupMatchThenExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfGroupMatchThenExpression<Z> of(Consumer<IfGroupMatchThenExpression<Z>> consumer) {
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
      return "ifGroupMatch";
   }

   public final IfGroupMatchThenExpression<Z> self() {
      return this;
   }

   public IfGroupMatchComplete<Z> elseExpression(String elseExpression) {
      ((ElseExpression)(new ElseExpression(this, this.visitor, true)).text(elseExpression)).__();
      return new IfGroupMatchComplete(this.parent, this.visitor, true);
   }
}
