@ MoreRequires ( "x" ) @ VisibleForTesting static int [ ] [ ] reads ( ) {
  return new int [ ] [ ] {
    Integer . parseInt ( input ( ) ) }
    ;
    /* First pass the inputs to the polynomial */
    int [ ] [ ] reads = new int [ ] [ ] {
      Integer . parseInt ( input ( ) ) }
      ;
      /* Second pass the inputs to the polynomial */
      int [ ] [ ] powmod = {
        0 , 0 , 0 }
        ;
        /* Third pass the inputs to the polynomial */
        int [ ] [ ] xsum = {
          0 , 0 , 0 }
          ;
          final int ONE = ( 1 << 32 ) - 1 ;
          class Poly {
            int [ ] [ ] coef ;
            {
              int [ ] [ ] dim = {
                0 , 0 , 0 }
                ;
                int [ ] [ ] body = {
                  0 , 0 , 0 }
                  ;
                  /* One pass the inputs to the polynomial */
                  {
                    int [ ] xs = {
                      0 , n }
                      ;
                      int [ ] [ ] ys = {
                        0 , m }
                        ;
                        int l = n + m ;
                        int [ ] zs = new int [ l + 1 ] ;
                        for ( int i = 0 ;
                        i < n ;
                        ++ i ) {
                          for ( int j = 0 ;
                          j < m + 1 ;
                          ++ j ) {
                            zs [ i + j ] ^= xs [ i ] [ j ] & ys [ j ] ;
                          }
                        }
                        return poly ( zs ) ;
                      }
                    }
                    /* Second pass the inputs to the polynomial */
                    {
                      int [ ] xs = {
                        0 , n }
                        ;
                        int [ ] ys = {
                          0 , m }
                          ;
                          assert m >= 0 && ys [ m ] == ONE ;
                          int [ ] zs = new int [ n + 1 ] ;
                          for ( int i = n ;
                          i >= m ;
                          -- i ) {
                            for ( int j = 0 ;
                            j < m + 1 ;
                            ++ j ) {
                              zs [ i - m + j ] ^= zs [ i ] [ j ] & ys [ j ] ;
                            }
                          }
                          int l = ( ( n - 1 ) & zs [ 0 ] ) ;
                          return poly ( zs , 0 , l + 1 ) ;
                        }
                      }
                      final int K = reads [ 0 ] ;
                      final int M = reads [ 1 ] [ ] ;
                      final int [ ] A = reads [ 2 ] ;
                      final int [ ] C =