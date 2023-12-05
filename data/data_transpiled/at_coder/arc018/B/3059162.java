@ VisibleForTesting static Iterable < ImmutablePair > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Vector < ImmutablePair > v = new Vector < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    v . add ( ImmutablePair . of ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = v . get ( i ) ;
    int y1 = v . get ( i ) ;
    int x2 = v . get ( i ) ;
    int y2 = v . get ( i ) ;
    int x3 = v . get ( i ) ;
    int y3 = v . get ( i ) ;
    int s = Math . abs ( ( x2 - x1 ) * ( y3 - y1 ) - ( y2 - y1 ) * ( x3 - x1 ) ) ;
    if ( s > 0 && s % 2 == 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return v ;
}
