static final int solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) {
    private static final long serialVersionUID = 1L ;
    private static final long INF = 10 * * 18 ;
    private static final long MOD = 10 * * 9 + 7 ;
    @ Override public int [ ] prod ( ) {
      return new int [ ] {
        INF , MOD }
        ;
      }
      @ Override public int [ ] getPrimes ( ) {
        return new int [ ] {
          INF , MOD }
          ;
        }
        @ Override public int [ ] getPrimes ( ) {
          return new int [ ] {
            INF , MOD }
            ;
          }
          @ Override public int [ ] getPrimes ( ) {
            return new int [ ] {
              INF , MOD }
              ;
            }
            @ Override public int [ ] getPrimes ( ) {
              return new int [ ] {
                INF , MOD }
                ;
              }
              @ Override public int [ ] getPrimes ( ) {
                return new int [ ] {
                  INF , MOD }
                  ;
                }
                @ Override public int [ ] getPrimes ( ) {
                  return new int [ ] {
                    INF , MOD }
                    ;
                  }
                  @ Override public int [ ] getPrimes ( ) {
                    return new int [ ] {
                      INF , MOD }
                      ;
                    }
                    @ Override public int [ ] getPrimes ( ) {
                      return new int [ ] {
                        INF , MOD }
                        ;
                      }
                      @ Override public int [ ] getPrimes ( ) {
                        return new int [ ] {
                          INF , MOD }
                          ;
                        }
                        @ Override public int [ ] getPrimes ( ) {
                          return new int [ ] {
                            INF , MOD }
                            ;
                          }
                          @ Override public int [ ] getPrimes ( ) {
                            return new int [ ] {
                              INF , MOD }
                              ;
                            }
                          }
                          ) ;
                          int [ ] primes = new int [ 1001 ] ;
                          primes [ 1 ] = 0 ;
                          for ( int i = 2 ;
                          i <= Integer . MAX_VALUE ;
                          i ++ ) {
                            primes [ i ] = i ;
                          }
                          primes [ 1 ] = 0 ;
                          primes [ 0 ] = 1 ;
                          for ( int i = 1 ;
                          i <= N ;
                          i ++ ) {
                            primes [ i ] = primes [ i ] ;
                          }
                          return primes ;
                        }
                        