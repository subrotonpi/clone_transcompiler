@ VisibleForTesting static Iterable < Integer > combinations ( Scanner input ) {
  int n = input . nextInt ( ) ;
  Iterable < Integer > x = ImmutableList . of ( ) ;
  Iterable < Integer > y = ImmutableList . of ( ) ;
  Iterable < Integer > u = x . iterator ( ) ;
  Iterable < Integer > v = y . iterator ( ) ;
  int d = max ( max ( u ) - min ( u ) , max ( v ) - min ( v ) ) ;
  for ( int i = 0 , j = 0 ;
  i < n ;
  i ++ , j ++ ) {
    int k = ( i + j ) / 2 , l = ( i - j ) / 2 ;
    Set < Integer > s = Sets . newHashSet ( ) ;
    for ( int px = 0 , py = 0 ;
    px < k ;
    px ++ , py ++ ) {
      s . add ( Math . abs ( k - px ) + Math . abs ( l - py ) ) ;
      if ( s . size ( ) > 1 ) break ;
      else {
        System . out . println ( k + " " + l ) ;
        break ;
      }
    }
  }
  return s ;
}
