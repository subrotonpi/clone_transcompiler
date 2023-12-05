public static void print ( String s ) {
  s = input ( ) ;
  int c0 = s . indexOf ( "0" ) ;
  int c1 = s . indexOf ( "1" ) ;
  System . out . println ( s . length ( ) - Math . abs ( c0 - c1 ) ) ;
}
