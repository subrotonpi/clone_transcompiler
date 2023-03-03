public static int [ ] solve ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int s = Arrays . stream ( A ) . sum ( ) ;
  int K = s / ( N * ( N + 1 ) / 2 ) ;
  if ( N == 1 ) {
    System . out . println ( "YES" ) ;
    exit ( ) ;
  }
  if ( s % ( N ) != 0 ) {
    System . out . println ( "NO" ) ;
    exit ( ) ;
  }
  return A ;
}
