public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 7 + 10 * 9 ;
  /* power of 2 */
  if ( n == 1 ) {
    return i ;
  }
  else {
    if ( n % 2 == 0 ) {
      return Power ( ( i * i ) % mod , n / 2 ) ;
    }
    else {
      return ( Power ( ( i * i ) % mod , n / 2 ) * i ) % mod ;
    }
  }
  int [ ] NF = new int [ H + W + 1 ] ;
  for ( int i = 0 ;
  i < H + W ;
  i ++ ) {
    NF [ i ] = 1 ;
  }
  for ( int i = 2 ;
  i <= H ;
  i ++ ) {
    NF [ i ] = ( NF [ i - 1 ] * i ) % mod ;
  }
  int [ ] NFI = new int [ H + W + 1 ] ;
  for ( int i = 0 ;
  i < H + W ;
  i ++ ) {
    NFI [ i ] = 1 ;
  }
  NFI [ H + W ] = Power ( NF [ H - 1 ] , mod - 2 ) ;
  for ( int i = 1 ;
  i < H + W ;
  i ++ ) {
    NFI [ i ] = ( NFI [ i + 1 ] * ( i + 1 ) ) % mod ;
  }
  int Ans = 0 ;
  for ( int w = B ;
  w < W ;
  w ++ ) {
    int upper = ( NF [ H - A + w - 1 ] * NFI [ w ] * NFI [ H - A - 1 ] ) % mod ;
    int lower = ( NF [ W + A - w - 2 ] * NFI [ A - 1 ] * NFI [ W - w - 1 ] ) % mod ;
    Ans += upper * lower % mod ;
    Ans %= mod ;
  }
  System . out . println ( Ans ) ;
  return Ans ;
}
