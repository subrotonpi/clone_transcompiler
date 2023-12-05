@ OperatorFactory public static void operatorFactory ( ) throws IOException {
  Scanner fi = new Scanner ( System . in ) ;
  int maxn = 10 * 6 + 100 ;
  int [ ] a = new int [ maxn ] ;
  int [ ] primes = new int [ maxn ] ;
  for ( int i = 2 ;
  i < maxn ;
  i ++ ) {
    if ( a [ i ] == 1 ) {
      primes [ i ] = i ;
      int j = i + i ;
      while ( j < maxn ) {
        a [ j ] = 0 ;
        j += i ;
      }
    }
  }
  for ( int run = 0 ;
  run < Integer . parseInt ( fi . nextLine ( ) ) ;
  run ++ ) {
    int res = 0 ;
    int n = Integer . parseInt ( fi . nextLine ( ) ) ;
    for ( int p : primes ) {
      if ( p * p > n ) break ;
      int p2 = p * p ;
      while ( p2 <= n ) {
        res ++ ;
        p2 *= p ;
      }
    }
    if ( n == 1 ) res = - 1 ;
    System . out . println ( "Case #" + ( run + 1 ) + ": " + ( res + 1 ) ) ;
  }
}
