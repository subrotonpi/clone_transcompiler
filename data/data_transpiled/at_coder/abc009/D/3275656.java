@ MoreRequires ( "x" ) @ VisibleForTesting static int [ ] matMult ( int [ ] mat1 , int [ ] mat2 , int u , int v , int w ) {
  int e = ( 1 << 32 ) - 1 ;
  int k = Integer . numberOfLeadingZeros ( mat1 ) , m = Integer . numberOfTrailingZeros ( mat2 ) ;
  int [ ] a = new int [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    a [ i ] = Integer . numberOfTrailingZeros ( mat1 [ i ] ) ;
  }
  int [ ] c = new int [ k ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    c [ i ] = Integer . numberOfTrailingZeros ( mat1 [ i ] ) ;
  }
  int [ ] mat = new int [ k ] ;
  mat [ 0 ] = reduce ( c , ( acc << 32 ) ^ a [ 0 ] , k ) ;
  System . out . println ( res ) ;
  for ( int i = 1 ;
  i < k ;
  i ++ ) {
    mat [ i ] ^= e << ( i - 1 ) * 32 ;
  }
  return mat ;
}
