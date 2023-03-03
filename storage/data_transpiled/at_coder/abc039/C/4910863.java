public static String input ( ) {
  String S = "WBWBWWBWBWBW" ;
  String [ ] d = {
    0 , "Do" , 2 , "Re" , 4 , "Mi" , 5 , "Fa" , 7 , "So" , 9 , "La" , 11 , "Si" }
    ;
    for ( int i = 0 ;
    i < 12 ;
    i ++ ) {
      if ( Arrays . equals ( T , d [ i ] ) ) {
        System . out . println ( d [ i ] ) ;
        break ;
      }
      else {
        T = T . substring ( 1 ) + T . substring ( 0 , 1 ) ;
      }
    }
    return S ;
  }
  