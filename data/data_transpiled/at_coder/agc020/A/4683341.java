public static int N ( ) {
  int A , B ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  int num = Math . abs ( A - B ) + 1 ;
  if ( num % 2 == 1 ) {
    System . out . println ( "Alice" ) ;
  }
  else {
    System . out . println ( "Borys" ) ;
  }
  return num ;
}
