static final double [ ] [ ] getDistance ( int x0 , int y0 , int z0 , int [ ] ships ) {
  psyco . profile ( ) ;
  DEBUG = false ;
  {
    final String [ ] parts = new String [ 1 ] ;
    final int [ ] got = new int [ parts . length ] ;
    for ( int i : xrange ( parts . length ) ) {
      got [ i ] = types [ i ] . valueOf ( parts [ i ] ) ;
    }
    return got ;
  }
  {
    final String [ ] parts = new String [ 1 ] ;
    for ( int i : xrange ( parts . length ) ) {
      got [ i ] = ints [ i ] . valueOf ( parts [ i ] ) ;
    }
    return Arrays . copyOf ( got , got . length ) ;
  }
  {
    final int [ ] ints = getInts ( parts ) ;
    assert ints . length == 1 ;
    return ints [ 0 ] ;
  }
  private static void runFile ( String file , PrintStream out ) {
    if ( out == null && file != null && file . endsWith ( ".in" ) ) {
      out = file . substring ( 0 , file . length ( ) - 3 ) + ".out" ;
    }
    if ( out == null ) {
      out = System . out ;
    }
    else {
      out = new PrintStream ( out ) ;
    }
    if ( file == null ) {
      return ;
    }
    final int ncases = getInt ( file ) ;
    for ( int i = 0 ;
    i < ncases ;
    i ++ ) {
      final int nships = getInt ( file ) ;
      final int [ ] [ ] ships = new int [ nships ] [ nships ] ;
      for ( int j = 0 ;
      j < ships . length ;
      j ++ ) {
        ships [ j ] = getInts ( ships [ j ] ) ;
      }
      final int answer = runCase ( ships ) ;
      System . out . println ( out . println ( out . println ( ) >>> 1 ) + "Case #" + ( j + 1 ) + ": " + answer ) ;
    }
  }
  private static double distance ( int x0 , int y0 , int z0 , int [ ] [ ] bestdist ) {
    double maxdist = 0 ;
    for ( int i = 0 ;
    i < bestdist ;
    i ++ ) {
      final int x = ( x + step ) ;
      final int y = ( y + step ) ;
      final int z = ( z + step ) ;
      final int p = ( x + step ) ;
      final double dist = distance ( y , x