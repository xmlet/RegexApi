package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfMatchComplete<Z extends Element> implements CustomAttributeGroup<IfMatchComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfMatchComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfMatchComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfMatchComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfMatchComplete(this);
      return this.parent;
   }

   public final IfMatchComplete<Z> dynamic(Consumer<IfMatchComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfMatchComplete<Z> of(Consumer<IfMatchComplete<Z>> consumer) {
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
      return "ifMatch";
   }

   public final IfMatchComplete<Z> self() {
      return this;
   }
}
