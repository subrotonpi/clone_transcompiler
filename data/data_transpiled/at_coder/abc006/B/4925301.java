public static void print ( int n ) {
  int [ ] a = {
    0 , 0 , 1 }
    ;
    for ( int i = 3 ;
    i < n ;
    i ++ ) {
      a [ i ] = Math . pow ( a [ i - 3 ] , 10007 ) ;
    }
    System . out . println ( a [ n - 1 ] ) ;
  }
  