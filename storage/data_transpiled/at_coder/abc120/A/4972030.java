public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A * C <= B ) {
    System . out . println ( C ) ;
  }
  else {
    System . out . println ( B / A ) ;
  }
  return B ;
}
