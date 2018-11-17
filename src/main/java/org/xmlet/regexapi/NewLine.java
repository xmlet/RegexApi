package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class NewLine<Z extends Element> implements CustomAttributeGroup<NewLine<Z>, Z>, MatchingOperationsAll1<NewLine<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public NewLine(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementNewLine(this);
   }

   public NewLine(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementNewLine(this);
   }

   protected NewLine(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementNewLine(this);
      }

   }

   public Z __() {
      this.visitor.visitParentNewLine(this);
      return this.parent;
   }

   public final NewLine<Z> dynamic(Consumer<NewLine<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final NewLine<Z> of(Consumer<NewLine<Z>> consumer) {
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
      return "newLine";
   }

   public final NewLine<Z> self() {
      return this;
   }
}
