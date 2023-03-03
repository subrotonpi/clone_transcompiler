public static List < Integer > inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . map ( i -> Integer . parseInt ( i ) ) . collect ( Collectors . toList ( ) ) ;
  int mod = 10 * 9 + 7 ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] fac = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) fac [ i + 1 ] = ( i + 1 ) * fac [ i ] % mod ;
  int [ ] inv = new int [ n + 1 ] ;
  for ( int i = 2 ;
  i < n ;
  i ++ ) inv [ i ] = ( - ( mod / i ) * inv [ mod % i ] ) % mod ;
  int [ ] facinv = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) facinv [ i + 1 ] = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) facinv [ i + 1 ] = inv [ i + 1 ] * facinv [ i ] % mod ;
  /* if (a < b < 0) return 0; */
  return fac [ a ] * facinv [ b ] * facinv [ a - b ] ;
}
