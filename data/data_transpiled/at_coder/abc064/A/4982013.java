public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int g = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int num = r * 100 + g * 10 + b ;
  if ( num % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
