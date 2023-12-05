public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = a % 500 ;
  if ( b >= c ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
