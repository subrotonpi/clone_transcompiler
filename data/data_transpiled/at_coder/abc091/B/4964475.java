static final int [ ] getStrings ( ) {
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  {
    final int [ ] LI = new int [ ] {
      Integer . parseInt ( System . in ) }
      ;
      {
        final int [ ] LI_ = new int [ ] {
          Integer . parseInt ( System . in ) - 1 }
          ;
          {
            final int [ ] LS = new int [ ] {
              Integer . parseInt ( System . in ) }
              ;
              {
                final int [ ] I = new int [ ] {
                  Integer . parseInt ( System . in ) }
                  ;
                  {
                    final int [ ] SI = new int [ ] {
                      Integer . parseInt ( System . in ) }
                      ;
                      {
                        final int n = II . length ;
                        final Map < Integer , Integer > blue = new TreeMap < > ( ) ;
                        for ( int i = 0 ;
                        i < n ;
                        i ++ ) {
                          blue . put ( SI , i ) ;
                        }
                      }
                      {
                        final int m = II . length ;
                        final Map < Integer , Integer > red = new TreeMap < > ( ) ;
                        for ( int i = 0 ;
                        i < m ;
                        i ++ ) {
                          red . put ( SI , i ) ;
                        }
                        int res = 0 ;
                        for ( Map . Entry < Integer , Integer > entry : blue . entrySet ( ) ) {
                          res = Math . max ( res , entry . getValue ( ) - red . get ( entry . getKey ( ) ) ) ;
                        }
                        return res ;
                      }
                    }
                  }
                }
              }
            }
          }
          