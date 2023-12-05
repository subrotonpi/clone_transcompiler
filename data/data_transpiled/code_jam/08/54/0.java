static final boolean [ ] [ ] getTypes ( ) {
  boolean DEBUG = false ;
  int gh , gw ;
  int [ ] [ ] parts ;
  int got = new int [ 256 ] [ 256 ] ;
  for ( int i = 0 ;
  i < got . length ;
  i ++ ) {
    for ( int j = gw ;
    j < got [ i ] . length ;
    j ++ ) {
      if ( grid [ r ] [ j ] == - 1 ) continue ;
      if ( ( gh = i + 1 ) == 0 ) continue ;
      grid [ r ] [ j ] = ( max ( grid [ r ] [ j ] , 0 ) + max ( grid [ r ] [ j ] , 0 ) ) % 10007 ;
    }
  }
  if ( __name__ == "__main__" ) {
    final String [ ] parts = new String [ ] {
      "__main__" }
      ;
      System . arraycopy ( parts , 0 , parts , 0 , parts . length ) ;
      return parts ;
    }
    int [ ] ints ;
    {
      ints = getInts ( ) ;
      assert ints . length == 1 ;
      return ints [ 0 ] ;
    }
    int [ ] rock2move = new int [ 2 ] ;
    int xp = 0 , yp = 0 ;
    int [ ] [ ] ints = new int [ 2 ] [ 2 ] ;
    int off = 0 , moves = 0 ;
    for ( int i = 0 ;
    i < ints . length ;
    i ++ ) {
      xp = i - 1 ;
      yp = i - 1 ;
      if ( ( xp + yp ) % 3 != 0 ) return new int [ ] {
        null , null }
        ;
        else {
          off = yp - xp ;
          moves = ( xp + yp ) / 3 ;
          return new int [ ] {
            ( ( off + moves ) / 2 ) , ( ( moves - off ) / 2 ) }
            ;
          }
        }
        if ( out == null && args . length > 0 && args [ 0 ] . endsWith ( ".in" ) ) out = args [ 0 ] . substring ( 0 , args [ 0 ] . length ( ) - 3 ) + ".out" ;
        if ( out == null ) out = new PrintStream ( System . out ) ;
        else out = new PrintStream ( out ) ;
        if ( args . length > 0 ) out . println ( gh , gw ) ;
        for ( int i = 0 ;
        i < rocks . length ;
        i ++ ) {
          int r = rocks [ i ] [ 0 ] ;
          int c = rocks [ i ] [ 1