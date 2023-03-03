private static void input ( int n , int m ) {
  int [ ] [ ] E = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    x -- ;
    y -- ;
    E [ x ] [ y ] = 1 ;
  }
  DP = new int [ 1 << n ] ;
  DP [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < E [ i ] ;
    j ++ ) {
      DP [ i ] += E [ j ] ;
    }
  }
}
