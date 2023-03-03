static final double inf = 2 * 10 * 20 ;
int P = - Integer . MAX_VALUE ;
int [ ] [ ] result = new int [ ] [ ] {
  {
    inf }
    , {
      P }
      , {
        P }
        , {
          P }
          , {
            P }
          }
          ;
          int [ ] [ ] result = xrange ( result . length ) ;
          boolean debug = false ;
          for ( int testCase = 0 ;
          testCase < input . length ;
          testCase ++ ) {
            System . out . println ( "Case #" + ( testCase + 1 ) + ":" + testCase ) ;
            P = input . nextInt ( ) ;
            result [ need ] = ArrayUtil . toIntArray ( inv ( input . nextInt ( ) ) ) ;
            int [ ] [ ] costs = new int [ P ] [ ] ;
            for ( int i : xrange ( P ) ) costs = ArrayUtil . toIntArray ( Integer . parseInt ( input . nextInt ( ) ) ) ;
            result [ 0 ] [ 0 ] = costs [ i ] ;
            for ( int i : xrange ( P + 1 ) ) {
              result [ i ] [ 1 ] = inf ;
            }
            if ( debug ) System . out . println ( result . length ) ;
            result [ 0 ] [ 0 ] = 2 * ( P + 1 ) - 1 ;
            result [ 1 ] [ 0 ] = 2 * P ;
            int leaves = 2 * P - 1 ;
            Iterator < Integer > iter = need . iterator ( ) ;
            for ( int i = 0 ;
            i < limit ( ) ;
            i ++ ) {
              for ( int j : xrange ( iter . next ( ) , P + 1 ) ;
              j ++ ) v [ leaves + i ] [ j ] = 0 ;
            }
            for ( int n : xrange ( leaves - 1 , - 1 , - 1 ) ) {
              if ( debug ) System . out . println ( n ) ;
              result [ 0 ] [ 0 ] = 2 * n + 1 ;
              result [ 1 ] [ 0 ] = 2 * n + 2 ;
              for ( int i : xrange ( P + 1 ) ) {
                int buy ;
                if ( i == P ) buy = inf ;
                else buy = result [ 2 * n + 1 ] [ i + 1 ] + result [ 2 * n + 2 ] [ i + 1 ] + costs [ n ] ;
                int skip = result [ 2 * n + 1 ] [ i ] + result [ 2 * n + 2 ] [ i ] ;
                v [ n ] [ i ] = Math . min ( buy , skip ) ;
              }
            }
          }
          