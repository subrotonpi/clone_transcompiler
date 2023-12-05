static final String getIntermediateOutput ( ) throws IOException {
  final String FILE_NAME = "C-small-attempt1" ;
  final String INPUT_FILE = FILE_NAME + ".in" ;
  final String OUTPUT_FILE = FILE_NAME + ".out" ;
  final Scanner input = new Scanner ( System . in ) ;
  int numCases = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    M = Integer . parseInt ( input . nextLine ( ) ) ;
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    broken = new int [ M ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      broken [ i ] [ j ] = input . nextInt ( ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      broken [ i ] [ j ] = input . nextInt ( ) ;
    }
    if ( broken [ i ] [ j ] == 1 ) {
      return false ;
    }
    if ( broken [ i ] > 0 && broken [ j ] == 0 && broken [ i - 1 ] [ j - 1 ] == 1 ) {
      return false ;
    }
    if ( broken [ j ] < 0 && broken [ i ] [ j ] == 1 ) {
      return false ;
    }
    if ( broken [ i ] [ j ] == 1 ) {
      return false ;
    }
    if ( broken [ j ] == 0 && broken [ j ] == 0 && broken [ j ] == 0 && broken [ j ] == 1 ) {
      return false ;
    }
    if ( broken [ i ] [ j ] == 1 ) {
      return false ;
    }
    if ( broken [ j ] == 0 && broken [ j ] == 0 && broken [ j ] == 0 && broken [ j ] == 1 ) {
      return false ;
    }
  }
  final Scanner scanner = new Scanner ( System . in ) ;
  int greedy = scanner . nextInt ( ) ;
  int ret = 0 ;
  final int [ ] order = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      order [ i ] = new int [ ] {
        i , j }
        ;
      }
      Collections . shuffle ( order ) ;
      for ( int i = 0 ;
      i < order . length ;
      i ++ ) {
        order [ i ] = order [ i ] ;
      }
      scanner . close ( ) ;
    }
    scanner . close ( ) ;
    scanner . close ( ) ;
    return OUTPUT_FILE