public static void print ( String s ) {
  s = input ( ) ;
  int redCount = s . indexOf ( '0' ) ;
  int blueCount = s . indexOf ( '1' ) ;
  System . out . println ( min ( redCount , blueCount ) * 2 ) ;
}
