static final String getDiffText ( ) {
  final boolean sampleData ;
  final String infileName ;
  final String outfileName ;
  final String problemletter ;
  final String scriptname = "diff" ;
  final String outfileName = "diff" ;
  if ( scriptname . length ( ) > 0 ) {
    sampleData = false ;
    infileName = base + "right" ;
  }
  else {
    sampleData = true ;
    final String fileName = "diff" ;
    scriptname = fileName . substring ( 0 , fileName . indexOf ( '.' ) ) ;
    problemletter = fileName . substring ( 0 , fileName . indexOf ( '.' ) ) ;
    infileName = fileName . substring ( fileName . indexOf ( '.' ) + 1 ) + "-example.in" ;
  }
  final String outfileName = infileName . substring ( 0 , infileName . indexOf ( '.' ) ) + ".out" ;
  try {
    final File file = new File ( infileName ) ;
    final String text = file . getCanonicalPath ( ) ;
    final String [ ] lines = text . split ( "\n" ) ;
    final LineIterator linesiter = new LineIterator ( lines ) ;
    final String nextLine = linesiter . nextLine ( ) ;
    final PrintStream ofile = new PrintStream ( outfileName ) ;
    System . setOut ( new PrintStream ( ofile ) {
      @ Override public void println ( ) {
        super . println ( ) ;
      }
    }
    ) ;
    System . setOut ( new PrintStream ( new FileOutputStream ( outfileName ) ) {
      @ Override public int size ( ) {
        return 3000 ;
      }
      @ Override public int size ( ) {
        return 10 ;
      }
    }
    ) ;
    final int top = 10 * 9 ;
    {
      final int [ ] hs ;
      final int a = aims [ 0 ] ;
      if ( ! ( 1 <= a && a < aims . length ) ) {
        throw new Impossible ( ) ;
      }
      final String [ ] before = aims . substring ( 1 , a + 1 ) ;
      final String [ ] after = aims . substring ( a ) . split ( " " ) ;
      final int [ ] bhs = hites ( before ) . clone ( ) ;
      final int bn = bhs . length ;
      bhs = Arrays . copyOf ( bhs , bn ) ;
      final int [ ] ahs = hites ( after ) ;
      hs = new int [ N ] ;
      hs [ 0 ] = bhs + ahs ;
      return hs . length ;
    }
  }
  catch ( final IOException e ) {
    e . printStackTrace