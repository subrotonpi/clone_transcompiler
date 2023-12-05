static final double INF = Double . MAX_VALUE ;
final double MOD = 10 * 9 + 7 ;
/* LI */
for ( int i = 0 ;
i < in . length ;
i ++ ) {
  /* LI_ */
  for ( int j = 0 ;
  j < in . length ;
  j ++ ) {
    /* LS */
    for ( int j = in . length - 1 ;
    j >= 0 ;
    j -- ) {
      /* II */
    }
    /* SI */
  }
  /* main */
  final double [ ] A = LI ;
  double res = 0 ;
  for ( int e = 0 ;
  e <= 3 ;
  e += 4 ) {
    res += A [ e ] / 2 * 2 ;
  }
  if ( Arrays . equals ( A [ 0 ] , A [ 3 ] ) && Arrays . equals ( A [ 4 ] , A [ 4 ] ) ) {
    double tmp = 3 ;
    for ( int e = 0 ;
    e <= 3 ;
    e += 4 ) {
      tmp += ( A [ e ] - 1 ) / 2 * 2 ;
    }
    if ( res < tmp ) {
      res = tmp ;
    }
  }
  return res + A [ 1 ] ;
}
