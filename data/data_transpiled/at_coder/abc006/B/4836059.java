public static void print ( int n ) {
  int [ ] a = {
    0 , 0 , 0 , 1 }
    ;
    if ( n >= 4 ) {
      for ( int i = 4 ;
      i <= n ;
      i ++ ) {
        a [ i ] = ( a [ i - 1 ] + a [ i - 2 ] + a [ i - 3 ] ) % 10007 ;
      }
    }
    System . out . println ( a [ n ] ) ;
  }
  