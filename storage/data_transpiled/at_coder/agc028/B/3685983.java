public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  long ret = 0 ;
  int mod = ( int ) 1e9 + 7 ;
  {
    return Math . pow ( a , mod - 2 ) ;
  }
  int [ ] invMemo = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    invMemo [ i ] = invMemo [ i ] ;
  }
  cum = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cum [ i ] = ( cum [ i ] + invMemo [ i ] ) % mod ;
  }
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    ret *= i ;
    ret %= mod ;
  }
  System . out . println ( ret ) ;
}
