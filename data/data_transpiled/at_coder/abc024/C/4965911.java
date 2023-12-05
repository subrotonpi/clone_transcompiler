public static int [ ] ethNicLargeMovement ( @ Nonnull int N , @ Nonnull int D , @ Nonnull int K , @ Nonnull int [ ] LR , @ Nonnull int [ ] ST ) {
  int [ ] ret = new int [ K ] ;
  int defined = 0 ;
  for ( int d = 0 ;
  d < K ;
  d ++ ) {
    final int l = LR [ d ] ;
    final int r = LR [ d ] ;
    for ( int k = 0 ;
    k < ST . length ;
    k ++ ) {
      final int s = ST [ k ] ;
      final int t = ST [ k ] ;
      if ( ret [ k ] > 0 ) {
        continue ;
      }
      if ( r < s || s < l ) {
        continue ;
      }
      if ( s < t && r < t ) {
        ST [ k ] = new int [ ] {
          r , t }
          ;
          continue ;
        }
        else if ( t < s && t < l ) {
          ST [ k ] = new int [ ] {
            l , t }
            ;
            continue ;
          }
          ST [ k ] = new int [ ] {
            t }
            ;
            ret [ k ] = d + 1 ;
            defined ++ ;
          }
          if ( defined == K ) {
            break ;
          }
        }
        if ( getClass ( ) . isEnum ( ) ) {
          D = 0 ;
          K = 0 ;
          N = Integer . parseInt ( input ( ) ) ;
        }
        else {
          D = Integer . parseInt ( input ( ) ) ;
        }
        final int [ ] LR = new int [ D ] ;
        for ( int i = 0 ;
        i < D ;
        i ++ ) {
          LR [ i ] = Integer . parseInt ( input ( ) ) ;
        }
        final int [ ] ST = new int [ K ] ;
        for ( int i = 0 ;
        i < ST . length ;
        i ++ ) {
          ST [ i ] = Integer . parseInt ( input ( ) ) ;
        }
        final int [ ] ans = ethNicLargeMovement ( N , D , K , LR , ST ) ;
        for ( int a : ans ) {
          System . out . println ( a ) ;
        }
        return ret ;
      }
      