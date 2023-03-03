static private < T > T getSecond ( Generator < T > gen , Class < T > type ) {
  try {
    String l = gen . next ( ) . trim ( ) ;
    return type . cast ( l . trim ( ) ) ;
  }
  catch ( IOException e ) {
    return null ;
  }
  /* get the number of signs in the specified file */
  int n = gen . nextInt ( ) ;
  T [ ] signs = new T [ n ] ;
  int m = A . length ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    signs [ i ] = A [ i % m ] ;
    A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  /* get the number of signs in the specified file */
  if ( className . equals ( "java.util.jar" ) ) {
    FileReader in = new FileReader ( args . get ( 0 ) ) ;
    BufferedReader reader = new BufferedReader ( in ) ;
    FileWriter out = new FileWriter ( args . get ( 0 ) + "-output" ) ;
    int nCases = getNum ( reader , int n ) ;
    for ( int testCase = 0 ;
    testCase < nCases ;
    testCase ++ ) {
      int [ ] line = new int [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) line [ i ] = Integer . parseInt ( getNum ( reader , String . class ) ) ;
      int numSigns = line [ 0 ] ;
      int arraySize = line [ 1 ] ;
      int X = line [ 2 ] ;
      int Y = line [ 3 ] ;
      int Z = line [ 4 ] ;
      int [ ] A = new int [ arraySize ] ;
      for ( int l = 0 ;
      l < arraySize ;
      l ++ ) A [ l ] = getNum ( reader , int . class ) ;
      List < Double > speeds = getSpeeds ( numSigns , A , X , Y , Z ) ;
      Collections . reverse ( speeds ) ;
      double [ ] sinc = new double [ speeds . size ( ) ] ;
      sinc [ 0 ] = 1 ;
      for ( int s = 1 ;
      s < speeds . size ( ) ;
      s ++ ) sinc [ s ] = 1 + Math . pow ( sinc [ s ] , s ) ;
      out . write ( "Case #" + ( testCase + 1