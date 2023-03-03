static final int [ ] readWord ( Reader in ) throws IOException {
  final int N = in . read ( ) . length ;
  {
    return next ( in ) . trim ( ) ;
  }
  {
    final int N = in . read ( ) . length ;
  }
  {
    final int E = in . read ( ) . length ;
  }
  {
    final int [ ] [ ] ab = new int [ N ] [ ] ;
    for ( int i = 0 ;
    i < ab . length ;
    i ++ ) {
      ab [ i ] [ 0 ] = in . read ( ) ;
    }
    if ( ab [ i ] [ 0 ] <= E ) return FAIL ;
    Arrays . sort ( ab , 0 , ab . length ) ;
  }
  {
    final List < String > opt = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      opt . add ( in . read ( ) . substring ( i ) ) ;
    }
    for ( int i = 0 ;
    i < opt . size ( ) ;
    i ++ ) {
      opt . add ( in . read ( ) . substring ( i ) ) ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      res . add ( in . read ( ) . substring ( i ) ) ;
    }
  }
  {
    final List < String > res = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      res . add ( in . read ( ) . substring ( i ) ) ;
    }
    return res . toArray ( new String [ res . size ( ) ] ) ;
  }
  {
    final String in = in . read ( ) ;
    if ( in == null ) {
      in = in + ".in" ;
    }
    final String out = in . read ( ) ;
    try {
      final String in = in . replace ( ".in" , "" ) ;
      if ( out == null ) {
        out = in + ".out" ;
      }
      final Scanner fi = new Scanner ( in ) ;
      final PrintWriter fo = new PrintWriter ( out ) ;
      final int T = in . nextInt ( ) ;
      for ( int i = 0 ;
      i < T ;
      i ++ ) {
        final int [ ] testCase = readCase ( fi ) ;
        final int res = solver . solve ( testCase ) ;
        writeCase ( fo , i , res ) ;
      }
    }
    {
      final int N = in . read ( ) . length ;
      final int [ ] ab = new int [ N ] ;
      for ( int i = 0 ;
      