@ VisibleForTesting static double solve ( int R , int C , int N ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int T = input . nextInt ( ) ;
  final Set < Pair < Integer , Integer >> positions = new HashSet < > ( ) ;
  for ( int j = 0 ;
  j < C ;
  j ++ ) {
    positions . add ( new Pair < > ( i , j ) ) ;
  }
  for ( final Pair < Integer , Integer > combination : new CombiningSet < > ( positions , N ) ) {
    int penalty = 0 ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      for ( int j = 0 ;
      j < C ;
      j ++ ) {
        if ( combination . contains ( new Pair < > ( i , j ) ) && combination . contains ( new Pair < > ( i + 1 , j ) ) ) {
          penalty ++ ;
        }
        if ( combination . contains ( new Pair < > ( i , j ) ) && combination . contains ( new Pair < > ( i , j + 1 ) ) ) {
          penalty ++ ;
        }
      }
    }
    best = Math . min ( best , penalty ) ;
  }
  return best ;
}
