static final String print ( ) {
  final int inf = 10 * 20 ;
  final int mod = 10 * 9 + 7 ;
  {
    final int [ ] LI = new int [ ] {
      Integer . parseInt ( System . console ( ) . readLine ( ) ) }
      ;
      {
        final int [ ] LI_ = new int [ ] {
          Integer . parseInt ( System . console ( ) . readLine ( ) ) }
          ;
          {
            final int [ ] LF = new float [ ] {
              Float . parseFloat ( System . console ( ) . readLine ( ) ) }
              ;
            }
          }
          {
            final int [ ] LS = new int [ ] {
              Integer . parseInt ( System . console ( ) . readLine ( ) ) }
              ;
              {
                final int [ ] I = new int [ ] {
                  Integer . parseInt ( System . console ( ) . readLine ( ) ) }
                  ;
                  {
                    final int [ ] F = new float [ ] {
                      Float . parseFloat ( System . console ( ) . readLine ( ) ) }
                      ;
                    }
                  }
                  {
                    final int [ ] S = new int [ ] {
                      Integer . parseInt ( System . console ( ) . readLine ( ) ) }
                      ;
                      {
                        final int [ ] S = new int [ ] {
                          Integer . parseInt ( System . console ( ) . readLine ( ) ) }
                          ;
                        }
                      }
                    }
                    {
                      final int tt = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
                      final StringBuilder rr = new StringBuilder ( ) ;
                      for ( int ti = 1 ;
                      ti <= tt ;
                      ti ++ ) {
                        final int n = LI [ ti ] ;
                        final int k = LI_ [ ti ] ;
                        final float c = F [ ti ] ;
                        final int [ ] a = new int [ LF . length ] ;
                        for ( int i = k - 1 ;
                        i >= 0 ;
                        i -- ) {
                          final float b ;
                          if ( i == 0 ) {
                            b = 1 - a [ i ] ;
                          }
                          else {
                            b = a [ i - 1 ] - a [ i ] ;
                          }
                          final float d = k - i ;
                          if ( c >= b * d ) {
                            for ( int j = 0 ;
                            j < d ;
                            j ++ ) {
                              a [ i + j ] += b ;
                            }
                            c -= b * d ;
                          }
                          else {
                            for ( int j = 0 ;
                            j < d ;
                            j ++ ) {
                              a [ i + j ] += c / d ;
                            }
                            break ;
                          }
                        }
                        final float [ ] ra = new float [ n + 1 ] ;
                        ra [ 0 ] = 1 ;
                        for ( int i = 0 ;
                        i <