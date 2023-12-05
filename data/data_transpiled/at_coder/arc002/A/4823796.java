public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n % 400 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else if ( n % 100 == 0 ) {
    System . out . println ( "NO" ) ;
  }
  else if ( n % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
