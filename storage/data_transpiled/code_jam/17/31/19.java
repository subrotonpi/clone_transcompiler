static final Comparator < List < Pair < Integer , Integer >>> COMPARATOR = new Comparator < List < Pair < Integer , Integer >>> ( ) {
  private final Collator collator = Collator . getInstance ( ) ;
  @ Override public int compare ( List < Pair < Integer , Integer >> o1 , List < Pair < Integer , Integer >> o2 ) {
    return collator . compare ( o1 . first , o2 . first ) * collator . compare ( o1 . second , o2 . second ) ;
  }
  @ Override public int compare ( List < Pair < Integer , Integer >> o1 , List < Pair < Integer , Integer >> o2 ) {
    return 2 * collator . compare ( o1 . first , o2 . first ) * collator . compare ( o1 . second , o2 . second ) ;
  }
  @ Override public int compare ( List < Pair < Integer , Integer >> o1 , List < Pair < Integer , Integer >> o2 ) {
    return collator . compare ( o1 . first , o2 . first ) * collator . compare ( o1 . second , o2 . second ) ;
  }
  @ Override public int compare ( List < Pair < Integer , Integer >> o1 , List < Pair < Integer , Integer >> o2 ) {
    return collator . compare ( o1 . first , o2 . first ) * collator . compare ( o1 . second , o2 . second ) ;
  }
}
