public static int solve ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > 0 && B > 0 ) {
    System . out . println ( Math . abs ( B - A ) ) ;
  }
  else if ( A < 0 && B < 0 ) {
    System . out . println ( Math . abs ( B - A ) ) ;
  }
  else if ( A < 0 && B > 0 ) {
    System . out . println ( B - A - 1 ) ;
  }
  else if ( A > 0 && B < 0 ) {
    System . out . println ( A - B - 1 ) ;
  }
  return A ;
}
