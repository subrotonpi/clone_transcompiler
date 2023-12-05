static final int [ ] primes = new int [ ] {
  2 , 3 }
  ;
  int numPrime = 2 ;
  for ( int n : xrange ( 5 , 10 * 6 ) ) {
    if ( n % 10000 == 0 ) System . out . println ( n ) ;
    for ( int i : xrange ( numPrime ) ) {
      if ( n % primes [ i ] == 0 ) break ;
      if ( n < primes [ i ] * primes [ i ] ) break ;
    }
    if ( n % primes [ i ] == 0 ) continue ;
    primes [ numPrime ] = n ;
    numPrime ++ ;
  }
  /* Generate a prime array */
  for ( int i : xrange ( numPrime ) ) {
    /* Generate a prime array */
    for ( int p : xrange ( numPrime ) ) {
      /* Factor */
      for ( int p : xrange ( p ) ) {
        if ( n % p == 0 ) return p ;
        if ( n < p * p ) break ;
      }
    }
    /* Convert to base */
    int r = 0 ;
    for ( int i = 0 ;
    i < s ;
    i ++ ) {
      r *= s ;
      r += ( s - '0' ) ;
    }
    /* Convert to base */
    int N = 32 ;
    int J = 500 ;
    final File OUT = new File ( "output.txt" ) ;
    OUT . println ( "Case #1:" ) ;
    for ( String l : new String [ ] {
      "0" , "1" }
      ) {
        String s = "1" + StringUtils . leftPad ( l , 2 , "0" ) + "1" ;
        boolean jamCoin = true ;
        int [ ] factors = new int [ N ] ;
        for ( int i = 0 ;
        i < range ( 2 , 11 ) ;
        i ++ ) {
          int base = xrange ( 2 , 11 ) ;
          int x = toBase ( s , base ) ;
          factors [ i ] = factor ( x ) ;
          if ( factors [ i ] == x ) {
            jamCoin = false ;
            break ;
          }
        }
        if ( jamCoin ) {
          String answer = s + " " + StringUtils . leftPad ( factors , 2 , "0" ) ;
          OUT . println ( answer ) ;
          J -- ;
          if ( J == 0 ) break ;
        }
      }
      OUT . close ( ) ;
    }
    