public static int doit ( int i , int j ) throws IOException {
  if ( i == 0 || j == 0 ) return 0 ;
  if ( j == 1 ) return 1 ;
  if ( j >= i ) return 0 ;
  int aux = 0 ;
  for ( int x : xrange ( 1 , j ) ) {
    aux += A [ j ] [ x ] * C [ i - j - 1 ] [ j - x - 1 ] ;
    aux %= MOD ;
  }
  /* comb */
  if ( i == 0 ) {
    if ( j == 0 ) return 1 ;
    else return 0 ;
  }
  if ( j > i ) return 0 ;
  return ( C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] ) % MOD ;
}
