public static boolean solve ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  /*solve*/
  int q = N * ( N + 1 ) / 2 ;
  if ( Integer . parseInt ( A . get ( 0 ) ) % q != 0 ) {
    return false ;
  }
  int times = Integer . parseInt ( A . get ( 1 ) ) / q ;
  int cnt = 0 ;
  for ( int i = 1 , j = 1 ;
  i < N ;
  j ++ ) {
    int dif = times + i - j ;
    if ( dif % N != 0 || dif < 0 ) {
      return false ;
    }
    cnt += dif / N ;
  }
  return times == cnt ;
}
