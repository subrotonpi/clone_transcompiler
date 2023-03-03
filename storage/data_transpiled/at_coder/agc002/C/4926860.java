public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] + a [ i - 1 ] >= l ) {
      System . out . println ( "Possible" ) ;
      for ( int j = 1 ;
      j < i ;
      j ++ ) {
        System . out . println ( j ) ;
      }
      for ( int j = n - 1 ;
      j > i ;
      j -- ) {
        System . out . println ( j ) ;
      }
      System . out . println ( i ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
