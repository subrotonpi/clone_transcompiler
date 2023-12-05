static final Comparator < Pair < Integer , Integer >> cmp1 = new Comparator < Pair < Integer , Integer >> ( ) {
  public int compare ( Pair < Integer , Integer > x0 , Pair < Integer , Integer > x1 ) {
    int i0 = x0 . first ;
    int a0 = x0 . second ;
    int b0 = x1 . first ;
    int i1 = x1 . second ;
    int a1 = x1 . first ;
    int b1 = x1 . second ;
    int t1 = a0 * ( 100 - b1 ) ;
    int t2 = a1 * ( 100 - b0 ) ;
    if ( t1 == t2 ) return i0 - i1 ;
    if ( t1 < t2 ) return - 1 ;
    return 1 ;
  }
}
