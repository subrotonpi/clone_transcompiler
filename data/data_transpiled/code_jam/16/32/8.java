public static int T = Integer . parseInt ( Scanner in ) {
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    System . out . println ( "Case #" + i + ":" ) ;
    int b = in . nextInt ( ) , m = in . nextInt ( ) ;
    if ( ( 1 << ( b - 2 ) ) < m ) {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "POSSIBLE" ) ;
      int bb = b ;
      while ( bb >= 3 && ( 1 << ( bb - 3 ) ) >= m ) bb -- ;
      int [ ] [ ] ans = new int [ b ] [ b ] ;
      for ( int i = 0 ;
      i < b ;
      i ++ ) ans [ i ] [ b - 1 ] = 1 ;
      if ( bb != b ) ans [ bb - 1 ] [ b - 1 ] = 1 ;
      for ( int i = 0 ;
      i < bb ;
      i ++ ) for ( int j = 0 ;
      j < i ;
      j ++ ) ans [ j ] [ i ] = 1 ;
      int mm = ( 1 << ( bb - 2 ) ) - m ;
      for ( int j = 0 ;
      mm >> i & 1 ;
      j ++ ) if ( mm >> i & 1 ) ans [ i + 1 ] [ bb - 1 ] = 0 ;
      System . out . println ( Arrays . toString ( ans ) ) ;
    }
  }
  return T ;
}
