package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class VerticalTab<Z extends Element> implements CustomAttributeGroup<VerticalTab<Z>, Z>, MatchingOperationsAll1<VerticalTab<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public VerticalTab(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementVerticalTab(this);
   }

   public VerticalTab(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementVerticalTab(this);
   }

   protected VerticalTab(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementVerticalTab(this);
      }

   }

   public Z __() {
      this.visitor.visitParentVerticalTab(this);
      return this.parent;
   }

   public final VerticalTab<Z> dynamic(Consumer<VerticalTab<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final VerticalTab<Z> of(Consumer<VerticalTab<Z>> consumer) {
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
      return "verticalTab";
   }

   public final VerticalTab<Z> self() {
      return this;
   }
}
