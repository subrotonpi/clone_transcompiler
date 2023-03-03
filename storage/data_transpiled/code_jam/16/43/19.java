@ VisibleForTesting static void print ( ) {
  int T = Integer . parseInt ( System . in ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    int R = Integer . parseInt ( System . in . readLine ( ) . trim ( ) ) ;
    int C = Integer . parseInt ( System . in . readLine ( ) . trim ( ) ) ;
    int [ ] ps = Integer . parseInt ( System . in . readLine ( ) . trim ( ) ) ;
    for ( int l = 0 ;
    l < ps . length / 2 ;
    l ++ ) {
      int [ ] pp = ps [ l ] ;
      String targetName = getNode ( pp [ 1 ] ) . name ;
      /* Check if (pp == null) */
      boolean possible = false ;
      Node horiz = new Node ( ) ;
      Node vert = new Node ( ) ;
      Node locOut = new Node ( ) ;
      for ( int j = 0 ;
      j < R + 1 ;
      j ++ ) {
        for ( int k = 0 ;
        k < C + 1 ;
        k ++ ) {
          if ( ( k < C ) && ( j < C ) ) {
            horiz . set ( ( j , k ) , new Node ( "h" + ( j - 1 ) + "" + k , new Node ( ) ) ) ;
          }
          else if ( ( j < C ) && ( j < C ) ) {
            grid . set ( ( j , k ) , new Node ( "v" + ( j - 1 ) + "" , new Node ( ) ) ) ;
          }
        }
      }
      pps . sort ( new EdgeDist ( ) ) ;
      if ( ! possible ) {
        System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
        System . out . println ( "IMPOSSIBLE" ) ;
      }
      else {
        System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
        printGrid ( true ) ;
      }
    }
  }
}
