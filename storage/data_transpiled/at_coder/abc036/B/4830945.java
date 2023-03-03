public static void print ( int n ) {
  int m = n - 1 ;
  int [ ] [ ] hoge = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hoge [ i ] = new int [ n ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      System . out . print ( hoge [ m - j ] [ i ] + " " ) ;
    }
    System . out . println ( "" ) ;
  }
}
