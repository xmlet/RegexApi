package org.xmlet.regexapi;

import java.util.function.Consumer;

public final class GroupName<Z extends Element> implements CustomAttributeGroup<GroupName<Z>, Z>, TextGroup<GroupName<Z>, Z> {
   protected final Z parent;
   protected final ElementVisitor visitor;

   public GroupName(ElementVisitor visitor) {
      this.visitor = visitor;
      this.parent = null;
      visitor.visitElementGroupName(this);
   }

   public GroupName(Z parent) {
      this.parent = parent;
      this.visitor = parent.getVisitor();
      this.visitor.visitElementGroupName(this);
   }

   protected GroupName(Z parent, ElementVisitor visitor, boolean shouldVisit) {
      this.parent = parent;
      this.visitor = visitor;
      if (shouldVisit) {
         visitor.visitElementGroupName(this);
      }

   }

   public Z __() {
      this.visitor.visitParentGroupName(this);
      return this.parent;
   }

   public final GroupName<Z> dynamic(Consumer<GroupName<Z>> consumer) {
      this.visitor.visitOpenDynamic();
      consumer.accept(this);
      this.visitor.visitCloseDynamic();
      return this;
   }

   public final GroupName<Z> of(Consumer<GroupName<Z>> consumer) {
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
      return "groupName";
   }

   public final GroupName<Z> self() {
      return this;
   }
}
