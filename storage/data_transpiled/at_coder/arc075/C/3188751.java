public static int mergecount ( int [ ] A ) {
  int cnt = 0 ;
  int n = A . length ;
  if ( n > 1 ) {
    int [ ] A1 = A . clone ( ) ;
    int [ ] A2 = A . clone ( ) ;
    cnt += mergecount ( A1 ) ;
    cnt += mergecount ( A2 ) ;
    int i1 = 0 ;
    int i2 = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( i2 == A2 . length ) {
        A [ i ] = A1 [ i1 ++ ] ;
      }
      else if ( i1 == A1 . length ) {
        A [ i ] = A2 [ i2 ++ ] ;
      }
      else if ( A1 [ i1 ] <= A2 [ i2 ] ) {
        A [ i ] = A1 [ i1 ++ ] ;
      }
      else {
        A [ i ] = A2 [ i2 ++ ] ;
        cnt += n / 2 - i1 ;
      }
    }
  }
  return cnt ;
}
