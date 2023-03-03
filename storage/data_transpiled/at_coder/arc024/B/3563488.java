public static void print ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] co = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    co [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    co [ i ] = co [ i ] ;
  }
  int m = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( co [ i ] == 0 ) {
      m ++ ;
    }
  }
  if ( m == 0 || m == n ) {
    System . out . println ( - 1 ) ;
    quit ( ) ;
  }
  int ans = 0 ;
  int key = co [ 0 ] ;
  int s = 1 ;
  for ( int i = 1 ;
  i < 2 * n ;
  i ++ ) {
    if ( co [ i ] == key ) {
      s ++ ;
    }
    else {
      key = co [ i ] ;
      ans = Math . max ( ans , ( s - 1 ) / 2 + 1 ) ;
      s = 1 ;
    }
  }
  ans = Math . max ( ans , s / 2 ) ;
  System . out . println ( ans ) ;
}
