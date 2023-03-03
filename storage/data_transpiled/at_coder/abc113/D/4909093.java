public static int [ ] [ ] parse ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int M = 1000000007 ;
  int [ ] [ ] x = new int [ w ] [ w ] ;
  for ( int i = 0 ;
  i < w ;
  i ++ ) x [ i ] = 0 ;
  x [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < w ;
  i ++ ) {
    for ( int j = 0 ;
    j < ( 1 << i ) ;
    j ++ ) {
      int f = 0 ;
      for ( int l = 0 ;
      l < i - 1 ;
      l ++ ) {
        if ( ( ( j >> l ) & 1 ) == 1 && ( ( j >> ( l + 1 ) ) & 1 ) == 1 ) {
          f = 1 ;
          break ;
        }
      }
      if ( f == 0 ) x [ i ] ++ ;
    }
    x [ i ] %= M ;
  }
  /* g(a) */
  if ( a < 0 ) return 1 ;
  int [ ] [ ] dp = new int [ h + 1 ] [ w ] ;
  dp [ 0 ] [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      dp [ i ] [ j ] = dp [ i - 1 ] [ j ] * g ( j - 1 ) * g ( w - j - 2 ) ;
      if ( j - 1 >= 0 ) dp [ i ] [ j ] += dp [ i - 1 ] [ j + 1 ] * g ( j - 1 ) * g ( w - j - 3 ) ;
      dp [ i ] [ j ] %= M ;
    }
  }
  System . out . println ( dp [ h ] [ k - 1 ] ) ;
  return dp ;
}
