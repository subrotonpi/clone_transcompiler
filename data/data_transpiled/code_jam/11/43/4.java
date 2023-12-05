static final Scanner solve = new Scanner ( System . in ) {
  private final int [ ] countprimes = new int [ 1000001 ] ;
  private final int [ ] primes = new int [ 1000001 ] ;
  int np = 0 ;
  for ( int x = 2 ;
  x < 1000001 ;
  x ++ ) {
    boolean isPrime = true ;
    for ( int p : primes ) {
      if ( p * p > x ) {
        break ;
      }
      if ( x % p == 0 ) {
        isPrime = false ;
        break ;
      }
    }
    if ( isPrime ) {
      primes [ np ] = x ;
      np ++ ;
    }
    countprimes [ x ] = np ;
  }
  private int solve ( int n ) {
    if ( n == 1 ) {
      return 0 ;
    }
    int res = 1 ;
    for ( int power = 2 ;
    power < 41 ;
    power ++ ) {
      int pmax = ( int ) Math . ceil ( Math . exp ( Math . log ( n ) / power ) + 10 ) ;
      while ( pmax * power > n ) {
        pmax -- ;
      }
      res += countprimes [ pmax ] ;
    }
    return res ;
  }
  public String nextLine ( ) {
    return input . nextLine ( ) . trim ( ) ;
  }
  public String doTest ( ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int res = solve ( n ) ;
    return String . valueOf ( res ) ;
  }
}
