package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NamedSubExpression<Z extends Element> implements CustomAttributeGroup<NamedSubExpression<Z>, Z>, TextGroup<NamedSubExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NamedSubExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNamedSubExpression(this);
   }

   public NamedSubExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNamedSubExpression(this);
   }

   protected NamedSubExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNamedSubExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNamedSubExpression(this);
      return this.parent;
   }

   public final NamedSubExpression<Z> dynamic(Consumer<NamedSubExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NamedSubExpression<Z> of(Consumer<NamedSubExpression<Z>> consumer) {
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

   public final NamedSubExpression<Z> self() {
      return this;
   }

   public NamedSubExpressionNameFirst<Z> nameFirst(String nameFirst) {
      ((NameFirst)(new NameFirst(this, this.visitor, true)).text(nameFirst)).__();
      return new NamedSubExpressionNameFirst(this.parent, this.visitor, true);
   }
}
