@ org . python . Method ( __doc__ = "division #" + ( i + 1 ) + ": " + solve ( text ) ) ) public static void go ( ) {
  final String PATTERN = "welcome to code jam" ;
  final int MOD = 10 * 4 ;
  /* solve the string */
  int k = PATTERN . length ( ) ;
  int n = text . length ( ) ;
  int [ ] [ ] counts = new int [ n + 1 ] [ k ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    counts [ k ] [ j ] = 1 ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      counts [ i ] [ j ] = counts [ i ] [ j + 1 ] ;
      if ( PATTERN . charAt ( i ) == PATTERN . charAt ( j ) ) counts [ i ] [ j ] += counts [ i + 1 ] [ j + 1 ] ;
    }
    counts [ i ] [ j ] %= MOD ;
  }
}
