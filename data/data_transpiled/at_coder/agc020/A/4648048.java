public static int N ( ) {
  int A , B ;
  int d ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Math . abs ( A - B ) - 1 ;
  if ( d % 2 == 0 ) {
    System . out . println ( "Borys" ) ;
  }
  else {
    System . out . println ( "Alice" ) ;
  }
  return d ;
}
