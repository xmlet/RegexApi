package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class AtBeginning<Z extends Element> implements CustomAttributeGroup<AtBeginning<Z>, Z>, MatchingOperationsAll1<AtBeginning<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public AtBeginning(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementAtBeginning(this);
   }

   public AtBeginning(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementAtBeginning(this);
   }

   protected AtBeginning(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementAtBeginning(this);
      }

   }

   public Z __() {
      this.visitor.visitParentAtBeginning(this);
      return this.parent;
   }

   public final AtBeginning<Z> dynamic(Consumer<AtBeginning<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final AtBeginning<Z> of(Consumer<AtBeginning<Z>> consumer) {
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
      return "atBeginning";
   }

   public final AtBeginning<Z> self() {
      return this;
   }
}
