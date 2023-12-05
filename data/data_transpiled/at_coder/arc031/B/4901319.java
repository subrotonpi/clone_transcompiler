public static char [ ] [ ] isl = new char [ 12 ] [ 12 ] ;
for ( int i = 0 ;
i < 12 ;
i ++ ) {
  for ( int j = 0 ;
  j < 12 ;
  j ++ ) {
    int [ ] [ ] around = {
      {
        - 1 , 0 }
        , {
          0 , - 1 }
          , {
            0 , 1 }
            , {
              1 , 0 }
            }
            ;
          }
          char ans = 0 ;
          /* search for the first 12 */
          char [ ] [ ] l = {
            {
              - 1 , 0 }
              , {
                0 , - 1 }
                , {
                  0 , 1 }
                  , {
                    1 , 0 }
                  }
                  ;
                  for ( int i = 0 ;
                  i < 11 ;
                  i ++ ) {
                    char [ ] S = new char [ 12 ] ;
                    for ( int j = 1 ;
                    j < 11 ;
                    j ++ ) {
                      if ( S [ j - 1 ] == 'o' ) {
                        isl [ i ] [ j ] = 0 ;
                      }
                      else {
                        isl [ i ] [ j ] = - 1 ;
                      }
                    }
                  }
                  for ( int i = 1 ;
                  i < 12 ;
                  i ++ ) {
                    for ( int j = 0 ;
                    j < 12 ;
                    j ++ ) {
                      if ( isl [ i ] [ j ] == 0 ) {
                        /* search for the first 12 */
                        count ++ ;
                      }
                    }
                  }
                  for ( int i = 0 ;
                  i < 12 ;
                  i ++ ) {
                    for ( int j = 0 ;
                    j < 12 ;
                    j ++ ) {
                      if ( isl [ i ] [ j ] == - 1 ) {
                        if ( Arrays . binarySearch ( isl , i + l [ 0 ] , j + l [ 1 ] ) < around [ i ] ) {
                          ans = 'YES' ;
                          break ;
                        }
                      }
                    }
                    else {
                      ans = 'NO' ;
                      continue ;
                    }
                    break ;
                  }
                  System . out . println ( ans ) ;
                  return ans ;
                }
                