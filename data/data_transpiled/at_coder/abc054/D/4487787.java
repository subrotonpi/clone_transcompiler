@ VisibleForTesting static void main ( String [ ] args ) {
  final int MAX = 40001 ;
  /* main */
  int N = Integer . parseInt ( args [ 0 ] ) ;
  int Ma = Integer . parseInt ( args [ 1 ] ) ;
  int Mb = Integer . parseInt ( args [ 2 ] ) ;
  int abc [ ] [ ] = new int [ N ] [ 10 * N + 1 ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    abc [ a ] [ 0 ] = Integer . parseInt ( args [ 3 ] ) ;
  }
  int dp [ ] [ ] = new int [ 10 * N + 1 ] [ 10 * N + 1 ] ;
  for ( int b = 0 ;
  b < N ;
  b ++ ) {
    for ( int a = 0 ;
    a < 10 ;
    a ++ ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        dp [ b ] [ a ] = Integer . parseInt ( args [ 4 + i ] ) ;
      }
    }
  }
  final int A = abc [ 0 ] ;
  final int B = abc [ 1 ] ;
  final int C = abc [ 2 ] ;
  Map < Integer , Integer > mem = new HashMap < Integer , Integer > ( ) ;
  mem . put ( new Integer ( 0 ) , A ) ;
  mem . put ( new Integer ( B ) , C ) ;
  mem . put ( new Integer ( 0 ) , 0 ) ;
  /* solve */
  int i = 0 ;
  if ( mem . containsKey ( new Integer ( i ) ) ) {
    return mem . get ( new Integer ( i ) ) ;
  }
  if ( i == 0 ) {
    return MAX ;
  }
  int ai = abc [ i ] ;
  int bi = abc [ i ] ;
  int ci = abc [ i ] ;
  int tukawanai = solve ( i - 1 , a , b ) ;
  if ( a - ai >= 0 && b - bi >= 0 ) {
    int pre = solve ( i - 1 , a - ai , b - bi ) ;
    if ( pre != MAX ) {
      mem . put ( new Integer ( i ) , Math . min ( tukawanai , pre + ci ) ) ;
      return ;
    }
  }
  mem . put ( new Integer ( i ) , tukawanai ) ;
  /* solve */
  int res = MAX ;
  for ( int a = 1 ;
  a <= 10 * N ;
  a ++ ) {
    int aa = a * Mb ;
    if ( aa % M @ @