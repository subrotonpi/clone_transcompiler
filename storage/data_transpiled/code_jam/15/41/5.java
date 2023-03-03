static final String [ ] getWords ( ) {
  final String [ ] words = new String [ ] {
    "" }
    ;
    final int [ ] [ ] getInts = new int [ ] [ ] {
      {
        Integer . MIN_VALUE }
        , {
          Integer . MAX_VALUE }
          , {
            Integer . MAX_VALUE }
            , {
              Integer . MIN_VALUE }
              , {
                Integer . MIN_VALUE }
                , {
                  Integer . MAX_VALUE }
                  , {
                    Integer . MIN_VALUE }
                    , {
                      Integer . MIN_VALUE }
                      , {
                        Integer . MIN_VALUE }
                        , {
                          Integer . MAX_VALUE }
                        }
                        ;
                        final int T = getInt ( ) ;
                        for ( int caseNo : xrange ( 1 , T + 1 ) ) {
                          final int R = getInts [ 0 ] ;
                          final int C = getInts [ 1 ] ;
                          final char [ ] symbol = new char [ R ] ;
                          for ( char ch : getWords ) {
                            symbol [ ch ] = Character . toLowerCase ( ch ) ;
                          }
                          final boolean isTurn = ( symbol != '.' ) ;
                          assert isTurn . length == R ;
                          final Map < String , Boolean > possibleTurn = new HashMap < String , Boolean > ( ) ;
                          for ( int d : "<>^v" . toCharArray ( ) ) {
                            possibleTurn . put ( d , Boolean . valueOf ( isTurn ) ) ;
                          }
                          for ( int r = 0 ;
                          r < R ;
                          r ++ ) {
                            if ( ! isTurn [ r ] . isEmpty ( ) ) continue ;
                            final int c0 = Character . digit ( isTurn [ r ] , 16 ) ;
                            final int c1 = Character . digit ( isTurn [ r ] , 16 ) ;
                            possibleTurn . put ( '<' , r , c0 , false ) ;
                            possibleTurn . put ( '>' , r , c1 , false ) ;
                          }
                          for ( int c = 0 ;
                          c < C ;
                          c ++ ) {
                            if ( ! isTurn [ 0 ] [ c ] . isEmpty ( ) ) continue ;
                            final int r0 = Character . digit ( isTurn [ r ] , 16 ) ;
                            final int r1 = Character . digit ( isTurn [ r ] , 16 ) ;
                            possibleTurn . put ( '^' , r0 , c , false ) ;
                            possibleTurn . put ( 'v' , r1 , c , false ) ;
                          }
                          final boolean isPossible = Arrays . binarySearch ( possibleTurn , symbol ) >= 0 ;
                          if ( isPossible ) {
                            int nChange = 0 ;
                            final Iterator < String > it = symbol . iterator ( ) ;
                            while ( it . hasNext ( ) ) {
                              nChange += ~ possibleTurn . get