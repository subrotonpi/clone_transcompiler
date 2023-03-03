public static void main ( String input ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ) ;
  tc ++ ) {
    int r = Integer . parseInt ( input . substring ( 0 , input . indexOf ( '?' ) ) ) ;
    int c = Integer . parseInt ( input . substring ( input . indexOf ( '?' ) + 1 ) ) ;
    char [ ] [ ] R = new char [ r ] [ c ] ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      R [ i ] = new char [ c ] ;
    }
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      for ( int j = 1 ;
      j < c ;
      j ++ ) {
        if ( R [ i ] [ j ] == '?' ) {
          R [ i ] [ j ] = R [ i ] [ j - 1 ] ;
        }
      }
      for ( int j = c - 1 ;
      j > 0 ;
      j -- ) {
        if ( R [ i ] [ j - 1 ] == '?' ) {
          R [ i ] [ j - 1 ] = R [ i ] [ j ] ;
        }
      }
    }
    for ( int i = 1 ;
    i < r ;
    i ++ ) {
      if ( R [ i ] [ 0 ] == '?' ) {
        R [ i ] = R [ i - 1 ] ;
      }
    }
    for ( int i = r - 1 ;
    i > 0 ;
    i -- ) {
      if ( R [ i - 1 ] [ 0 ] == '?' ) {
        R [ i - 1 ] = R [ i ] ;
      }
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ":" ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      System . out . println ( new String ( R [ i ] ) ) ;
    }
  }
}
