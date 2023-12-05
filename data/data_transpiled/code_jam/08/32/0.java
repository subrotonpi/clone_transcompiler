public static int process ( String digits ) {
  int [ ] [ ] table = {
    new int [ ] [ ] {
      new int [ ] {
      }
      , new int [ ] {
        Integer . valueOf ( digits . charAt ( 0 ) ) == k }
      }
    }
    ;
    for ( int i = xrange ( 2 , digits . length ( ) + 1 ) ;
    i < xrange ( 210 ) ;
    i ++ ) {
      int [ ] row = new int [ table . length ] ;
      for ( int j = xrange ( 210 ) ;
      j < i ;
      j ++ ) {
        int num = ( int ) ( Integer . valueOf ( digits . substring ( 0 , i ) ) % 210 == j ) ;
        for ( int k = xrange ( 1 , i ) ;
        k < xrange ( 210 ) ;
        k ++ ) {
          int rhs = Integer . valueOf ( digits . substring ( k , i ) ) ;
          num += table [ k ] [ ( j + rhs ) % 210 ] ;
          num += table [ k ] [ ( j - rhs ) % 210 ] ;
        }
        row [ i ] = num ;
      }
      table [ i ] = row ;
    }
    return Integer . valueOf ( table [ table . length - 1 ] [ k ] ) ;
  }
  final String next = new Scanner ( System . in ) . next ( ) ;
  final int ncases = Integer . valueOf ( next ) ;
  for ( int i = xrange ( ncases ) ;
  i < xrange ( 210 ) ;
  i ++ ) {
    digits = next . trim ( ) ;
    int numuglys = process ( digits ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + numuglys ) ;
    System . out . flush ( ) ;
  }
  