public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int y = 0 ;
  int x = max ( a ) ;
  if ( max ( a ) - min ( a ) > 1 ) {
    System . out . println ( "No" ) ;
  }
  else if ( max ( a ) == min ( a ) ) {
    if ( max ( a ) == n - 1 || n >= 2 * max ( a ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] == x ) {
        y ++ ;
      }
    }
    if ( y >= 2 * ( x - ( n - y ) ) && x - n + y > 0 && n - y > 0 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
