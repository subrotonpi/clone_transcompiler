@ VisibleForTesting static int getDivs ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , List < Integer >> divs = new HashMap < > ( ) ;
  int [ ] primes = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 }
    ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      divs . put ( i , new ArrayList < > ( ) ) ;
      int x = i ;
      while ( x >= 2 ) {
        for ( int p : primes ) {
          if ( x % p == 0 ) {
            x /= p ;
            divs . get ( i ) . add ( p ) ;
          }
        }
      }
    }
    List < Integer > fdivs = Lists . newArrayList ( ) ;
    Collections . sort ( fdivs ) ;
    int ans = 0 ;
    int ge4 = counts . size ( ) ;
    int ge2 = counts . size ( ) ;
    ans += ge4 * ( ge4 - 1 ) / 2 * ( ge2 - 2 ) ;
    int ge14 = counts . size ( ) ;
    ans += ge14 * ( ge2 - 1 ) ;
    ans += ge14 ;
    System . out . println ( ( int ) ans ) ;
    return ans ;
  }
  