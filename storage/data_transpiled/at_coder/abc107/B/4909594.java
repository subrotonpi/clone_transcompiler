public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ H ] [ W ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    a [ h ] = new int [ W ] ;
    for ( int in : input . toCharArray ( ) ) {
      a [ h ] [ in ] = in ;
    }
  }
  int [ ] [ ] check = new int [ H ] [ W ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( a [ h ] [ w ] == '#' ) {
        check [ h ] [ w ] = 1 ;
      }
    }
  }
  int [ ] finalW = new int [ W ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    finalW = new int [ W ] ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      finalW [ w ] = finalW [ w ] + check [ h ] [ w ] ;
    }
  }
  int [ ] finalH = new int [ H ] ;
  for ( int w = 0 ;
  w < W ;
  w ++ ) {
    finalH [ w ] = finalH [ h ] + check [ h ] [ w ] ;
  }
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    StringBuffer res = new StringBuffer ( ) ;
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      if ( finalW [ w ] >= 1 && finalH [ h ] >= 1 ) {
        res . append ( a [ h ] [ w ] ) ;
      }
    }
    System . out . println ( res . toString ( ) + "\n" ) ;
  }
}
