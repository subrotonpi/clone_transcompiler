public static void input ( Scanner in ) {
  int n = in . nextInt ( ) ;
  if ( n % 2 == 0 ) {
    if ( in . nextInt ( ) != in . nextInt ( ) - 1 ) {
      System . out . println ( "Second" ) ;
    }
    else {
      System . out . println ( "First" ) ;
    }
  }
  else {
    if ( in . nextInt ( ) == in . nextInt ( ) - 1 ) {
      System . out . println ( "Second" ) ;
    }
    else {
      System . out . println ( "First" ) ;
    }
  }
}
