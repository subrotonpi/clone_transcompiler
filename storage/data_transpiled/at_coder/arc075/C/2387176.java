public static int N = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Point [ ] cums = new Point [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = src [ i ] ;
    cums [ i ] = new Point ( cums [ i ] . x + a - K , i + 2 ) ;
  }
  int [ ] bit = new int [ N + 2 ] ;
  /* bit add */
  int x = a ;
  while ( x <= N ) {
    bit [ x ] += w ;
    x += ( x & - x ) ;
  }
  /* bit sum */
  x = a ;
  int ret = 0 ;
  while ( x > 0 ) {
    ret += bit [ x ] ;
    x -= ( x & - x ) ;
  }
  /* return ret */
  int ans = 0 ;
  for ( int i = 0 ;
  i < cums . length ;
  i ++ ) {
    int a = cums [ i ] ;
    ans += bitSum ( a - 1 ) ;
    /* bit add */
  }
  System . out . println ( ans ) ;
  return ans ;
}
