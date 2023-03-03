@ SafeVarargs public static < T > Collection < Integer > read ( Reader input ) throws IOException {
  int [ ] W = input . read ( ) ;
  int N = W . length ;
  Collection < Integer > C = new ArrayList < > ( W . length ) ;
  if ( C . size ( ) == 1 ) {
    System . out . println ( N ) ;
    System . out . println ( 1 ) ;
    exit ( 0 ) ;
  }
  /* Z algo */
  int [ ] A = new int [ N ] ;
  int i = 1 ;
  int j = 0 ;
  A [ 0 ] = 0 ;
  int l = S . length ;
  while ( i < l ) {
    while ( i + j < l && S [ j ] == S [ i + j ] ) j ++ ;
    A [ i ++ ] = j ;
    if ( j == 0 ) {
      i ++ ;
      continue ;
    }
    int k = 1 ;
    while ( l - i > k && k < j - A [ k ] ) {
      A [ i + k ] = A [ k ++ ] ;
    }
    i += k ;
    j -= k ;
  }
  return C ;
}
