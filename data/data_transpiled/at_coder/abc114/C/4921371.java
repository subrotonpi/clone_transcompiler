static final String getStdIn ( ) {
  final double INF = Double . POSITIVE_INFINITY ;
  @ SuppressWarnings ( "unchecked" ) final double b = INF ;
  final double f = Math . pow ( b , n ) ;
  if ( n < 3 ) {
    return 0 ;
  }
  return f - 3 * f + 3 * f + 3 ;
}
