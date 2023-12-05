public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int p = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] m = {
    0 , 0 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      m [ a [ i ] % 2 ] ++ ;
    }
    if ( m [ 1 ] == 0 && p == 1 ) {
      System . out . println ( 0 ) ;
    }
    else {
      System . out . println ( m [ 1 ] > 0 ? 2 * m [ 0 ] * 2 * ( m [ 1 ] - 1 ) : 2 * m [ 0 ] ) ;
    }
  }
  