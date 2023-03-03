static final Map < Integer , Boolean > cache = new HashMap < Integer , Boolean > ( ) {
  private static final long serialVersionUID = - 5743705263738203615L ;
  private boolean isPrime ( int n ) {
    if ( cache . containsKey ( n ) ) return cache . get ( n ) ;
    cache . put ( n , kk ( n ) ) ;
    return cache . get ( n ) ;
  }
  private boolean kk ( int n ) {
    if ( n == 2 ) return true ;
    if ( n % 2 == 0 ) return false ;
    int x = 3 ;
    while ( x * x <= n ) {
      if ( n % x == 0 ) return false ;
      x += 2 ;
    }
    return true ;
  }
  private static long [ ] primes ( int n ) {
    final long [ ] res = new long [ n ] ;
    {
      res [ 0 ] = 2 ;
      int i = 3 ;
      while ( i * i <= n ) {
        if ( isPrime ( i ) ) res [ i ] = i ;
        i += 2 ;
      }
      return res ;
    }
  }
  private static long foo ( BufferedReader ibr ) throws IOException {
    int n = Integer . parseInt ( ibr . readLine ( ) ) ;
    if ( ( n == 1 ) || ( n == 2 ) ) return 0 ;
    long res = 0 ;
    for ( ;
    ;
    ) {
      if ( isPrime ( n ) ) {
        primes [ n ] = x ;
      }
      x += 2 ;
    }
    return res ;
  }
}
