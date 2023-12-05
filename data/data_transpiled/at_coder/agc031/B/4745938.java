public static void input ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] C = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 1 ;
  HashMap < Integer , Integer > bak = new HashMap < > ( ) ;
  bak . put ( C [ 0 ] , 0 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = C [ i ] ;
    if ( i == 0 ) continue ;
    dp [ i ] = dp [ i - 1 ] ;
    if ( c >= 0 && bak . containsKey ( c ) && bak . get ( c ) < i - 1 ) {
      dp [ i ] += dp [ bak . get ( c ) ] ;
      dp [ i ] %= MOD ;
    }
    bak . put ( c , i ) ;
  }
  System . out . println ( dp [ N - 1 ] ) ;
}
