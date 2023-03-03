public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  if ( Math . abs ( c - a ) <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( Math . abs ( b - a ) <= d && Math . abs ( c - b ) <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
