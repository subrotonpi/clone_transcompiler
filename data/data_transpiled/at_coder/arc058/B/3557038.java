public static int [ ] inpl ( ) {
  return inpl ( ) . split ( " " ) ;
  int mod = 10 * 9 + 7 ;
  int H = inpl ( ) ;
  int W = inpl ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  int [ ] fac = new int [ H + W - 1 ] ;
  for ( int i = 0 ;
  i < H + W - 2 ;
  i ++ ) fac [ i + 1 ] = ( i + 1 ) * fac [ i ] % mod ;
  int [ ] inv = new int [ H + W - 1 ] ;
  for ( int i = 2 ;
  i < H + W - 2 ;
  i ++ ) inv [ i ] = ( - ( mod / i ) * inv [ mod % i ] ) % mod ;
  int [ ] facinv = new int [ H + W - 1 ] ;
  for ( int i = 0 ;
  i < W - 2 ;
  i ++ ) facinv [ i + 1 ] = inv [ i + 1 ] * facinv [ i ] % mod ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < W - B ;
  i ++ ) ans += ( fac [ H + B - A - 1 + i ] * fac [ W + A - B - 2 - i ] * facinv [ H - A - 1 ] * facinv [ B + i ] * facinv [ A - 1 ] * facinv [ W - B - 1 - i ] ) % mod ;
  System . out . println ( ans % mod ) ;
  return fac ;
}
