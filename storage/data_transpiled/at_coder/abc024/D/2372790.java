public static int [ ] A ( int [ ] B , int [ ] C ) {
  int MOD = 10 * 9 + 7 ;
  /* mul a and b */
  return ( a * b ) % MOD ;
  /* pow a and b */
  int [ ] ret = 1 ;
  int mag = a ;
  while ( n > 0 ) {
    if ( ( n & 1 ) != 0 ) {
      ret = mul ( ret , mag ) ;
    }
    mag = mul ( mag , mag ) ;
    n >>= 1 ;
  }
  /* inv a */
  int [ ] xn = new int [ MOD - 2 ] ;
  int [ ] xd = new int [ MOD - 2 ] ;
  int [ ] x = mul ( xn , inv ( xd ) ) ;
  int [ ] yn = new int [ MOD - 2 ] ;
  int [ ] yd = new int [ MOD - 2 ] ;
  for ( int i = 0 ;
  i < MOD - 2 ;
  i ++ ) {
    y [ i ] = ( int ) input . nextInt ( ) ;
  }
  return x ;
}
