public static void UnionFind ( int N ) {
  {
    int [ ] parent = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) parent [ i ] = i ;
    rank = new int [ N ] ;
    Arrays . fill ( parent , - 1 ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( parent [ i ] == parent [ i ] ) {
        return ;
      }
      else {
        parent [ i ] = find ( parent [ i ] ) ;
        return ;
      }
    }
    boolean same = ( parent [ 0 ] == parent [ 1 ] ) ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      int x = parent [ i ] ;
      int y = parent [ i ] ;
      if ( rank [ x ] < rank [ y ] ) parent [ i ] = y ;
      else {
        parent [ i ] = x ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
    }
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P [ i ] = i ;
    UF . union ( P [ i ] , P [ i ] ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( UF . find ( P [ i ] ) == UF . find ( i ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
