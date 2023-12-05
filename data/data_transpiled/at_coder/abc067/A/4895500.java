public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  if ( a % 3 == 0 || b % 3 == 0 || ( a + b ) % 3 == 0 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
