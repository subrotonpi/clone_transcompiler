public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( c - a ) <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    if ( Math . abs ( b - a ) <= d && Math . abs ( c - b ) <= d ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  return a ;
}
