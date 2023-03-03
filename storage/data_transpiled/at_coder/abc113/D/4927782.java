static final String [ ] getStrings ( ) {
  final double INF = Double . POSITIVE_INFINITY ;
  final double MOD = 1000000007 ;
  @ SuppressWarnings ( "unused" ) final int f = INF ;
  if ( f <= 0 ) {
    return 1 ;
  }
  else if ( f == 1 ) {
    return 2 ;
  }
  else {
    return f - 1 + f - 2 ;
  }
}
