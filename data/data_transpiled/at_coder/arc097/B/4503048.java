public static void UnionFind ( int n ) {
  int [ ] par = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = i ;
  rank = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
  }
  int x ;
  int y ;
  int [ ] p ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = par [ i ] ;
    y = par [ i ] ;
    if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
    else {
      par [ y ] = x ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p = par [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = i ;
  }
  UnionFind uf = new UnionFind ( N ) ;
  p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    uf . union ( p [ i ] , i ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( uf . sameCheck ( i + 1 , p [ i ] ) ) res ++ ;
  }
  System . out . println ( res ) ;
}
