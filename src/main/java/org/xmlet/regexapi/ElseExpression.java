package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class ElseExpression<Z extends Element> implements CustomAttributeGroup<ElseExpression<Z>, Z>, TextGroup<ElseExpression<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public ElseExpression(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementElseExpression(this);
   }

   public ElseExpression(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementElseExpression(this);
   }

   protected ElseExpression(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementElseExpression(this);
      }

   }

   public Z __() {
      this.visitor.visitParentElseExpression(this);
      return this.parent;
   }

   public final ElseExpression<Z> dynamic(Consumer<ElseExpression<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final ElseExpression<Z> of(Consumer<ElseExpression<Z>> consumer) {
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
      return "elseExpression";
   }

   public final ElseExpression<Z> self() {
      return this;
   }
}
