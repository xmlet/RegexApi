package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class FormFeed<Z extends Element> implements CustomAttributeGroup<FormFeed<Z>, Z>, MatchingOperationsAll1<FormFeed<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public FormFeed(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementFormFeed(this);
   }

   public FormFeed(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementFormFeed(this);
   }

   protected FormFeed(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementFormFeed(this);
      }

   }

   public Z __() {
      this.visitor.visitParentFormFeed(this);
      return this.parent;
   }

   public final FormFeed<Z> dynamic(Consumer<FormFeed<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final FormFeed<Z> of(Consumer<FormFeed<Z>> consumer) {
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
      return "formFeed";
   }

   public final FormFeed<Z> self() {
      return this;
   }
}
