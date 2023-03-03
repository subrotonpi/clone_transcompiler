@ VisibleForTesting static int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( K == 0 ) {
    System . out . println ( 0 ) ;
  }
  else if ( N == 1 || Integer . compare ( a [ 0 ] , a [ 1 ] ) == 0 ) {
    System . out . println ( 1 ) ;
  }
  else {
    float inf = Float . POSITIVE_INFINITY ;
    float [ ] dp = new float [ ( N - 1 ) * N ] ;
    dp [ 0 ] = inf ;
    dp [ 1 ] = 1 ;
    int result = 1 ;
    int oldTotal = a [ 0 ] ;
    for ( int i = 1 ;
    i < N - 1 ;
    i ++ ) {
      int newTotal = oldTotal + a [ i ] ;
      float m = newTotal / oldTotal ;
      int nextMax = i * N + result ;
      int nextMin = Math . max ( nextMax - ( N - 2 - i + 1 ) , i * N ) ;
      for ( int j = nextMax ;
      j >= nextMin ;
      j -- ) {
        float n = dp [ j - N ] ;
        float v = Math . ceil ( m * n + 0.000000001 ) ;
        if ( dp [ j ] > n ) {
          dp [ j ] = n ;
        }
        if ( v <= newTotal && v <= K && dp [ j + 1 ] > v ) {
          dp [ j + 1 ] = v ;
          if ( j == nextMax ) {
            result ++ ;
          }
        }
      }
      oldTotal = newTotal ;
    }
    float last = dp [ ( N - 2 ) * N + result ] ;
    int newTotal = oldTotal + a [ N - 1 ] ;
    float m = newTotal / oldTotal ;
    float v = Math . ceil ( m * last + 0.000000001 ) ;
    if ( v <= newTotal && v <= K ) {
      result ++ ;
    }
    System . out . println ( result ) ;
  }
  return a ;
}
