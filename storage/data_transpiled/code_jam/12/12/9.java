static final String getDiffOutput ( ) {
  final boolean sampleData ;
  final String infileName ;
  final String problemletter ;
  final String outfileName ;
  if ( args . length > 0 ) {
    sampleData = false ;
    infileName = args [ 0 ] ;
  }
  else {
    sampleData = true ;
    final String scriptname = args [ 0 ] ;
    problemletter = scriptname . substring ( 0 , scriptname . indexOf ( '.' ) ) ;
    infileName = problemletter + "-example.in" ;
  }
  else {
    sampleData = true ;
    final String outfileName = infileName . substring ( 0 , infileName . indexOf ( '.' ) ) + ".out" ;
    final File file = new File ( infileName ) ;
    final String text = file . getCanonicalPath ( ) ;
    final String [ ] lines = text . split ( "\n" ) ;
    final LineIterator linesiter = new LineIterator ( lines ) ;
    final String nextLine = linesiter . nextLine ( ) ;
    final PrintStream ofile = new PrintStream ( outfileName ) ;
    System . setOut ( new PrintStream ( ofile ) ) ;
    final int T = Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      final int N = Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) ;
      final List < int [ ] > pairs = new ArrayList < > ( N ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        pairs . add ( new int [ ] {
          0 , Integer . parseInt ( nextLine . split ( " " ) [ 0 ] ) }
          ) ;
        }
        int turns = 0 ;
        int stars = 0 ;
        boolean toobad = false ;
        Collections . sort ( pairs ) ;
        while ( pairs . get ( 0 ) [ 0 ] < 2 ) {
          boolean better = false ;
          for ( int [ ] pair : pairs ) {
            if ( pair [ 0 ] == 2 ) break ;
            if ( pair [ 1 ] <= stars ) {
              better = true ;
              turns ++ ;
              stars += 2 - pair [ 0 ] ;
              pair [ 0 ] = 2 ;
            }
          }
          if ( ! better ) {
            final int [ ] star0 = new int [ pairs . size ( ) ] ;
            for ( int i = 0 ;
            i < pairs . size ( ) ;
            i ++ ) {
              star0 [ i ] = pairs . get ( i ) ;
            }
            final int [ ] poss