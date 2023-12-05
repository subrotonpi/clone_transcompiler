public static int [ ] ethnic_large_movement ( @ Nonnegative int N , @ Nonnegative int D , @ Nonnegative int K , @ Nonnegative int [ ] LR , @ Nonnegative int [ ] ST ) {
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
      if ( s < t ) {
        if ( r < s || s < l ) {
          continue ;
        }
        if ( r < t ) {
          ST [ k ] = new int [ ] {
            r , t }
            ;
          }
          else {
            ST [ k ] = new int [ ] {
              t }
              ;
              ret [ k ] = d + 1 ;
              defined ++ ;
            }
          }
          else {
            if ( r < s || s < l ) {
              continue ;
            }
            if ( t < l ) {
              ST [ k ] = new int [ ] {
                l , t }
                ;
              }
              else {
                ST [ k ] = new int [ ] {
                  t }
                  ;
                  ret [ k ] = d + 1 ;
                  defined ++ ;
                }
              }
            }
            if ( defined == K ) {
              break ;
            }
          }
          if ( Class . isEnum ( ) ) {
            D = 0 ;
            K = 0 ;
            N = Integer . parseInt ( input . readLine ( ) ) ;
          }
          else {
            D = Integer . parseInt ( input . readLine ( ) ) ;
          }
          Arrays . sort ( LR ) ;
          Arrays . sort ( ST ) ;
          int [ ] ans = ethnic_large_movement ( N , D , K , LR , ST ) ;
          for ( int a : ans ) {
            System . out . println ( a ) ;
          }
          return ans ;
        }
        