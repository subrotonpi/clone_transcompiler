static final int [ ] [ ] solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  List < List < Integer >> grid = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    grid . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int [ ] [ ] S = new int [ N + 1 ] [ N + 1 ] ;
  int Q = Integer . parseInt ( input ) ;
  int [ ] [ ] query = new int [ Q ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    query [ i ] = Integer . parseInt ( input ) ;
  }
  /* solve */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      S [ i + 1 ] [ j + 1 ] = S [ i ] [ j + 1 ] + S [ i + 1 ] [ j ] - S [ i ] [ j ] + grid [ i ] [ j ] ;
    }
  }
  int [ ] val = new int [ N * N + 1 ] ;
  for ( int x1 = 0 ;
  x1 < N ;
  x1 ++ ) {
    for ( int x2 = x1 + 1 ;
    x2 < N ;
    x2 ++ ) {
      for ( int y1 = 0 ;
      y1 < N ;
      y1 ++ ) {
        for ( int y2 = y1 + 1 ;
        y2 < N ;
        y2 ++ ) {
          int area = ( x2 - x1 ) * ( y2 - y1 ) ;
          int s = S [ x2 ] [ y2 ] - S [ x1 ] [ y2 ] - S [ x2 ] [ y1 ] + S [ x1 ] [ y1 ] ;
          val [ area ] = Math . max ( val [ area ] , s ) ;
        }
      }
    }
  }
  for ( int i = 0 ;
  i < N * N ;
  i ++ ) {
    val [ i + 1 ] = Math . max ( val [ i ] , val [ i + 1 ] ) ;
  }
  for ( int q : query ) {
    System . out . println ( val [ q ] ) ;
  }
  return val ;
}
