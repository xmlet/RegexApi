package org.xmlet.regexapi;

import java.util.function.Consumer;

public class MinMatchPreviousBetweenComplete<Z extends Element> implements CustomAttributeGroup<MinMatchPreviousBetweenComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public MinMatchPreviousBetweenComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public MinMatchPreviousBetweenComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected MinMatchPreviousBetweenComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentMinMatchPreviousBetweenComplete(this);
      return this.parent;
   }

   public final MinMatchPreviousBetweenComplete<Z> dynamic(Consumer<MinMatchPreviousBetweenComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final MinMatchPreviousBetweenComplete<Z> of(Consumer<MinMatchPreviousBetweenComplete<Z>> consumer) {
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
      return "minMatchPreviousBetween";
   }

   public final MinMatchPreviousBetweenComplete<Z> self() {
      return this;
   }
}
