public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  n = n % 500 ;
  if ( n <= a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
