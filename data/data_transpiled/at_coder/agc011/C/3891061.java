public static void UnionFind ( int n ) {
  int u , v [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    v [ i ] = - 1 ;
  }
  /* find first */
  if ( v [ 0 ] < 0 ) {
    /* return v[0]; */
  }
  else {
    v [ 0 ] = find ( v [ 0 ] ) ;
    /* unite */
    v [ 0 ] = v [ 0 ] ;
    /* unite */
    v [ 1 ] = v [ 1 ] ;
    /* unite */
    v [ 2 ] = v [ 2 ] ;
    /* unite */
    v [ 3 ] = v [ 3 ] ;
    /* root */
    v [ 4 ] = v [ 5 ] < 0 ? - 1 : 0 ;
    /* same */
    v [ 5 ] = v [ 6 ] ;
    /* size */
    v [ 6 ] = v [ 7 ] ;
  }
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  UnionFind uf = new UnionFind ( 2 * N ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    u = Integer . parseInt ( input . nextLine ( ) ) ;
    v [ u ] -- ;
    v [ v ] -- ;
    uf . unite ( u , N + v ) ;
    uf . unite ( N + u , v ) ;
  }
  int alone = 0 ;
  int bi = 0 ;
  int unko = 0 ;
  for ( int u = 0 ;
  u < N ;
  u ++ ) {
    if ( uf . root ( u ) || uf . root ( N + u ) ) {
      if ( uf . size ( u ) == 1 ) alone ++ ;
      else if ( uf . same ( u , N + u ) ) unko ++ ;
      else bi ++ ;
    }
  }
  int ans = 0 ;
  ans += alone * N ;
  ans += N * alone ;
  ans -= alone * alone ;
  ans += bi * bi * 2 ;
  ans += bi * unko ;
  ans += unko * bi ;
  ans += unko * unko ;
  System . out . println ( ans ) ;
}
