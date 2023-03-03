static final String getProblemName ( ) {
  boolean sampleData ;
  String inFileName ;
  String problemLetter ;
  if ( args . length ( ) > 0 ) {
    sampleData = false ;
    inFileName = args [ 0 ] ;
  }
  else {
    sampleData = true ;
    String scriptName = args [ 0 ] ;
    problemLetter = scriptName . substring ( 0 , scriptName . indexOf ( '.' ) ) ;
    inFileName = problemLetter + "-example.in" ;
  }
  String outFileName = inFileName . substring ( 0 , inFileName . indexOf ( '.' ) ) + ".out" ;
  try {
    String text = IOUtils . toString ( new FileInputStream ( inFileName ) ) ;
    BufferedReader br = new BufferedReader ( new InputStreamReader ( new FileInputStream ( inFileName ) ) ) ;
    String line = null ;
    StringBuilder sb = new StringBuilder ( ) ;
    String linesiter = br . readLine ( ) ;
    while ( linesiter != null ) {
      line = linesiter . trim ( ) ;
    }
    line = line . trim ( ) ;
    LineNumberIterator linesiter = new LineNumberIterator ( sb ) ;
    nextLine = linesiter . readLine ( ) ;
    PrintStream ofile = new PrintStream ( new FileOutputStream ( outFileName ) ) ;
    System . setOut ( ofile ) ;
    int T = Integer . parseInt ( nextLine . trim ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int A = Integer . parseInt ( nextLine . trim ( ) ) ;
      int B = Integer . parseInt ( nextLine . trim ( ) ) ;
      double [ ] ps = Double . parseDouble ( nextLine . trim ( ) ) ;
      double best = 1 + B + 1 ;
      double pcorr = 1.0 ;
      for ( int i = 0 ;
      i < ps . length ;
      i ++ ) {
        pcorr *= ps [ i ] ;
        double ncorr = ( B - A ) + 2 * ( A - i - 1 ) + 1 ;
        double pwr = 1 - pcorr ;
        double nwr = ncorr + B + 1 ;
        double exp = pcorr * ncorr + pwr * nwr ;
        best = Math . min ( best , exp ) ;
      }
      System . out . println ( "Case #" + t + ":" + best ) ;
    }
    System . setOut ( new PrintStream ( new FileOutputStream ( outFileName ) ) ) ;
    ofile . close ( ) ;
    if ( sampleData ) {
      String base = problemLetter + "-example." ;
      String outfile