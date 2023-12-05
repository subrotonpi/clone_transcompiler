public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  int [ ] imos = new int [ 2 * M + 1 ] ;
  int [ ] ends = new int [ 2 * M + 1 ] ;
  int maxPress = 0 ;
  for ( int a = 0 , b = 0 ;
  a < M ;
  a ++ ) {
    if ( a > b ) b += M ;
    if ( b - a > 1 ) {
      imos [ a + 2 ] ++ ;
      imos [ b + 1 ] -- ;
      ends [ b + 1 ] += b - a - 1 ;
    }
    maxPress += b - a ;
  }
  for ( int i = 0 ;
  i < 2 * M ;
  i ++ ) imos [ i + 1 ] += imos [ i ] ;
  int [ ] press = new int [ M ] ;
  int d = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int dec = imos [ i ] ;
    final int inc = ends [ i ] ;
    d += inc - dec ;
    press [ i % M ] += d ;
  }
  System . out . println ( Arrays . toString ( press ) ) ;
  return press [ 0 ] ;
}
