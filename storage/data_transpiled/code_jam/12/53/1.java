static final String getDiffOutput ( ) {
  final boolean sampledata ;
  final String infileName ;
  final String outfileName ;
  final int dels ;
  final int M , F , N ;
  if ( args . length > 1 ) {
    sampledata = false ;
    infileName = args [ 1 ] ;
  }
  else {
    sampledata = true ;
    final String scriptname = args [ 0 ] ;
    final String problemletter = scriptname . substring ( 0 , scriptname . indexOf ( '.' ) ) ;
    final String rightfile = base + "-example.in" ;
    final String out = new File ( outfileName ) . getAbsolutePath ( ) ;
    final String right = new File ( outfileName ) . getAbsolutePath ( ) ;
    if ( out . equals ( right ) ) {
      System . out . println ( "Congrats, your output matches sample output" ) ;
    }
    else {
      System . out . println ( "OUTPUT MISMATCH" ) ;
      final String outfileName = infileName . substring ( 0 , infileName . indexOf ( '.' ) ) + ".out" ;
      final File file = new File ( infileName ) ;
      final String text = file . getAbsolutePath ( ) ;
      final String [ ] lines = text . split ( "\n" ) ;
      final LineIterator linesiter = lines . iterator ( ) ;
      final String nextLine = linesiter . next ( ) ;
      final PrintStream ofile = new PrintStream ( new FileOutputStream ( outfileName ) ) ;
      System . setOut ( ofile ) ;
      final int T = Integer . parseInt ( nextLine . trim ( ) ) ;
      for ( int t = 1 ;
      t <= T ;
      t ++ ) {
        final int M = Integer . parseInt ( nextLine . trim ( ) ) ;
        final int F = Integer . parseInt ( nextLine . trim ( ) ) ;
        final int N = Integer . parseInt ( nextLine . trim ( ) ) ;
        final List < Integer > meals = new ArrayList < Integer > ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          meals . add ( Integer . parseInt ( nextLine . trim ( ) ) ) ;
        }
        final int best = cheapest . get ( i ) ;
        meals . remove ( best ) ;
        bmeals . add ( best ) ;
        day = best ;
        meals = new ArrayList < Integer > ( ) ;
      }
      int bdays = 0 ;
      bdels = - 1 ;
      {
        final int dp = F - dels * F ;
        if ( m