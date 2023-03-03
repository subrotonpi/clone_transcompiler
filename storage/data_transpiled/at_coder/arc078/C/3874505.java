private static void solve ( String SECRET ) {
  int num_asks = 0 ;
  {
    int n = Integer . parseInt ( SECRET ) ;
    nonNull ++ num_asks ;
    assert 1 <= n && n <= Integer . MAX_VALUE / 1e18 ;
    if ( SECRET != null ) {
      return ( n <= SECRET ) ? ( Integer . toString ( n ) <= Integer . toString ( SECRET ) ) : ( Integer . toString ( n ) ) ;
    }
    else {
      System . out . println ( "?" + n ) ;
      return input . equals ( "Y" ) ;
    }
  }
  if ( BigInteger . valueOf ( 100000000000 ) . compareTo ( BigInteger . valueOf ( 100000000000 ) ) == 0 ) {
    for ( int k = 1 ;
    k < 19 ;
    k ++ ) {
      if ( BigInteger . valueOf ( "9" . pow ( k ) ) . compareTo ( BigInteger . valueOf ( k ) ) == 0 ) {
        return new BigInteger ( 10 * ( k - 1 ) , num_asks ) ;
      }
    }
  }
  else {
    for ( int k = 1 ;
    k < 10 ;
    k ++ ) {
      if ( ! BigInteger . valueOf ( 10 * k ) . compareTo ( BigInteger . valueOf ( k ) ) == 0 ) {
        int low = 10 * ( k - 1 ) ;
        int high = ( 10 * k ) - 1 ;
        int ret = - 1 ;
        while ( low <= high ) {
          int mid = ( low + high ) / 2 ;
          if ( BigInteger . valueOf ( mid ) . compareTo ( BigInteger . valueOf ( "9" . pow ( k ) ) ) == 0 ) {
            ret = mid ;
            high = mid - 1 ;
          }
          else {
            low = mid + 1 ;
          }
        }
        return ret == 0 ? - 1 : 1 ;
      }
    }
  }
  BigInteger ans = BigInteger . valueOf ( 1 ) ;
  System . out . println ( "!" + ans ) ;
  exit ( 0 ) ;
  final int num_iter = 0 ;
  do {
    num_iter ++ ;
    int secret_len = RANDOM . nextInt ( 9 ) ;
    SECRET = RANDOM . nextInt ( 10 * ( secret_len - 1 ) ) ;
    ans = solve ( SECRET ) ;
  }
  while ( num_iter <= 64 ) ;
  if ( SECRET != ans || num_asks > 64 ) {
    System . out . println ( num_iter + ".." + SECRET + ":" + ans + " " + num_asks ) ;
    break ;
  }
  if ( num_iter % 1000 == 0 ) System . out . println ( num_iter ) ;
}
