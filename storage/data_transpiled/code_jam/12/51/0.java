static final String getProblemName ( ) {
  boolean sampleData ;
  String inFileName ;
  String problemletter ;
  if ( args . length > 0 ) {
    sampleData = false ;
    inFileName = args [ 0 ] ;
  }
  else {
    sampleData = true ;
    String scriptName = args [ 0 ] ;
    problemletter = scriptName . substring ( 0 , scriptName . indexOf ( '.' ) ) ;
    inFileName = problemletter + "-example.in" ;
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
    br . close ( ) ;
    nextLine = br . readLine ( ) ;
    PrintStream ofile = new PrintStream ( new FileOutputStream ( outFileName ) ) ;
    System . setOut ( ofile ) ;
    int T = Integer . parseInt ( nextLine . trim ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int N = Integer . parseInt ( nextLine . trim ( ) ) ;
      float [ ] ls = map ( nextLine . trim ( ) ) . split ( " " ) ;
      float [ ] ps = map ( nextLine . trim ( ) ) . split ( " " ) ;
      Arrays . sort ( ps ) ;
      float [ ] es = new float [ N ] ;
      for ( int i = 0 ;
      i < es . length ;
      i ++ ) {
        es [ i ] = ( ls [ i ] / ( 1 - ps [ i ] ) - ls [ i ] ) ;
      }
      Arrays . sort ( es , Collections . reverseOrder ( ) ) ;
      int [ ] inds = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        inds [ i ] = N - es [ i ] ;
      }
      System . out . println ( "Case #" + t + ":" + Arrays . toString ( inds ) ) ;
    }
    System . setOut ( new PrintStream ( new FileOutputStream ( outFileName ) ) ) ;
    ofile . close ( ) ;
    if ( sampleData ) {
      String base = problemletter + "-example.in"