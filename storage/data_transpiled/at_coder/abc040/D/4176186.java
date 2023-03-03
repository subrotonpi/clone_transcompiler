static final int [ ] [ ] getSortedArrays ( ) {
  final int [ ] [ ] in = new int [ in . length ] [ ] ;
  System . arraycopy ( in , 0 , in [ 0 ] , 0 , in [ 0 ] . length ) ;
  final int [ ] [ ] li = new int [ in . length ] [ ] ;
  final int [ ] [ ] qs = new int [ in . length ] [ ] ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    li [ i ] = in [ i ] [ 0 ] ;
  }
  final int [ ] [ ] li = new int [ in . length ] [ ] ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    li [ i ] [ 0 ] = in [ i ] [ 0 ] ;
  }
  final int [ ] [ ] querydic = new int [ in . length ] [ ] ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    query [ i ] [ 0 ] = in [ i ] [ 1 ] ;
  }
  final UnionFind uf = new UnionFind ( ) ;
  final UnionFind ufdic = new UnionFind ( ) ;
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    final int wi = in [ i ] [ 0 ] ;
    if ( road . length == 0 ) break ;
    final int y = road . pop ( ) ;
    final int a = in [ i ] [ 1 ] ;
    final int b = in [ i ] [ 2 ] ;
    if ( y <= wi ) {
      uf . unite ( a , b ) ;
    }
    else uf . unite ( a , b ) ;
  }
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    uf . unite ( i , uf . elem [ i ] ) ;
  }
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    System . arraycopy ( in [ i ] , 0 , uf . unite ( i , in [ i ] [ 0 ] ) , uf . elem [ i ] ) ;
  }
  for ( int i = 0 ;
  i < in . length ;
  i ++ ) {
    System . arraycopy ( in [ i ] [ 0 ] , uf . unite ( i , in [ i ] [ 1 ] ) , uf . elem [ i ] ) ;
  }
  return uf . unite ( 0 , in [ i ] [ 0 ] ) ;
}
