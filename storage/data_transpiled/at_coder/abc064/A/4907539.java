public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int g = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int number = 100 * r + 10 * g + b ;
  if ( number % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
