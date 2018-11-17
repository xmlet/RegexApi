package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfGroupMatchGroupName<Z extends Element> implements CustomAttributeGroup<IfGroupMatchGroupName<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfGroupMatchGroupName(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfGroupMatchGroupName(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfGroupMatchGroupName(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfGroupMatchGroupName(this);
      return this.parent;
   }

   public final IfGroupMatchGroupName<Z> dynamic(Consumer<IfGroupMatchGroupName<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfGroupMatchGroupName<Z> of(Consumer<IfGroupMatchGroupName<Z>> consumer) {
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

   public final IfGroupMatchGroupName<Z> self() {
      return this;
   }

   public IfGroupMatchThenExpression<Z> thenExpression(String thenExpression) {
      ((ThenExpression)(new ThenExpression(this, this.visitor, true)).text(thenExpression)).__();
      return new IfGroupMatchThenExpression(this.parent, this.visitor, true);
   }
}
