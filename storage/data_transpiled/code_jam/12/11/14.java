public static int solve ( ) {
  int a = scanner . nextInt ( ) ;
  int b = scanner . nextInt ( ) ;
  a = Integer . parseInt ( a ) ;
  b = Integer . parseInt ( b ) ;
  List < Double > p = CollectionUtils . getDoubleList ( scanner . nextInt ( ) ) ;
  int answer = 2 + b ;
  double prod = 1.0 ;
  for ( int kk = 0 ;
  kk < a + 1 ;
  kk ++ ) {
    int k = a - kk ;
    int numSuccess = k + ( b - ( a - k ) ) + 1 ;
    int numFail = numSuccess + b + 1 ;
    answer = Math . min ( answer , prod * numSuccess + ( 1 - prod ) * numFail ) ;
    if ( p . size ( ) > 0 ) {
      prod = prod * p . remove ( 0 ) ;
    }
  }
  return answer ;
}
