static final String getSolutionName ( ) {
  final String problemName = "fractiles" ;
  final boolean runOnRealData = true ;
  {
    final int necessaryTiles = ( K + C - 1 ) / C ;
    if ( S < necessaryTiles ) {
      return new String [ ] {
        "IMPOSSIBLE" }
        ;
      }
      final int [ ] result = new int [ necessaryTiles ] ;
      int k = 0 ;
      int level = 0 ;
      int tile = 0 ;
      while ( result . length < necessaryTiles ) {
        tile = ( tile * K ) + Math . min ( k , K - 1 ) ;
        level ++ ;
        k ++ ;
        if ( level == C ) {
          result [ k ] = tile + 1 ;
          level = 0 ;
          tile = 0 ;
        }
      }
      return result ;
    }
    final File currentDir = new File ( System . getProperty ( "user.dir" ) ) ;
    final String inputString = "D-large.in" ;
    final String outputString = problemName + ( ! runOnRealData ? "_example_output" : "_output" ) ;
    final File inFile = new File ( currentDir , "inputfiles" + inputString ) ;
    final File outFile = new File ( currentDir , "outputfiles" + outputString + ".txt" ) ;
    if ( outFile . exists ( ) ) {
      outFile . delete ( ) ;
    }
    try {
      final Scanner inputScanner = new Scanner ( new FileReader ( inFile ) ) ;
      final int numberOfCases = Integer . parseInt ( inputScanner . nextLine ( ) ) ;
      for ( int testCase : xrange ( 1 , numberOfCases + 1 ) ) {
        Arrays . fill ( result , Integer . valueOf ( testCase ) ) ;
        final int [ ] result = solution ( K , C , S ) ;
        try {
          final PrintWriter pw = new PrintWriter ( new FileWriter ( outFile ) ) ;
          pw . printf ( "Case #%d: %s\n" , testCase ) ;
          pw . println ( " " + result [ 0 ] ) ;
        }
        catch ( final Exception e ) {
          e . printStackTrace ( ) ;
        }
      }
    }
    catch ( final FileNotFoundException e ) {
      e . printStackTrace ( ) ;
    }
    return null ;
  }
  