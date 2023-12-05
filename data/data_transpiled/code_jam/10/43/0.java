public static void main ( String input ) {
  for ( int testCase = 1 ;
  testCase <= 1 ;
  testCase ++ ) {
    int r = Integer . parseInt ( input ) ;
    int [ ] [ ] a = new int [ 101 ] [ 101 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < a [ i ] . length ;
      j ++ ) {
        a [ i ] [ j ] = 0 ;
      }
    }
    int numcells = 0 ;
    for ( int rectIndex = 0 ;
    rectIndex < r ;
    rectIndex ++ ) {
      Arrays . stream ( input . split ( " " ) ) . forEach ( z -> {
        int x1 = Integer . parseInt ( z ) ;
        int y1 = Integer . parseInt ( z ) ;
        int x2 = Integer . parseInt ( z ) ;
        int y2 = Integer . parseInt ( z ) ;
        for ( int x = xrange ( x1 , x2 + 1 ) ;
        x <= x1 ;
        x ++ ) {
          for ( int y = xrange ( y1 , y2 + 1 ) ;
          y <= y1 ;
          y ++ ) {
            if ( a [ x ] [ y ] == 0 ) {
              numcells ++ ;
              a [ x ] [ y ] = 1 ;
            }
          }
        }
      }
      ) ;
    }
    int generations = 0 ;
    while ( ( numcells > 0 ) && ( generations < a [ 0 ] . length ) ) {
      generations ++ ;
      for ( int i = 100 ;
      i > 0 ;
      i -- ) {
        for ( int j = 100 ;
        j > 0 ;
        j -- ) {
          if ( ( a [ i ] [ j ] != a [ i - 1 ] [ j ] ) && ( a [ i ] [ j ] != a [ i ] [ j - 1 ] ) ) {
            numcells += ( a [ i - 1 ] [ j ] - a [ i ] [ j ] ) ;
            a [ i ] [ j ] = a [ i - 1 ] [ j ] ;
          }
        }
      }
    }
    System . out . println ( "Case #" + testCase + ": " + generations ) ;
  }
}
