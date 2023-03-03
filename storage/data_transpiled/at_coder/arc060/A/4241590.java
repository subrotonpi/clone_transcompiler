public static int [ ] [ ] dp ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = i ;
  int p = Math . max ( Math . max ( x [ 0 ] , a ) , a ) ;
  int [ ] s = Arrays . stream ( x ) . mapToInt ( i -> i - a ) . toArray ( ) ;
  int [ ] [ ] dp = new int [ 2 * n * p + 1 ] [ 2 ] ;
  dp [ 0 ] [ n * p ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    dp [ i ] [ n * p ] = dp [ i - 1 ] [ i ] ;
  }
  return dp ;
}
