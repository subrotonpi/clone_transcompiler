static final String getProblemName ( ) {
  boolean sampleData ;
  String inFileName ;
  if ( args . length > 0 ) {
    sampleData = false ;
    inFileName = args [ 0 ] ;
  }
  else {
    sampleData = true ;
    String scriptName = args [ 0 ] ;
    String problemletter = scriptName . substring ( 0 , scriptName . indexOf ( '.' ) ) ;
    inFileName = problemletter + "-example.in" ;
  }
  String outFileName = inFileName . substring ( 0 , inFileName . indexOf ( '.' ) ) + ".out" ;
  try {
    String text = IOUtils . toString ( new FileInputStream ( inFileName ) ) ;
    String [ ] lines = text . split ( "\n" ) ;
    LineNumberIterator linesiter = new LineNumberIterator ( lines ) ;
    String nextLine = linesiter . nextLine ( ) ;
    PrintStream ofile = new PrintStream ( outFileName ) ;
    System . setOut ( ofile ) ;
    int T = Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int N = Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) ;
      List < List < Integer >> vs = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < xrange ( N ) ;
      i ++ ) vs . add ( Integer . parseInt ( nextLine . split ( " " ) [ i ] ) + 1 ) ;
      int dst = Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) ;
      int reach = 0 ;
      vs . get ( 0 ) . _2 = vs . get ( 0 ) . _2 ;
      while ( vs . size ( ) > 0 ) {
        List < Integer > v = vs . remove ( 0 ) ;
        int l = Math . min ( v . _2 , v . _2 ) ;
        reach = Math . max ( reach , v . _1 + l ) ;
        for ( List < Integer > ov : vs ) {
          if ( ov . _1 <= v . _1 + l ) ov . _2 = Math . max ( ov . _2 , ov . _1 - v . _1 ) ;
          else break ;
        }
      }
      System . out . println ( "Case #" + t + ":" + ( reach >= dst ? "YES" : "NO" ) ) ;
    }
    System . setOut ( ofile ) ;
    ofile . close ( ) ;
    if ( sampleData