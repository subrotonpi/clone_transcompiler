@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    S . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] R = new int [ N + 2 ] ;
  for ( int s = 0 ;
  s < S . size ( ) ;
  s ++ ) {
    int t = S . get ( s ) ;
    R [ s ] ++ ;
    R [ t + 1 ] -- ;
  }
  int len = R . length ;
  Arrays . sort ( R ) ;
  int [ ] result = new int [ len ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    result [ i ] = ( i >= 2 ? 1 : 0 ) ;
  }
  Arrays . sort ( result ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  int index = 1 ;
  for ( int s = 0 ;
  s < S . size ( ) ;
  s ++ ) {
    int t = S . get ( s ) ;
    if ( s == t && result [ s - 1 ] < result [ t ] ) {
      ans . add ( index ) ;
    }
    else {
      if ( result [ t ] - result [ s - 1 ] == t - s + 1 ) {
        ans . add ( index ) ;
      }
    }
    index ++ ;
  }
  if ( ans . size ( ) > 0 ) {
    System . out . println ( ans . size ( ) ) ;
    System . out . println ( ( Integer ) ans . get ( 0 ) ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return ans ;
}
