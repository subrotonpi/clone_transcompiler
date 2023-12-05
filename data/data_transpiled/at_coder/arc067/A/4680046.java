@ VisibleForTesting static LinkedHashMap < Integer , Integer > primes ( ) {
  LinkedHashMap < Integer , Integer > primes = new LinkedHashMap < > ( ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    for ( int j = 2 ;
    j <= ( int ) ( i * .5 ) ;
    j ++ ) {
      while ( i % j == 0 ) {
        i /= j ;
        primes . put ( j , 1 ) ;
      }
    }
    if ( i > 1 ) {
      primes . put ( i , 1 ) ;
    }
  }
  int cnt = 1 ;
  int mod = 10 * 9 + 7 ;
  for ( Integer x : primes . keySet ( ) ) {
    cnt *= primes . get ( x ) + 1 ;
    cnt %= mod ;
  }
  System . out . println ( cnt ) ;
  return primes ;
}
