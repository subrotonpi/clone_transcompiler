static private final Scanner getScanner ( ) throws FileNotFoundException {
  final String fileName = "D-large" ;
  System . in . read ( new File ( fileName + ".in" ) ) ;
  final File output = new File ( fileName + ".out" ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = input . nextInt ( ) ;
    final int M = input . nextInt ( ) ;
    System . out . println ( "N=" + N + ", M=" + M ) ;
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final Set < Integer > rook = new HashSet < Integer > ( ) ;
    final Set < Integer > bishop = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      final int t = input . nextInt ( ) ;
      final int i = input . nextInt ( ) ;
      final int j = input . nextInt ( ) ;
      if ( newRook . contains ( t ) || newRook . contains ( t ) ) {
        if ( allBishop . contains ( t ) ) {
          newRook . add ( "o" + i , j ) ;
        }
        else {
          newRook . add ( "x" + i , j ) ;
        }
      }
      else {
        newRook . add ( t ) ;
      }
    }
    final int totalScore = allRook . size ( ) + allBishop . size ( ) ;
    final Set < Integer > newRook = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < totalScore ;
    i ++ ) {
      final int t = input . nextInt ( ) ;
      final int i = input . nextInt ( ) ;
      final int j = input . nextInt ( ) ;
      if ( t == 'x' || t == 'o' ) {
        newRook . add ( new Integer ( i ) ) ;
      }
      if ( t == '+' || t == 'o' ) {
        bishop . add ( new Integer ( i ) ) ;
      }
    }
    final int nr = rook . size ( ) ;
    final int nb = bishop . size ( ) ;
    final Set < Integer > filledRows = new HashSet < Integer > ( ) ;
    final Set < Integer > filledCols = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < nb