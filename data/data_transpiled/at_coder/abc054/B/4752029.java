public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ( ) {
  int N = Integer . parseInt ( input [ 0 ] [ 0 ] ) ;
  int M = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
  int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] = 1 ;
  for ( int i = 0 ;
  i < N - M + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N - M + 1 ;
    j ++ ) {
      for ( int k = 0 ;
      k < M ;
      k ++ ) {
        if ( a [ i + k ] [ j + l ] [ k ] != b [ k ] [ l ] [ k ] [ l ] [ j ] ) {
        }
      }
    }
  }
  return null ;
}
