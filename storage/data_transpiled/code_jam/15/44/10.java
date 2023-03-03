private static int cnt = 0 ;
int dirs [ ] [ ] = new int [ ] [ ] {
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
        int [ ] [ ] fff = new int [ dirs . length ] [ ] ;
        {
          correct ( d ) ;
          int n = d . length ;
          int m = d [ 0 ] . length ;
          for ( int x = 0 ;
          x < n ;
          ++ x ) {
            int row = d [ x ] . length ;
            for ( int y = 0 ;
            y < m ;
            ++ y ) {
              int cell = d [ x ] [ y ] ;
              if ( d [ x ] [ y ] == 0 ) continue ;
              IntStream sas = Arrays . stream ( d [ x + dx ] [ ( y + dy ) % m ] ) ;
              int a = d [ x ] [ y ] ;
              if ( sas . count ( a ) > a || sas . count ( a ) + sas . count ( 0 ) < a ) return false ;
            }
          }
          {
            if ( x == d . length ) {
              if ( correct ( d ) ) {
                cnt ++ ;
                fff [ 0 ] = Arrays . copyOf ( d , d . length ) ;
              }
              return 0 ;
            }
            for ( int a = 1 ;
            a <= 2 ;
            ++ a ) {
              d [ x ] [ y ] = a ;
              if ( ! correct ( d ) ) continue ;
              if ( y < d [ 0 ] . length - 1 ) {
                dfs ( d , x , y + 1 ) ;
              }
              else {
                dfs ( d , x + 1 , 0 ) ;
              }
            }
            d [ x ] [ y ] = 0 ;
          }
          {
            for ( int i : xrange ( a [ 0 ] . length ) ) {
              int [ ] c = Arrays . copyOf ( d , i ) ;
              if ( Arrays . equals ( c , b [ 0 ] ) ) return true ;
            }
            return false ;
          }
        }
        for ( int r : xrange ( 2 , 7 ) ) {
          for ( int c : xrange ( 3 , 7 ) ) {
            int [ ] d = new int [ c ] ;
            cnt = 0 ;
            fff = new int [ r ] [ ] ;
            dfs ( d , 0 , 0 ) ;
            int [ ] rrr = new int [ r ] ;
            for ( int a : fff ) {
              if ( Arrays . equals ( a , b ) ) return true ;
            }
          }
        }
        return cnt ;
      }
      