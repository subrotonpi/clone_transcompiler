public static void print ( int n ) {
  int [ ] hoge = {
    0 , 0 , 1 }
    ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      hoge [ i ] = ( hoge [ hoge . length - 1 ] + hoge [ hoge . length - 2 ] + hoge [ hoge . length - 3 ] ) % 10007 ;
    }
    System . out . println ( hoge [ n - 1 ] ) ;
  }
  