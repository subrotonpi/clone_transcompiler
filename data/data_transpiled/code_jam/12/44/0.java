static final String getDiffText ( ) {
  final boolean sampledata = false ;
  final String infileName ;
  if ( args . length > 1 ) {
    sampledata = true ;
    final String scriptname = args [ 0 ] ;
    final int dr = scriptname . indexOf ( '.' ) ;
    final int np = problemletter + "-example.in" ;
    final String outfileName = infileName . substring ( 0 , infileName . indexOf ( '.' ) ) + ".out" ;
    try {
      final String text = IOUtils . toString ( new FileInputStream ( infileName ) ) ;
      final String [ ] lines = text . split ( "\n" ) ;
      final Iterator < String > linesiter = lines . iterator ( ) ;
      final String nextLine = linesiter . next ( ) ;
      final PrintStream out = new PrintStream ( new FileOutputStream ( outfileName ) ) ;
      System . setOut ( out ) ;
      final boolean isLucky = isLucky ( okay , bad , dst , at , nogo ) ;
      if ( at . size ( ) == 1 && dst . contains ( at [ 0 ] ) ) {
        return true ;
      }
      else {
        final Set < Pair < Integer , Integer >> dirs = new HashSet < Pair < Integer , Integer >> ( ) ;
        dirs . add ( new Pair < Integer , Integer > ( - 1 , 0 ) ) ;
        dirs . add ( new Pair < Integer , Integer > ( 0 , + 1 ) ) ;
        dirs . add ( new Pair < Integer , Integer > ( + 1 , 0 ) ) ;
        if ( nogo != null ) dirs . remove ( nogo ) ;
        for ( final Pair < Integer , Integer > dc : dirs ) {
          final Integer dr = dc . compareTo ( at [ 0 ] ) ;
          final Set < Pair < Integer , Integer >> newat = new HashSet < Pair < Integer , Integer >> ( ) ;
          boolean allgood = true ;
          for ( final Pair < Integer , Integer > p : at ) {
            final int c = p . first ( ) ;
            final int r = p . second ( ) ;
            final int np = ( c + dc ) ;
            if ( bad . contains ( np ) ) {
              allgood = false ;
              break ;
            }
            if ( ! okay . contains ( np ) ) {
              np = p . first ( ) ;
            }
            newat . add ( np ) ;
          }
          if ( ! allgood ) continue ;
          nogo = null ;
          if ( newat . isEmpty ( ) ) continue ;
          if (