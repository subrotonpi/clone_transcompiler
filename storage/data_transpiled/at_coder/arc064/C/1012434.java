@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int [ ] [ ] readInts ( ) {
  /* read the input */
  int [ ] [ ] reads = new int [ input . length ] [ input . length ] ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) reads [ i ] = Integer . parseInt ( input [ i ] ) ;
  /* read the input */
  long [ ] q = reads . clone ( ) ;
  long s = q [ 0 ] + q [ 1 ] * FastMath . log ( s ) ;
  long t = q [ 2 ] + q [ 3 ] * FastMath . log ( t ) ;
  int N = read ( ) ;
  long [ ] p = new long [ N + 2 ] ;
  long [ ] r = new long [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    q = reads . clone ( ) ;
    p [ i ] = q [ 0 ] + q [ 1 ] * FastMath . log ( s ) ;
    r [ i ] = q [ 2 ] ;
  }
  int [ ] [ ] E = new int [ N + 2 ] [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      E [ i ] [ j ] = Math . max ( Math . abs ( p [ i ] - p [ j ] ) - r [ i ] - r [ j ] , 0 ) ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E [ N ] [ i ] = E [ i ] [ N ] = Math . max ( Math . abs ( p [ i ] - s ) - r [ i ] , 0 ) ;
    E [ N + 1 ] [ i ] = E [ i ] [ N + 1 ] = Math . max ( Math . abs ( p [ i ] - t ) - r [ i ] , 0 ) ;
  }
  E [ N + 1 ] [ N + 1 ] = E [ N + 1 ] [ N ] = Math . abs ( t - s ) ;
  final double INF = 10 * 15 * 1.0 ;
  final double [ ] dist = new double [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dist [ N + 2 ] = E [ N + 2 ]