public static void print ( String input ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ r ] [ c ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    a [ i ] = new int [ ] {
      Integer . parseInt ( input ) }
      ;
    }
    int ans ;
    if ( d % 2 == 0 ) {
      ans = a [ 0 ] [ 0 ] ;
    }
    else {
      ans = Math . max ( a [ 1 ] [ 0 ] , a [ 0 ] [ 1 ] ) ;
    }
    for ( int i = 0 ;
    i < d ;
    i ++ ) {
      for ( int j = 0 ;
      j < d ;
      j ++ ) {
        if ( i >= r || j >= c ) {
          break ;
        }
        if ( i + j <= d && ( i + j ) % 2 == d % 2 ) {
          ans = Math . max ( ans , a [ i ] [ j ] ) ;
        }
      }
    }
    System . out . println ( ans ) ;
  }
  