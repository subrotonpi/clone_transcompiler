static final double [ ] [ ] read ( final int R , final Reader reader , final String ... args ) {
  final int T = R ;
  final String [ ] [ ] result = new String [ R ] [ ] ;
  {
    readWord ( reader ) ;
  }
  {
    final String S = args [ 0 ] ;
    final StringBuffer res = new StringBuffer ( ) ;
    int i = S . length ( ) ;
    while ( i > 0 ) {
      i = S . substring ( 0 , i ) . lastIndexOf ( Math . max ( S . substring ( 0 , i ) , S . length ( ) ) ) ;
      res . append ( S . charAt ( i ) ) ;
      S = S . substring ( 0 , i ) + S . substring ( i + 1 ) ;
    }
    return res . toString ( ) . toCharArray ( ) ;
  }
  {
    final int solveLarge = 0 ;
    {
      solveLarge ++ ;
    }
  }
  {
    final StringBuilder sb = new StringBuilder ( ) ;
    sb . append ( "Case #" ) . append ( i ) . append ( ": " ) ;
    sb . append ( res ) ;
    sb . append ( "\n" ) ;
  }
  {
    final String readWord ( reader ) ;
    final int readInt = reader . nextInt ( 10 ) ;
    final int readLetters = reader . nextInt ( 10 ) ;
    final int readDigits = reader . nextInt ( 10 ) ;
    final String [ ] [ ] readWords = readWord . split ( " " ) ;
    final int [ ] readInts = reader . nextInt ( 10 ) ;
    final float [ ] readFloats = reader . nextFloats ( ) ;
    final float [ ] readArr = new float [ R ] [ ] ;
    for ( int i = 0 ;
    i < readArr . length ;
    i ++ ) {
      final int testCase = readCase ( reader ) ;
      final String res = solver . solve ( testCase ) ;
      writeCase ( sb , i , res ) ;
    }
  }
  {
    final String in = in + ".in" ;
    final String out = in + ".out" ;
    try {
      final BufferedReader fi = new BufferedReader ( new FileReader ( in ) ) ;
      final BufferedWriter fo = new BufferedWriter ( new FileWriter ( out ) ) ;
      final int T = reader . nextInt ( ) ;
      for ( int i = 0 ;
      i < T ;
      i ++ ) {
        final int testCase = readCase ( fi ) ;
        final int res = solver . solve ( testCase ) ;
        writeCase ( fo , i , res ) ;
      }
    }
    catch ( final IOException e ) {
      e