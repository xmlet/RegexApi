package org.xmlet.regexapi;

import java.util.function.Consumer;

public class NamedSubExpressionComplete<Z extends Element> implements CustomAttributeGroup<NamedSubExpressionComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NamedSubExpressionComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public NamedSubExpressionComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected NamedSubExpressionComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentNamedSubExpressionComplete(this);
      return this.parent;
   }

   public final NamedSubExpressionComplete<Z> dynamic(Consumer<NamedSubExpressionComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NamedSubExpressionComplete<Z> of(Consumer<NamedSubExpressionComplete<Z>> consumer) {
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

   public final NamedSubExpressionComplete<Z> self() {
      return this;
   }
}
