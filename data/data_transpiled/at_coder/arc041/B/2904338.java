public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ N ] [ M ] ;
  int [ ] [ ] B = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      B [ i ] [ j ] = Integer . parseInt ( input ) ;
    }
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      B [ i ] [ j ] = Integer . parseInt ( input ) ;
    }
  }
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    for ( int j = 1 ;
    j < M - 1 ;
    j ++ ) {
      if ( B [ i ] [ j ] == 0 ) {
        continue ;
      }
      int b = B [ i ] [ j ] ;
      A [ i + 1 ] [ j ] += b ;
      B [ i + 1 ] [ j - 1 ] -= b ;
      B [ i + 1 ] [ j + 1 ] -= b ;
      B [ i + 2 ] [ j ] -= b ;
    }
  }
  A [ N - 1 ] [ M ] = B [ N - 2 ] ;
  for ( int a : A ) {
    System . out . print ( ( char ) a ) ;
  }
}
