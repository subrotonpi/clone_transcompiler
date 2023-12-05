@ VisibleForTesting static void println ( ) throws IOException {
  final BufferedReader reader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String strLine ;
  final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
  {
    reader . readLine ( ) ;
  }
  {
    final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
    {
      reader . readLine ( ) ;
    }
  }
  {
    final String rsBufferedReader = reader . readLine ( ) . replaceAll ( "\\s+" , "" ) ;
  }
  {
    final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
    {
      for ( int i = 0 ;
      i < in . length ;
      i ++ ) {
        in [ i ] = in [ i ] ;
      }
    }
    {
      final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
      {
        for ( int i = 0 ;
        i < in . length ;
        i ++ ) {
          in [ i ] = in [ i ] ;
        }
      }
      {
        final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
        {
          for ( int i = 0 ;
          i < in [ i ] . length ;
          i ++ ) {
            in [ i ] [ i ] = in [ i ] [ i ] ;
          }
        }
      }
      {
        final int [ ] in = new int [ 3 ] ;
        {
          int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
          {
            in [ i ] [ i ] = in [ i ] [ i ] ;
          }
        }
      }
    }
    ;
  }
  final Scanner scanner = new Scanner ( in ) ;
  int cCase = scanner . nextInt ( ) ;
  for ( int iCase = 0 ;
  cCase <= cCase ;
  iCase ++ ) {
    final int cPlants = scanner . nextInt ( ) ;
    final int [ ] [ ] in = new int [ 3 ] [ 3 ] ;
    for ( int i = 0 ;
    i <= cPlants ;
    i ++ ) {
      in [ i ] = in [ i ] [ i ] ;
    }
    double ret = - 1.0 ;
    if ( cPlants == 1 ) {
      ret = in [ 0 ] [ 2 ] ;
    }
    if ( cPlants == 2 ) {
      ret = Math . max ( in [ 0 ] [ 2 ] , in [ 1 ] [ 2 ] ) ;
    }
    if ( cPlants == 3 ) {
      ret = Math . min ( in [ 0 ] [ 2 ] , in [ 1 ] [ 2 ] ) ;
    }
    System . out . println (