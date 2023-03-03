static final String [ ] args ( ) {
  final boolean sampledata ;
  final String infileName ;
  final String outfileName ;
  final String problemletter = "-" ;
  if ( args . length > 1 ) {
    sampledata = false ;
    infileName = args [ 1 ] ;
  }
  else {
    sampledata = true ;
    final String scriptname = args [ 0 ] ;
    final String problemletter = scriptname . substring ( 0 , scriptname . indexOf ( '.' ) ) ;
    infileName = problemletter + "-example.in" ;
    final String out = new File ( outfileName ) . getCanonicalPath ( ) ;
    final String right = new File ( infileName ) . getCanonicalPath ( ) + ".out" ;
    if ( out . equals ( right ) ) {
      System . out . println ( "Congrats, your output matches" ) ;
      final String text = "diff " + infileName ;
      final String [ ] lines = text . split ( "\n" ) ;
      final LineIterator linesiter = new LineIterator ( lines ) ;
      final String nextLine = linesiter . nextLine ( ) ;
      final PrintStream ofile = new PrintStream ( outfileName ) ;
      System . setOut ( ofile ) ;
      final String let = "oieastbg" ;
      final String num = "01345789" ;
      final Map < String , String > letnum = new HashMap < String , String > ( ) ;
      letnum . put ( let , num ) ;
      final int T = Integer . parseInt ( nextLine . substring ( 0 , T ) ) ;
      for ( int t = 1 ;
      t <= T ;
      t ++ ) {
        final int k = Integer . parseInt ( nextLine . substring ( t + 1 ) ) ;
        final String [ ] s = nextLine . split ( " " ) ;
        final Set < String > pairs = new HashSet < String > ( ) ;
        for ( int i = 0 ;
        i < s . length ;
        i ++ ) {
          final String c = s [ i ] ;
          if ( i == 0 ) continue ;
          final String b = s [ i - 1 ] ;
          pairs . add ( b + c ) ;
          if ( letnum . containsKey ( b ) ) pairs . add ( letnum . get ( b ) + c ) ;
          if ( letnum . containsKey ( c ) && letnum . containsKey ( c ) ) pairs . add ( letnum . get ( b ) + letnum . get ( c ) ) ;
        }
      }
      out = new String [