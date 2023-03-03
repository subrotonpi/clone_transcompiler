static int [ ] [ ] solve ( ) {
  final int [ ] [ ] powerTable = {
    MOD , w , size }
    ;
    int [ ] [ ] wTable = {
      0 }
      ;
      wTable [ 0 ] = 1 ;
      for ( int i = 1 ;
      i < size ;
      i ++ ) {
        wTable [ i ] = wTable [ i - 1 ] * w % MOD ;
      }
      int [ ] answer = {
        0 }
        ;
        int [ ] [ ] ifac = {
          0 }
          ;
          for ( int i = 1 ;
          i < ntt_size / 2 ;
          i ++ ) {
            ifac [ i ] = ifac [ i ] * ifac [ i ] ;
          }
          int [ ] [ ] ifac = {
            0 }
            ;
            for ( int i = 1 ;
            i < n ;
            i ++ ) {
              ifac [ i ] = ifac [ i ] * ifac [ i ] ;
            }
            int [ ] [ ] ifac = {
              0 }
              ;
              for ( int i = 1 ;
              i < n ;
              i ++ ) {
                ifac [ i ] = ifac [ i ] * ifac [ i ] ;
              }
              int [ ] [ ] ifac = {
                0 }
                ;
                for ( int i = 1 ;
                i < n ;
                i ++ ) {
                  ifac [ i ] = ifac [ i ] * ifac [ i ] ;
                }
                int [ ] [ ] ifac = {
                  0 }
                  ;
                  for ( int i = 1 ;
                  i < ifac . length ;
                  i ++ ) {
                    ifac [ i ] = ifac [ i ] * ifac [ i ] ;
                  }
                  int [ ] [ ] ifac = {
                    0 }
                    ;
                    for ( int i = 1 ;
                    i < ifac . length ;
                    i ++ ) {
                      ifac [ i ] = ifac [ i ] * ifac [ i ] - 1 , ifac [ i ] * ifac [ i ] }
                      ;
                      int [ ] [ ] ifac = {
                        0 }
                        ;
                        for ( int i = 1 ;
                        i < ifac . length ;
                        i ++ ) {
                          ifac [ i ] = ifac [ i ] * ifac [ i ] ;
                        }
                        solve ( ) ;
                        int [ ] [ ] ifac = {
                          0 }
                          ;
                          int n = ifac [ 0 ] ;
                          int [ ] [ ] graph = new int [ n ] [ n ] ;
                          for ( int i = 0 ;
                          i < ifac . length ;
                          i ++ ) {
                            graph [ i ] [ 0 ] = ifac [ i