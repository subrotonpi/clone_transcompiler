public static void input ( Scanner in ) {
  int t = in . nextInt ( ) ;
  for ( int j = 0 ;
  j < xrange ( t ) ;
  j ++ ) {
    int b = Integer . parseInt ( in . nextLine ( ) . trim ( ) . split ( " " ) [ 0 ] ) ;
    int m = in . nextInt ( ) ;
    if ( m > 2 * ( b - 2 ) ) {
      System . out . println ( "Case #" + ( j + 1 ) + ": IMPOSSIBLE" ) ;
    }
    else {
      System . out . println ( "Case #" + ( j + 1 ) + ": POSSIBLE" ) ;
      m -- ;
      String res = "1" ;
      for ( int k = 0 ;
      k < xrange ( b - 2 ) ;
      k ++ ) {
        if ( m % 2 == 1 ) {
          res = "1" + res ;
          m -- ;
        }
        else {
          res = "0" + res ;
        }
        m /= 2 ;
      }
      System . out . println ( "0" + res ) ;
      for ( int i : xrange ( 1 , b ) ) {
        System . out . println ( "0" + i + "1" ) ;
      }
    }
  }
}
