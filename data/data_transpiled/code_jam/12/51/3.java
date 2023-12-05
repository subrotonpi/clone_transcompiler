static final Comparator < Pair < Integer , Integer >> COMPARATOR = new Comparator < Pair < Integer , Integer >> ( ) {
  @ Override public int compare ( Pair < Integer , Integer > x1 , Pair < Integer , Integer > x2 ) {
    int L1 = x1 . get1 ( ) ;
    int q1 = x1 . get2 ( ) ;
    int L2 = x2 . get1 ( ) ;
    int q2 = x2 . get2 ( ) ;
    if ( q1 == 100 && q2 == 100 ) return x1 . getFirst ( ) - x1 . getSecond ( ) ;
    if ( q1 == 100 ) return 1 ;
    if ( q2 == 100 ) return - 1 ;
    if ( L1 * q2 != L2 * q1 ) return L2 * q1 - L1 * q2 ;
    return x1 . getFirst ( ) - x1 . getSecond ( ) ;
  }
  private String compute ( List < Pair < Integer , Integer >> L , List < Pair < Integer , Integer >> P ) {
    List < Pair < Integer , Integer >> x = new ArrayList < > ( ) ;
    for ( int i : xrange ( L . size ( ) ) ) x . add ( new Pair < > ( i , L . get ( i ) , 100 - P . get ( i ) ) ) ;
    x = new ArrayList < > ( x ) ;
    Collections . sort ( x , cmp ) ;
    return Arrays . toString ( x ) ;
  }
  private String parse ( ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    List < Integer > L = map ( ) ;
    List < Integer > P = map ( ) ;
    return Arrays . toString ( L . toArray ( ) ) ;
  }
  @ Override public String toString ( ) {
    return "" ;
  }
}
