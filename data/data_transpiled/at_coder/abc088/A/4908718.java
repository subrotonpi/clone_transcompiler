public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int nmod = n % 500 ;
  if ( nmod <= a ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
