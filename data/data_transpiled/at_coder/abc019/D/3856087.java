static final int N = Integer . parseInt ( input ) {
  int a = - 1 ;
  int v = - 1 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    System . out . println ( "? " + 1 + " " + i ) ;
    System . out . flush ( ) ;
    int dist = Integer . parseInt ( input ) ;
    if ( dist > a ) {
      a = dist ;
      v = i ;
    }
  }
  int ans = - 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i == v ) continue ;
    System . out . println ( "? " + v + " " + i ) ;
    System . out . flush ( ) ;
    int dist = Integer . parseInt ( input ) ;
    if ( dist > ans ) ans = dist ;
  }
  return ans ;
}
