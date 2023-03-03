@ GwtIncompatible ( "java.util.Arrays" ) private static int [ ] [ ] find ( int [ ] [ ] m , int u2 , int m2 ) {
  int [ ] [ ] used = new int [ 4 ] [ 2 ] ;
  int [ ] [ ] best = new int [ 5 ] [ 2 ] ;
  for ( int n = 0 ;
  n < m . length ;
  n ++ ) {
    if ( ( n >> i ) & 1 != 0 ) {
      System . err . println ( Arrays . toString ( m [ n ] ) ) ;
    }
  }
  if ( ! valid ( m , used ) ) continue ;
  best = max ( best , res ) ;
  System . out . println ( "Case #" + ( test + 1 ) + ": " + best ) ;
  {
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ( test + 2 ) ) ;
  }
  {
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ( test + 2 ) ) ;
  }
  {
    System . out . println ( "Case #" + ( test + 2 ) + ": " + ( test + 3 ) ) ;
  }
  {
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ( test + 2 ) ) ;
  }
  {
    int [ ] [ ] res = new int [ 4 ] [ 2 ] ;
    int h = m . length ;
    int w = m [ 0 ] . length ;
    for ( int dr = - 1 ;
    dr >= 0 ;
    dr -- ) {
      for ( int dc = - 1 ;
      dc <= 0 ;
      dc ++ ) {
        int r2 = r + dr ;
        int c2 = c + dc ;
        if ( ( r2 < 0 ) || ( r2 >= h ) || ( c2 < 0 ) || ( c2 >= w ) ) continue ;
        res [ dr ] [ c2 ] = 1 ;
      }
    }
    return res ;
  }
  {
    int [ ] [ ] used2 = new int [ 2 ] [ w ] ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      used2 [ i ] [ 0 ] = i ;
    }
    for ( int i = 1 ;
    i < h ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        used2 [ i ] [ j ] = isSet ( i , j ) ? 1 : 0