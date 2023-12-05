public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    c [ A [ i ] ] ++ ;
  }
  long ans = 1 ;
  if ( A [ 0 ] != 0 || c [ 0 ] > 1 ) {
    ans = 0 ;
  }
  int MOD = ( int ) ( 1e9 + 7 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( c [ i ] == 0 ) {
      continue ;
    }
    ans *= Math . pow ( 2 , c [ i ] * ( c [ i ] - 1 ) / 2 , MOD ) ;
    ans *= Math . pow ( Math . pow ( 2 , c [ i - 1 ] , MOD ) - 1 , c [ i ] , MOD ) ;
    ans %= MOD ;
  }
  System . out . println ( ( int ) ans ) ;
  return ans ;
}
