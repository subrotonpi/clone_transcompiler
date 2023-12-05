public static int N ( ) {
  int A , B ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( A - B ) % 2 != 0 ) {
    System . out . println ( "Borys" ) ;
  }
  else {
    System . out . println ( "Alice" ) ;
  }
  return N ;
}
