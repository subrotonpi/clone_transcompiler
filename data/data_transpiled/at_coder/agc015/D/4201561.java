public static int bitLen ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == b ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  /* bit length */
  {
    return a > 0 ? 1 + bitLen ( a >> 1 ) : 0 ;
  }
  int t = a ^ b ;
  int n = bitLen ( t ) ;
  int T = 1 << ( n - 1 ) ;
  a = a & ( T * 2 - 1 ) ;
  b = b & ( T * 2 - 1 ) ;
  int sb = b & ( T - 1 ) ;
  int bMax = ( 2 * bitLen ( sb ) - 1 ) | T ;
  if ( ( T + a ) > bMax ) {
    System . out . println ( ( bMax - a + 1 ) + ( 2 * T - 1 - ( T + a ) + 1 ) ) ;
  }
  else {
    System . out . println ( 2 * T - 1 - a + 1 ) ;
  }
  return t ;
}
