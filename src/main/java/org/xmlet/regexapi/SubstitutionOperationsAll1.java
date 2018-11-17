package org.xmlet.regexapi;

public interface SubstitutionOperationsAll1<T extends Element<T, Z>, Z extends Element> extends TextGroup<T, Z> {
   default NumberSubstitution<T> numberSubstitution() {
      return new NumberSubstitution(this.self());
   }

   default NameSubstitution<T> nameSubstitution() {
      return new NameSubstitution(this.self());
   }
}
