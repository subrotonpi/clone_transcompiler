static final void solve ( int N ) {
  /* Use the algorithm to solve the number of words */
  int i = 2 ;
  while ( i * i <= N ) {
    if ( n % i == 0 ) {
      return ;
    }
    i ++ ;
  }
  /* Calculate the number of words */
  if ( n < k ) {
    return ;
  }
  int ret = 1 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    ret *= n - i ;
    ret /= ( i + 1 ) ;
  }
  /* Calculate the number of words */
  int [ ] primes = new int [ N + 1 ] ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    if ( isPrime ( i ) ) {
      primes [ i ] = i ;
    }
  }
  int [ ] count = new int [ N + 1 ] ;
  /* Calculate the number of words */
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int p = primes [ i ] ;
    while ( n >= p && n % p == 0 ) {
      count [ p ] ++ ;
      n /= p ;
    }
  }
  /* Calculate the number of words */
  Arrays . sort ( count , Collections . reverseOrder ( ) ) ;
  int over_75 = 0 ;
  int over_25 = 0 ;
  int over_15 = 0 ;
  int over_5 = 0 ;
  int over_3 = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    /* Calculate the number of words */
    int c = count [ i ] ;
    if ( c >= 2 ) {
      over_3 ++ ;
    }
    if ( c >= 4 ) {
      over_5 ++ ;
    }
    if ( c >= 14 ) {
      over_15 ++ ;
    }
    if ( c >= 24 ) {
      over_25 ++ ;
    }
    if ( c >= 74 ) {
      over_75 ++ ;
    }
  }
  int ret = ( over_75 + over_25 * ( over_3 - 1 ) + over_15 * ( over_5 - 1 ) + comb ( over_5 , 2 ) * ( over_3 - 2 ) ) ;
  System . out . println ( ret ) ;
  /* Calculate the number of words */
  for ( String line : System . console ( ) . split ( " " ) ) {
    StringTokenizer tokens = new StringTokenizer ( line , " " ) ;
    N = Integer . parseInt ( tokens .