public static void input ( Scanner s ) {
  int t = Integer . parseInt ( s . nextLine ( ) ) ;
  int n = s . nextInt ( ) ;
  int u = s . nextInt ( ) ;
  int d = s . nextInt ( ) ;
  int l = s . nextInt ( ) ;
  int r = s . nextInt ( ) ;
  int x = Math . abs ( l - r ) ;
  int y = Math . abs ( u - d ) ;
  if ( t == 1 ) {
    System . out . println ( x + y + n ) ;
  }
  else {
    if ( x + y < n && ( n - ( x + y ) ) % 2 == 0 ) {
      System . out . println ( 0 ) ;
      exit ( ) ;
    }
    else if ( x + y < n && ( n - ( x + y ) ) % 2 == 1 ) {
      System . out . println ( 1 ) ;
      exit ( ) ;
    }
    else {
      System . out . println ( x + y - n ) ;
    }
  }
}
