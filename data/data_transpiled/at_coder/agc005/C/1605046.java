@ VisibleForTesting static void solve ( ) {
  final double INF = Double . MAX_VALUE ;
  /* solve the number of elements */
  final int maxLength = Math . max ( c . length , INF ) ;
  for ( int i = maxLength ;
  i > maxLength / 2 ;
  i -- ) {
    if ( c [ i ] < 2 ) {
      return ;
    }
  }
  if ( maxLength % 2 == 0 ) {
    if ( c [ maxLength / 2 ] != 1 ) {
      return ;
    }
  }
  else {
    if ( c [ maxLength - maxLength / 2 ] != 2 ) {
      return ;
    }
  }
  /* main program */
  final int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] c = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( solve ( c ) ? "Possible" : "Impossible" ) ;
}
