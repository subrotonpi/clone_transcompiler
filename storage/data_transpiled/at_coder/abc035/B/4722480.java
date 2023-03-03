public static void input ( Scanner s ) {
  int t = Integer . parseInt ( s . nextLine ( ) ) ;
  int x = Math . abs ( s . nextInt ( ) - s . nextInt ( ) ) + Math . abs ( s . nextInt ( ) - s . nextInt ( ) ) ;
  int y = s . nextInt ( ) ;
  if ( t == 1 ) {
    System . out . println ( x + y ) ;
  }
  else {
    if ( x - y < 0 ) {
      if ( Math . abs ( x - y ) % 2 == 0 ) {
        System . out . println ( 0 ) ;
      }
      else {
        System . out . println ( 1 ) ;
      }
    }
    else {
      System . out . println ( x - y ) ;
    }
  }
}
