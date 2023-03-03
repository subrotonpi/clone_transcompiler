public static void input ( ) {
  String [ ] A = {
    "Do" , "Re" , "Mi" , "Fa" , "So" , "La" , "Si" }
    ;
    String k = "WBWBWWBWBWBW" ;
    String [ ] K = new String [ 4 ] ;
    for ( int i = 0 ;
    i < 12 ;
    i ++ ) {
      if ( k . charAt ( i ) == 'W' ) {
        K [ i ] = k . substring ( i , i + 20 ) ;
      }
    }
    for ( int i = 0 ;
    i < 7 ;
    i ++ ) {
      if ( S . equals ( K [ i ] ) ) {
        System . out . println ( A [ i ] ) ;
        break ;
      }
    }
  }
  