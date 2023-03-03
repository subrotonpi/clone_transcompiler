public static void input ( String s ) {
  s = input + "TE" ;
  int x = Integer . parseInt ( s ) , y = Integer . parseInt ( s ) ;
  int ini = s . indexOf ( 'T' ) ;
  s = s . substring ( ini + 1 ) ;
  int isY = 1 ;
  Set < Integer > [ ] point = {
    new HashSet < Integer > ( ) , new HashSet < Integer > ( ) }
    ;
    while ( s . length ( ) > 1 ) {
      int tmp = s . indexOf ( 'T' ) ;
      if ( tmp != 0 ) {
        Set < Integer > set = new HashSet < Integer > ( ) ;
        for ( int z = 0 ;
        z < point [ isY ] . size ( ) ;
        z ++ ) {
          set . add ( point [ isY ] . get ( z ) + tmp ) ;
          set . add ( point [ isY ] . get ( z ) - tmp ) ;
        }
        point [ isY ] . set ( set ) ;
      }
      isY ++ ;
      isY %= 2 ;
      s = s . substring ( tmp + 1 ) ;
    }
    if ( point [ 0 ] . contains ( x ) && point [ 1 ] . contains ( y ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  