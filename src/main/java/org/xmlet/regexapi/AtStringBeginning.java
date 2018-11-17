package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AtStringBeginning<Z extends Element> implements CustomAttributeGroup<AtStringBeginning<Z>, Z>, MatchingOperationsAll1<AtStringBeginning<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AtStringBeginning(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAtStringBeginning(this);
   }

   public AtStringBeginning(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAtStringBeginning(this);
   }

   protected AtStringBeginning(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAtStringBeginning(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAtStringBeginning(this);
      return this.parent;
   }

   public final AtStringBeginning<Z> dynamic(Consumer<AtStringBeginning<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AtStringBeginning<Z> of(Consumer<AtStringBeginning<Z>> consumer) {
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
      return "atStringBeginning";
   }

   public final AtStringBeginning<Z> self() {
      return this;
   }
}
