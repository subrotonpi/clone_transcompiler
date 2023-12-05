static final Comparator < String > comparator = new Comparator < String > ( ) {
  private final Collator collator = Collator . getInstance ( ) ;
  @ Override public int compare ( String idx1 , String idx2 ) {
    if ( p [ idx1 ] * l [ idx2 ] > p [ idx2 ] * l [ idx1 ] ) return - 1 ;
    if ( p [ idx1 ] * l [ idx2 ] < p [ idx2 ] * l [ idx1 ] ) return 1 ;
    return idx1 . compareTo ( idx2 ) ;
  }
}
