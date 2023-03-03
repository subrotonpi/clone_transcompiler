public static void print ( String s ) {
  s = input . nextLine ( ) ;
  int a_1 = s . indexOf ( "1" ) ;
  int b_1 = s . indexOf ( "0" ) ;
  if ( a_1 <= b_1 ) {
    System . out . println ( 2 * a_1 ) ;
  }
  else {
    System . out . println ( 2 * b_1 ) ;
  }
}
