static final double [ ] [ ] range ( int i , int j ) {
  int inf = i * j ;
  int mod = i * j ;
  /* LI */
  int [ ] [ ] li = new int [ 10 ] [ 10 ] ;
  /* LI_ */
  int [ ] [ ] li = new int [ 10 ] [ 10 ] ;
  /* LF */
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) li [ j ] [ 0 ] = Integer . parseInt ( li [ j ] [ 0 ] ) ;
  /* LS */
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) li [ j ] [ 1 ] = Integer . parseInt ( li [ j ] [ 1 ] ) ;
  /* I */
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) li [ j ] [ 0 ] = Integer . parseInt ( li [ j ] [ 2 ] ) ;
  /* F */
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) li [ j ] [ 0 ] = Integer . parseInt ( li [ j ] [ 1 ] ) ;
  /* S */
  for ( int j = 0 ;
  j < 10 ;
  j ++ ) {
    int mm = - 1 ;
    while ( ma > mi ) {
      mm = ( ma + mi ) / 2 ;
      if ( li [ j ] [ 0 ] > mm ) {
        mi = mm + 1 ;
      }
      else {
        ma = mm ;
      }
    }
    if ( li [ j ] [ 0 ] > mm ) {
      return mm + 1 ;
    }
  }
  /* K */
  int N = i ;
  int [ ] A = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    A [ j ] [ 0 ] = li [ j ] ;
  }
  /* K */
  int k = bs ( A , 0 , 10 * 12 ) ;
  int t = k - 1 ;
  /* K */
  c = 0 ;
  /* K */
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    int ct = ( t - a + j ) / 2 ;
    c += ct ;
    r += a * ct ;
    int n = ct ;
    r += ( n * ( n - 1 ) / 2 ) * d ;
  }
  r += ( K - c ) * k ;
  return A ;
}
