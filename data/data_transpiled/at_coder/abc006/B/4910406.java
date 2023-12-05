public static void print ( int n ) {
  int [ ] a = {
    0 , 0 , 1 }
    ;
    if ( n > 3 ) {
      for ( int i = 0 ;
      i < n - 3 ;
      i ++ ) {
        a [ ( i % 3 ) - 1 ] = ( a [ 0 ] + a [ 1 ] + a [ 2 ] ) % 10007 ;
      }
    }
    System . out . println ( a [ ( n % 3 ) - 1 ] ) ;
  }
  