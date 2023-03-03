static final String main ( ) {
  final double inf = 10 * 20 ;
  final double gosa = 1.0 / 10 * 9 ;
  final int mod = 10 * 9 + 7 ;
  {
    final int [ ] li = new int [ ] {
      Integer . parseInt ( input ) }
      ;
      final int [ ] li_ = new int [ ] {
        Integer . parseInt ( input ) - 1 }
        ;
        final int [ ] lf = new int [ ] {
          Double . parseDouble ( input ) }
          ;
          final int [ ] LS = new int [ ] {
            Integer . parseInt ( input ) }
            ;
            final int [ ] I = new int [ ] {
              Integer . parseInt ( input ) }
              ;
              final int [ ] F = new int [ ] {
                Integer . parseInt ( input ) }
                ;
                final int [ ] S = new int [ ] {
                  input }
                  ;
                  {
                    final int [ ] divisions = new int [ ] {
                      Integer . parseInt ( input ) }
                      ;
                      {
                        final int sq = ( int ) Math . sqrt ( n ) + 1 }
                        ;
                        final Map < Integer , Integer > map = new LinkedHashMap < > ( ) ;
                        {
                          while ( n % 2 == 0 ) {
                            n /= 2 ;
                            map . put ( 2 , 1 ) ;
                          }
                          int i = 3 ;
                          while ( n > 1 && sq >= i ) {
                            if ( n % i == 0 ) {
                              n /= i ;
                              map . put ( i , 1 ) ;
                            }
                            else {
                              i += 2 ;
                            }
                          }
                          if ( n > 1 ) {
                            map . put ( n , 1 ) ;
                          }
                          final int [ ] r = new int [ 1 ] ;
                          for ( final Map . Entry < Integer , Integer > e : map . entrySet ( ) ) {
                            for ( int i = 1 ;
                            i <= e . getValue ( ) ;
                            i ++ ) {
                              r [ i ] = e . getValue ( ) * ( e . getKey ( ) * e . getValue ( ) ) ;
                            }
                          }
                          return r [ 0 ] ;
                        }
                      }
                      {
                        final int n = li [ 0 ] ;
                        final int k = li [ 1 ] ;
                        int r = 0 ;
                        final List < Integer > dl = divisions ( k ) . subList ( 0 , n ) ;
                        final Map < Integer , Integer > dr = new LinkedHashMap < > ( ) ;
                        for ( final int di = 0 ;
                        di < dl . size ( ) ;
                        di ++ ) {
                          final int d = dl . get ( di ) ;
                          final int t = n / d ;
                          final int wa = ( d * ( t + 1 ) ) *