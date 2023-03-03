@ MoreRequires public static int [ ] readInts ( ) {
  return new int [ ] {
    Integer . parseInt ( input . readLine ( ) ) }
    ;
    /* reads the input string */
    int [ ] reads = new int [ ] {
      Integer . parseInt ( input . readLine ( ) ) }
      ;
      /* powmod u and x */
      int y = u ;
      while ( n > 0 ) {
        if ( ( n & 1 ) == 1 ) {
          y = mul ( y , x ) ;
        }
        x = mul ( x , x ) ;
        n >>= 1 ;
      }
      /* xsum of xs */
      int ONE = ( 1 << 32 ) - 1 ;
      /* mul of xs */
      int [ ] zs = new int [ W ] ;
      for ( int i = 0 ;
      i < W ;
      ++ i ) {
        for ( int j = 0 ;
        j < i + 1 ;
        ++ j ) {
          zs [ i ] ^= xs [ j ] & ys [ i - j ] ;
        }
      }
      for ( int i = W - 1 ;
      i >= K ;
      -- i ) {
        for ( int j = 0 ;
        j < K + 1 ;
        ++ j ) {
          zs [ i - K + j ] ^= zs [ i ] & h [ j ] ;
        }
      }
      return zs ;
    }
    