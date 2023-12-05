public static void input ( Scanner s ) {
  int x , y ;
  x = s . nextInt ( ) ;
  y = s . nextInt ( ) ;
  l = s . nextInt ( ) ;
  if ( l % 2 == 0 ) {
    if ( x == y ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
  if ( l % 2 == 1 ) {
    if ( x != y ) {
      System . out . println ( "First" ) ;
    }
    else {
      System . out . println ( "Second" ) ;
    }
  }
}
