static int INF = 10 * * 17 ;
int [ ] [ ] solve ( int n , int q , int [ ] [ ] se , int [ ] dists , int [ ] uv , boolean debug ) {
  int [ ] [ ] shortest = new int [ n ] [ n ] ;
  for ( int i : xrange ( n ) ) {
    for ( int j : xrange ( n ) ) {
      if ( ( dists [ i ] [ j ] != - 1 ) && ( dists [ j ] [ j ] != - 1 ) ) {
        shortest [ i ] [ j ] = dists [ i ] [ j ] ;
      }
    }
  }
  for ( int k : xrange ( n ) ) {
    for ( int i : xrange ( n ) ) {
      for ( int j : xrange ( n ) ) {
        shortest [ i ] [ j ] = Math . min ( shortest [ i ] [ j ] , shortest [ i ] [ k ] + shortest [ k ] [ j ] ) ;
      }
    }
  }
  /* best */
  if ( ( shortest [ i ] [ j ] <= se [ i ] [ 0 ] ) && ( shortest [ i ] [ j ] <= se [ i ] [ 1 ] ) ) {
    return ( float ) shortest [ i ] [ j ] / se [ i ] [ 1 ] ;
  }
  int [ ] [ ] actual = new int [ q ] [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      actual [ i ] [ j ] = Math . min ( actual [ i ] [ j ] , actual [ i ] [ k ] + actual [ k ] [ j ] ) ;
    }
  }
  int [ ] ans = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    ans [ i ] = actual [ uv [ i ] [ 0 ] - 1 ] [ uv [ i ] [ 1 ] - 1 ] ;
  }
  return Arrays . copyOf ( ans , n ) ;
}
