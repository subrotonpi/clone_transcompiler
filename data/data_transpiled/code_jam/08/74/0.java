static final boolean print = false ;
int [ ] [ ] deltas = {
  new int [ ] {
    - 1 , - 1 }
    , new int [ ] {
      - 1 , 0 }
      , new int [ ] {
        - 1 , 1 }
        , new int [ ] {
          0 , - 1 }
          , new int [ ] {
            0 , 1 }
            , new int [ ] {
              1 , - 1 }
              , new int [ ] {
                1 , 0 }
                , new int [ ] {
                  1 }
                }
                ;
                /* We want to run the tests in the test */
                if ( __name__ == "__main__" ) {
                  final String [ ] parts = new String [ ] {
                    System . getProperty ( "line.separator" ) }
                    ;
                    final int [ ] got = new int [ parts . length ] ;
                    for ( int i : xrange ( parts ) ) {
                      got [ i ] = types [ i ] . parse ( parts [ i ] ) ;
                    }
                    return got ;
                  }
                  /* We want to run the tests in the test */
                  final int [ ] ints = new int [ ints . length ] ;
                  for ( int i = 0 ;
                  i < ints . length ;
                  ++ i ) {
                    ints [ i ] = ints [ i ] ;
                    assert ints . length == 1 ;
                  }
                  /* We want to run the test */
                  if ( out == null && lines [ 0 ] instanceof String && lines [ 0 ] . endsWith ( ".in" ) ) {
                    out = lines [ 0 ] . substring ( 0 , lines [ 0 ] . length ( ) - 3 ) + ".out" ;
                  }
                  if ( out == null ) {
                    System . out . println ( "No output file specified" ) ;
                  }
                  final int ncases = ints [ 0 ] ;
                  for ( int i = 0 ;
                  i < ncases ;
                  ++ i ) {
                    final int case = ints [ i ] ;
                    final int rows = ints [ i ] ;
                    final int cols = ints [ i ] ;
                    final List < String > board = new ArrayList < String > ( ) ;
                    board . add ( Collections . nCopies ( rows , cols ) ) ;
                    final int [ ] king = null ;
                    for ( int r = 0 ;
                    r < rows ;
                    ++ r ) {
                      board . add ( Collections . nCopies ( rows , r ) ) ;
                    }
                    board . addAll ( Arrays . asList ( board ) ) ;
                    for ( int r =