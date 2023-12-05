static int [ ] primes ( ) {
  int [ ] primes = {
    2 , 3 , 5 , 7 , 11 , 13 , 17 , 19 , 23 , 29 , 31 , 37 , 41 , 43 , 47 , 53 , 59 , 61 , 67 , 71 , 73 , 79 , 83 , 89 , 97 }
    ;
    {
      for ( int p : primes ) {
        int cp = n ;
        while ( cp != 0 && cp % p == 0 ) {
          count [ p ] ++ ;
          cp = cp / p ;
        }
      }
    }
    {
      int [ ] cnt = new int [ primes . length ] ;
      for ( int p : primes ) {
        cnt [ p ] = 0 ;
      }
      for ( int i = 1 ;
      i <= Integer . MAX_VALUE ;
      i ++ ) {
        getPrime ( i , cnt ) ;
      }
    }
    int res = 0 ;
    for ( int p1 : primes ) {
      if ( cnt [ p1 ] >= 4 ) {
        for ( int p2 : primes ) {
          if ( cnt [ p2 ] >= 4 && p1 > p2 ) {
            for ( int p3 : primes ) {
              if ( cnt [ p3 ] >= 2 && p3 != p1 && p3 != p2 ) {
                res ++ ;
              }
            }
          }
        }
      }
    }
    for ( int p1 : primes ) {
      if ( cnt [ p1 ] >= 74 ) {
        res ++ ;
      }
    }
    System . out . println ( res ) ;
    return primes ;
  }
  