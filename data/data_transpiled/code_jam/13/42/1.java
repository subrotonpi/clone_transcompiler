public static int getApproved ( int N , int P ) {
  assert P > 0 ;
  if ( N == 0 ) return 0 ;
  int total = 2 * N ;
  if ( P == total ) return total - 1 ;
  if ( 2 * P <= total ) return 0 ;
  int tmp = getApproved ( N - 1 , P - total / 2 ) ;
  return 2 * tmp + 2 ;
}
