@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int solve ( int n , String [ ] strings ) {
  int test = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    BitSet was = new BitSet ( n ) ;
    was . set ( i ) ;
    int cm = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( strings [ i ] . charAt ( j ) == '1' ) {
        cm ++ ;
        for ( int k = 0 ;
        k < n ;
        k ++ ) {
          if ( strings [ k ] . charAt ( j ) == '1' ) {
            was . set ( k ) ;
          }
        }
      }
    }
    if ( was . cardinality ( true ) > cm ) {
      return false ;
    }
  }
  return test ;
}
