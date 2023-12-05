public static void print ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  if ( a == x ) {
    System . out . println ( "YES" ) ;
  }
  else if ( a <= x && ( x - a ) <= b ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
