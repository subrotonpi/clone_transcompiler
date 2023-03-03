@ GwtIncompatible ( "collections" ) public static Collection < Pair < Integer , Integer >> solve ( int J , int P , int S , int K ) {
  Collection < Pair < Integer , Integer >> Q = new HashSet < > ( ) ;
  Map < Integer , Integer > A = new TreeMap < > ( ) ;
  Map < Integer , Integer > B = new TreeMap < > ( ) ;
  Map < Integer , Integer > C = new TreeMap < > ( ) ;
  for ( int j = 0 ;
  j < J ;
  j ++ ) {
    for ( int p = 0 ;
    p < P ;
    p ++ ) {
      for ( int s = 0 ;
      s < Math . min ( S , K ) ;
      s ++ ) {
        int d = ( j + p + s ) % S ;
        Q . add ( new Pair < > ( j , p , d ) ) ;
        A . put ( new Integer ( j ) , p ) ;
        B . put ( new Integer ( p ) , d ) ;
        C . put ( new Integer ( d ) , j ) ;
      }
    }
  }
  assert ( Math . max ( A . values ( ) , K ) <= K ) ;
  assert ( Math . max ( B . values ( ) , K ) <= K ) ;
  assert ( Math . max ( C . values ( ) , K ) <= K ) ;
  assert ( Q . size ( ) == J * P * Math . min ( S , K ) ) ;
  return Q ;
}
