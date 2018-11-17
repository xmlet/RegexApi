package org.xmlet.regexapi;

import java.util.function.Consumer;

public class NamedSubExpressionNameFirst<Z extends Element> implements CustomAttributeGroup<NamedSubExpressionNameFirst<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NamedSubExpressionNameFirst(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public NamedSubExpressionNameFirst(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected NamedSubExpressionNameFirst(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentNamedSubExpressionNameFirst(this);
      return this.parent;
   }

   public final NamedSubExpressionNameFirst<Z> dynamic(Consumer<NamedSubExpressionNameFirst<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NamedSubExpressionNameFirst<Z> of(Consumer<NamedSubExpressionNameFirst<Z>> consumer) {
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
      return "namedSubExpression";
   }

   public final NamedSubExpressionNameFirst<Z> self() {
      return this;
   }

   public NamedSubExpressionComplete<Z> expression(String expression) {
      ((Expression)(new Expression(this, this.visitor, true)).text(expression)).__();
      return new NamedSubExpressionComplete(this.parent, this.visitor, true);
   }
}
