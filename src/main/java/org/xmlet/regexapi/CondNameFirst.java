package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class CondNameFirst<Z extends Element> implements CustomAttributeGroup<CondNameFirst<Z>, Z>, TextGroup<CondNameFirst<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public CondNameFirst(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementCondNameFirst(this);
   }

   public CondNameFirst(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementCondNameFirst(this);
   }

   protected CondNameFirst(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementCondNameFirst(this);
      }

   }

   public Z __() {
      this.visitor.visitParentCondNameFirst(this);
      return this.parent;
   }

   public final CondNameFirst<Z> dynamic(Consumer<CondNameFirst<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final CondNameFirst<Z> of(Consumer<CondNameFirst<Z>> consumer) {
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
      return "condNameFirst";
   }

   public final CondNameFirst<Z> self() {
      return this;
   }
}
