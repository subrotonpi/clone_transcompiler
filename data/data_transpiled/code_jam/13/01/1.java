static boolean hasWon ( char [ ] game , char player ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final int T = in . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    boolean success = true ;
    for ( int jj = 0 ;
    jj < 4 ;
    jj ++ ) {
      if ( game [ 4 * ii + jj ] != player && game [ 4 * ii + jj ] != 'T' ) success = false ;
    }
    if ( success ) return true ;
    success = true ;
    for ( int jj = 0 ;
    jj < 4 ;
    jj ++ ) {
      if ( game [ 4 * jj + ii ] != player && game [ 4 * jj + ii ] != 'T' ) success = false ;
    }
    if ( success ) return true ;
  }
  success = true ;
  for ( int ii = 0 ;
  ii < 4 ;
  ii ++ ) {
    if ( game [ ii * 5 ] != player && game [ ii * 5 ] != 'T' ) success = false ;
  }
  if ( success ) return true ;
  success = true ;
  for ( int ii = 0 ;
  ii < 4 ;
  ii ++ ) {
    if ( game [ 3 + ii * 3 ] != player && game [ 3 + ii * 3 ] != 'T' ) success = false ;
  }
  if ( success ) return true ;
  return false ;
}
