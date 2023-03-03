public static int [ ] readInputInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] F = new int [ N ] ;
  int MOD = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int f = Integer . parseInt ( input . nextLine ( ) ) ;
    F [ i ] = f ;
  }
  int [ ] dp = new int [ N + 1 ] ;
  int [ ] rec = new int [ M + 1 ] ;
  dp [ 0 ] = 1 ;
  int s = dp [ 0 ] ;
  int l = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rec [ F [ i ] ] ++ ;
    while ( rec [ F [ i ] ] > 1 ) {
      rec [ F [ l ] ] -- ;
      s -= dp [ l ] ;
      s += MOD ;
      s %= MOD ;
      l ++ ;
    }
    dp [ i + 1 ] = s ;
    s += dp [ i + 1 ] ;
    s %= MOD ;
  }
  System . out . println ( dp [ N ] ) ;
  return dp ;
}
