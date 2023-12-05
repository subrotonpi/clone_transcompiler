public static String input ( ) {
  s = input ( ) ;
  s = s . substring ( 0 , 12 ) ;
  String DO = "WBWBWWBWBWBW" ;
  String ans [ ] = {
    "Do" , "Si" , "La" , "So" , "Fa" , "Mi" , "Re" }
    ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      if ( s . equals ( DO ) ) {
        System . out . println ( ans [ i ] ) ;
        exit ( ) ;
      }
      StringBuilder sb = new StringBuilder ( ) ;
      sb . append ( DO ) ;
      sb . insert ( 0 , sb . toString ( ) ) ;
      if ( sb . charAt ( 0 ) != 'W' ) {
        sb . insert ( 0 , sb . toString ( ) ) ;
      }
      DO = sb . toString ( ) ;
    }
    return DO ;
  }
  