public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > 0 ) {
    System . out . println ( B - A ) ;
  }
  else if ( A < 0 && B > 0 ) {
    System . out . println ( B - A - 1 ) ;
  }
  else {
    System . out . println ( Math . abs ( B - A ) ) ;
  }
  return B ;
}
