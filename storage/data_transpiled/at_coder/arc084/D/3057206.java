public static int divmod ( int f , int g ) {
  assert g > 0 ;
  int h = 0 ;
  for ( int i = 0 ;
  i < Integer . SIZE - f - g + 1 ;
  i ++ ) {
    if ( ( f & ( 1 << ( g + i - 1 ) ) ) != 0 ) {
      f ^= g << i ;
      h ^= 1 << i ;
    }
  }
  return h + f ;
  /* gcd */
  while ( g > 0 ) {
    int q = f / g ;
    int r = q >> 1 ;
    f = q ;
    g = r ;
  }
  final int [ ] a = new int [ 2 ] ;
  int n = Math . min ( Math . max ( n , a . length ) , a . length ) ;
  int x = Math . min ( Math . max ( n , a . length ) , a . length ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = a [ i ] ;
  }
  return n ;
}
