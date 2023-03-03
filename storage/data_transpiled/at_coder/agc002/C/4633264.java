public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] b = new int [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    b [ i ] = a [ i ] + a [ i + 1 ] ;
  }
  int start = - 1 ;
  for ( int ind = 0 ;
  ind < b . length ;
  ind ++ ) {
    int length = b [ ind ] ;
    if ( length >= l ) {
      start = ind + 1 ;
      break ;
    }
  }
  if ( start < 0 ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    System . out . println ( "Possible" ) ;
    for ( int i = 1 ;
    i < start ;
    i ++ ) {
      System . out . println ( i ) ;
    }
    for ( int i = start ;
    i < n ;
    i ++ ) {
      System . out . println ( i ) ;
    }
  }
}
