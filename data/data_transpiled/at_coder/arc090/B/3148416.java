public static void weightedUnionFind ( ) {
  int [ ] nodes = new int [ n ] ;
  int [ ] weight = new int [ n ] ;
  int i ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    nodes [ i ] = - 1 ;
    weight [ i ] = 0 ;
  }
  int i = 0 ;
  for ( ;
  i < n ;
  i ++ ) {
    int l = i ;
    int r = i ;
    tree . relate ( l , r , d ) ;
  }
  System . out . println ( "Yes" ) ;
}
