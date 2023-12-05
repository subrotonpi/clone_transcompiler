public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  int d2 = 0 ;
  int d4 = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] % 4 == 0 ) {
      d4 ++ ;
    }
    else if ( a [ i ] % 2 == 0 ) {
      d2 ++ ;
    }
  }
  if ( d4 >= N / 2 ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( d2 >= N - d4 * 2 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
