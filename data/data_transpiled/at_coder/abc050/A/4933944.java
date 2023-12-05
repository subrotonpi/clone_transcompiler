public static int A ( String op , String B ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( op . equals ( "+" ) ) {
    System . out . println ( A + B ) ;
  }
  else {
    System . out . println ( A - B ) ;
  }
  return A ;
}
