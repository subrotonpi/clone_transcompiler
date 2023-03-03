@ org . python . Method ( __doc__ = "" ) public static org . python . Object [ ] [ ] solve ( ) {
  org . python . Object [ ] [ ] result ;
  boolean verbose = true ;
  org . python . Object [ ] [ ] right = new org . python . Object [ ] [ ] {
    {
      right }
    }
    ;
    org . python . Object [ ] [ ] testResults ;
    {
      int R = inputfile . read_integers ( ) ;
      int C = inputfile . read_integers ( ) ;
      int [ ] [ ] couples = inputfile . read_integers ( ) ;
      assert 2 * ( R + C ) == couples . length ;
      return result ;
    }
    {
      org . python . Object [ ] [ ] res = solve ( result ) ;
      if ( verbose ) {
        System . err . println ( "Case #" + ( i + 1 ) + ":" ) ;
        System . err . println ( result ) ;
      }
      else {
        System . err . println ( " " + Arrays . toString ( res ) ) ;
      }
    }
    {
      int R = rows ;
      int C = columns ;
      z3 . Solver s = new z3 . Solver ( ) ;
      HashMap < Integer , Integer > coupleId = new HashMap < > ( ) ;
      for ( int i = 0 ;
      i < xrange ( R + C ) ;
      i ++ ) {
        int ia = i * 2 ;
        int ib = i * 2 + 1 ;
        coupleId . put ( couples [ ia ] - 1 , i ) ;
        coupleId . put ( couples [ ib ] - 1 , i ) ;
      }
      {
        Grid < Integer , Integer > grid = new GridImpl < > ( ( r , c ) -> Bool . valueOf ( "/[{}, {}]" , r , c ) , ( ) -> new RightLeft ( Int . valueOf ( "left[{}, {}]" , r , c ) , Int . valueOf ( "right[{}, {}]" , r , c ) ) ) ;
        for ( int r = 0 ;
        r < xrange ( R ) ;
        r ++ ) {
          grid . put ( r , c ) ;
        }
      }
      {
        Grid < Integer , Integer > grid = new GridImpl < > ( ( r , c ) -> Bool . valueOf ( "/[{}, {}]" , r , c ) , ( ) -> {
          System . err . println ( " " + r ) ;
        }
        )