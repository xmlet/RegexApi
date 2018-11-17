package org.xmlet.regexapi;

import java.util.function.Consumer;

public class IfGroupMatchComplete<Z extends Element> implements CustomAttributeGroup<IfGroupMatchComplete<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfGroupMatchComplete(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
   }

   public IfGroupMatchComplete(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
   }

   protected IfGroupMatchComplete(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
   }

   public Z __() {
      this.visitor.visitParentIfGroupMatchComplete(this);
      return this.parent;
   }

   public final IfGroupMatchComplete<Z> dynamic(Consumer<IfGroupMatchComplete<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfGroupMatchComplete<Z> of(Consumer<IfGroupMatchComplete<Z>> consumer) {
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

   public final IfGroupMatchComplete<Z> self() {
      return this;
   }
}
