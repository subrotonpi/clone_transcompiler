@ Sys public static int [ ] dfs ( ) {
  setRecursionLimit ( 10 * 9 ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  if ( Integer . valueOf ( a ^ b ) . indexOf ( '1' ) % 2 == 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  /* dfs(i, a, b) */
  if ( n == 1 ) {
    return new int [ ] {
      a , b }
      ;
    }
    int d = ( a ^ b ) & - ( a ^ b ) ;
    int ad = ( ( a & ( ~ d ^ d - 1 ) ) >> 1 ) + ( a & d - 1 ) ;
    int bd = ( ( b & ( ~ d ^ d - 1 ) ) >> 1 ) + ( b & d - 1 ) ;
    int c = ad ^ 1 ;
    int [ ] res1 = dfs ( n - 1 , ad , c ) ;
    int [ ] res2 = dfs ( n - 1 , c , bd ) ;
    return res1 ;
  }
  