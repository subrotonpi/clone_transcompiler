static final String print ( int i ) {
  int N = i ;
  int [ ] A = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    A [ j ] = i ;
  }
  Map < Integer , Integer > counts = new HashMap < Integer , Integer > ( ) ;
  int ans = 0 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    if ( j % 2 == 1 ) ans ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
