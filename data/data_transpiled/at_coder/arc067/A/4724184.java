public static int N = Integer . parseInt ( input ) {
  int [ ] comp = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    comp [ i ] = 0 ;
  }
  for ( int n = 1 ;
  n <= N ;
  n ++ ) {
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      while ( n % i == 0 ) {
        comp [ i ] ++ ;
        n /= i ;
      }
      if ( n == 1 ) break ;
    }
  }
  final int MOD = 10 * 9 + 7 ;
  int res = 1 ;
  for ( int c : comp ) {
    res *= c + 1 ;
    res %= MOD ;
  }
  System . out . println ( res ) ;
  return res ;
}
