package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class IfGroupMatch<Z extends Element> implements CustomAttributeGroup<IfGroupMatch<Z>, Z>, TextGroup<IfGroupMatch<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public IfGroupMatch(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementIfGroupMatch(this);
   }

   public IfGroupMatch(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementIfGroupMatch(this);
   }

   protected IfGroupMatch(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementIfGroupMatch(this);
      }

   }

   public Z __() {
      this.visitor.visitParentIfGroupMatch(this);
      return this.parent;
   }

   public final IfGroupMatch<Z> dynamic(Consumer<IfGroupMatch<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final IfGroupMatch<Z> of(Consumer<IfGroupMatch<Z>> consumer) {
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

   public final IfGroupMatch<Z> self() {
      return this;
   }

   public IfGroupMatchGroupName<Z> groupName(String groupName) {
      ((GroupName)(new GroupName(this, this.visitor, true)).text(groupName)).__();
      return new IfGroupMatchGroupName(this.parent, this.visitor, true);
   }
}
