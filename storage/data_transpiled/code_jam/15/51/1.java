static int solve ( int n , int d , int s0 , int aS , int cs , int rs , int m0 , int am , int cm , int rm ) throws IOException {
  final int [ ] s = new int [ n ] ;
  final int [ ] m = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    s [ i ] = s0 ;
    s [ i ] = ( s [ i - 1 ] * aS + cs ) % rs ;
    m [ i ] = ( m [ i - 1 ] * am + cm ) % rm ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    m [ i ] = m [ i ] % i ;
  }
  final int [ ] r = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    final int a = r [ m [ i ] ] ;
    final int b = r [ m [ i ] ] ;
    final int c = s [ i ] ;
    if ( c < a ) {
      r [ i ] = ( c < b ) ? a : b ;
    }
    else if ( b < c ) {
      r [ i ] = ( a < c ) ? a : b ;
    }
    else {
      r [ i ] = ( a < b ) ? a : b ;
    }
  }
  final int [ ] r1 = new int [ n ] ;
  final int [ ] r2 = new int [ n ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    r1 [ i ] = r [ m [ i ] ] ;
    r2 [ i ] = r [ m [ i ] ] ;
  }
  Arrays . sort ( r1 ) ;
  Arrays . sort ( r2 ) ;
  int a = 0 ;
  int b = 0 ;
  int i = 0 ;
  int j = 0 ;
  while ( i < r2 . length ) {
    final int top = r2 [ i ] ;
    while ( i < r2 . length && r2 [ i ] == top ) {
      i ++ ;
      a ++ ;
    }
    while ( j < r1 . length && r1 [ j ] < top - d ) {
      j ++ ;
      a -- ;
    }
    b = Math . max ( b , a ) ;
  }
  return b ;
}
