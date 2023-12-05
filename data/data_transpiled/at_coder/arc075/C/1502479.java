public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) - K ;
  }
  int su = 0 ;
  Vector < Pair > v = new Vector < Pair > ( ) ;
  v . add ( new Pair ( 0 , 0 ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    su += a [ i ] ;
    v . add ( new Pair ( su , i + 1 ) ) ;
  }
  v = new Vector < Pair > ( ) ;
  int [ ] data = new int [ N + 3 ] ;
  /* Sum of the sum */
  int s = 0 ;
  while ( i > 0 ) {
    s += data [ i ] ;
    i -= data [ i & - i ] ;
  }
  /* Add the sum */
  while ( s > 0 ) {
    while ( i <= N + 2 ) {
      data [ i ] += s ;
      i += data [ i & - i ] ;
    }
  }
  int ans = 0 ;
  for ( Pair e : v ) {
    int i = e . i ;
    ans += sumation ( i + 1 ) ;
    /* Add the sum */
  }
  System . out . println ( ans ) ;
  return ans ;
}
