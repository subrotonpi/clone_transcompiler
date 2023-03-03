public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A % 3 == 0 || B % 3 == 0 || ( A + B ) % 3 == 0 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
  return A ;
}
