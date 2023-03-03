public static void print ( int n ) {
  int [ ] array = {
    0 , 0 , 1 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int a = array [ i ] + array [ i + 1 ] + array [ i + 2 ] ;
      array [ i ] = a % 10007 ;
    }
    System . out . println ( array [ n - 1 ] ) ;
  }
  