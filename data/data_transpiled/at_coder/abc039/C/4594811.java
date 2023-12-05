public static String st ( ) {
  st = input . substring ( 0 , 12 ) ;
  st *= 2 ;
  int n = st . indexOf ( "WWBWBWBWW" ) ;
  String [ ] L1 = {
    "Mi" , "Re" , "Do" }
    ;
    String [ ] L2 = {
      "Si" , "La" , "So" , "Fa" }
      ;
      if ( n % 2 == 0 ) {
        System . out . println ( L1 [ n / 2 ] ) ;
      }
      else {
        System . out . println ( L2 [ n / 2 - 2 ] ) ;
      }
      return st ;
    }
    