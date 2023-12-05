@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    A . add ( i ) ;
  }
  A . sort ( ) ;
  List < Integer > S = Lists . newArrayList ( ) ;
  S . addAll ( A ) ;
  int cnt = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( 3 * S . get ( i ) >= S . get ( i + 1 ) ) {
      cnt ++ ;
    }
    else {
      cnt = 1 ;
    }
  }
  System . out . println ( cnt ) ;
  return S ;
}
