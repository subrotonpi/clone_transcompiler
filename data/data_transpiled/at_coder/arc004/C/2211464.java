@ VisibleForTesting static void fractions ( Scanner input ) {
  int X = input . nextInt ( ) ;
  boolean f = false ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    int N = ( int ) ( 2 * X ) + i ;
    int M = N * ( N + 1 ) / 2 - X * N ;
    if ( M == Integer . MIN_VALUE && 1 <= M && M <= N ) {
      System . out . println ( N + " " + M ) ;
      f = true ;
    }
  }
  if ( ! f ) {
    System . out . println ( "Impossible" ) ;
  }
}
