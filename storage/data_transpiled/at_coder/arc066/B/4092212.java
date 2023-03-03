@ CopyOfPointable public static int [ ] dp ( int n ) {
  final int MOD = 10 * 9 + 7 ;
  final int IMAX = 200 ;
  final int JMAX = 2 ;
  /* dp = [ 0 for j in range JMAX ] */
  int [ ] dp = new int [ JMAX + 1 ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    dp [ j ] = 0 ;
    dp [ j ] = 1 ;
  }
  for ( int i = 0 ;
  i < IMAX ;
  i ++ ) {
    int [ ] pre = dp [ i ] ;
    dp [ 2 ] += pre [ 1 ] ;
    boolean d = ( ( 1 << i ) & n ) >> i ;
    if ( d ) {
      dp [ 1 ] += pre [ 0 ] ;
      dp [ 2 ] += pre [ 1 ] ;
    }
    else dp [ 0 ] += pre [ 1 ] ;
  }
  return dp ;
}
