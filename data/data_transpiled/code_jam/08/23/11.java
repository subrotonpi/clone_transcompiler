@ VisibleForTesting static void loadFile ( String input ) throws IOException {
  final Scanner fin = new Scanner ( new File ( "1_input.txt" ) ) ;
  final PrintStream fout = new PrintStream ( new FileOutputStream ( "1_output.txt" ) ) ;
  final int cases = Integer . parseInt ( fin . nextLine ( ) ) ;
  final long t0 = System . currentTimeMillis ( ) ;
  for ( int casenr = 0 ;
  casenr < cases ;
  casenr ++ ) {
    final int K = Integer . parseInt ( fin . nextLine ( ) ) ;
    final List < Integer > indices = CollectionUtils . getAdjacentIndices ( fin . nextLine ( ) ) ;
    final int size = indices . size ( ) ;
    final List < Integer > openIndices = new ArrayList < > ( ) ;
    final List < Integer > closedIndices = new ArrayList < > ( ) ;
    for ( int i = 1 ;
    i <= K ;
    i ++ ) {
      openIndices . add ( i ) ;
      closedIndices . add ( i ) ;
    }
    int currentNumber = 1 ;
    int currentPosition = - 1 ;
    while ( openIndices . size ( ) > 0 ) {
      final int nextIndex = ( currentPosition + currentNumber ) % openIndices . size ( ) ;
      closedIndices . set ( openIndices . get ( nextIndex ) - 1 , currentNumber ) ;
      openIndices . remove ( nextIndex ) ;
      currentPosition = nextIndex - 1 ;
      currentNumber ++ ;
    }
    fout . println ( "Case #" + ( casenr + 1 ) + ":" ) ;
    for ( int ind : indices ) {
      fout . print ( " " + closedIndices . get ( ind - 1 ) ) ;
    }
    fout . println ( ) ;
  }
}
