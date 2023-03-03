static final String getTestName ( ) throws IOException {
  int [ ] primes = {
    2 , 3 , 5 , 7 }
    ;
    int [ ] factorCount = {
      0 , 0 , 0 , 0 }
      ;
      int [ ] answer = solveSMALL1 ( m , n , values ) ;
      System . out . println ( "" + Arrays . toString ( answer ) ) ;
      /* Find the smallest prime factorization of "primes" */
      int [ ] minPrimes = {
        0 , 0 , 0 , 0 }
        ;
        int [ ] totalPrimes = {
          0 , 0 , 0 , 0 }
          ;
          for ( int i = 0 ;
          i < values . length ;
          i ++ ) {
            factorCount [ i ] = getPrimeFactorsSmall1 ( values [ i ] ) ;
            if ( ( factorCount [ 0 ] == 2 ) && ( factorCount [ 1 ] == 1 ) && ( factorCount [ 2 ] == 1 ) ) {
              return new String [ ] {
                4 , 3 , 5 }
                ;
              }
              for ( int i = 0 ;
              i < minPrimes . length ;
              i ++ ) {
                minPrimes [ i ] = Math . max ( minPrimes [ i ] , factorCount [ i ] ) ;
                totalPrimes [ i ] += factorCount [ i ] ;
              }
            }
            int [ ] guesses = new int [ 3 ] ;
            for ( int i = 0 ;
            i < minPrimes [ 1 ] ;
            i ++ ) {
              guesses [ i ] = 3 ;
              totalPrimes [ 1 ] -- ;
            }
            for ( int i = 0 ;
            i < minPrimes [ 2 ] ;
            i ++ ) {
              guesses [ i ] = 5 ;
              totalPrimes [ 2 ] -- ;
            }
            if ( guesses . length == 3 ) {
              return guesses [ 0 ] ;
            }
            if ( minPrimes [ 0 ] > 0 ) {
              int numLeft = 3 - guesses . length ;
              while ( minPrimes [ 0 ] > numLeft ) {
                guesses [ 0 ] = 4 ;
                if ( guesses [ 1 ] == 3 ) {
                  return guesses [ 1 ] ;
                }
                minPrimes [ 0 ] -= 2 ;
                numLeft = 3 - guesses . length ;
              }
            }
            while ( guesses . length < 3 ) {
              guesses [ 2 ] = 2 ;
            }
            return guesses [ 0 ] ;
          }
          