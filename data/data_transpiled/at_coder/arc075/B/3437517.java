@ VisibleForTesting static int from ( int input ) {
  int left = - 1 ;
  int right = 0 ;
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int [ ] h = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    h [ i ] = Integer . parseInt ( input ) ;
    right += h [ i ] / b + 1 ;
  }
  return ( int ) ( ( t ) -> {
    int cnt = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( h [ i ] - b * t > 0 ) {
        cnt += Math . ceil ( ( h [ i ] - b * t ) / ( a - b ) ) ;
      }
    }
    return cnt <= t ;
  }
  ) ;
}
