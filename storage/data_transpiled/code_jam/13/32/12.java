public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( T ) ) {
    int tx = in . nextInt ( ) , ty = in . nextInt ( ) ;
    StringBuffer res = new StringBuffer ( ) ;
    int d = 1 ;
    if ( tx < 0 ) {
      int x = 0 ;
      while ( x != tx ) {
        x += d ;
        res . append ( 'E' ) ;
        d ++ ;
        x -= d ;
        res . append ( 'W' ) ;
        d ++ ;
      }
    }
    else if ( tx > 0 ) {
      int x = 0 ;
      while ( x != tx ) {
        x -= d ;
        res . append ( 'W' ) ;
        d ++ ;
        x += d ;
        res . append ( 'E' ) ;
        d ++ ;
      }
    }
    if ( ty < 0 ) {
      int y = 0 ;
      while ( y != ty ) {
        y += d ;
        res . append ( 'N' ) ;
        d ++ ;
        y -= d ;
        res . append ( 'S' ) ;
        d ++ ;
      }
    }
    else if ( ty > 0 ) {
      int y = 0 ;
      while ( y != ty ) {
        y -= d ;
        res . append ( 'S' ) ;
        d ++ ;
        y += d ;
        res . append ( 'N' ) ;
        d ++ ;
      }
    }
    assert res . length ( ) <= 500 ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
    return t ;
  }
}
