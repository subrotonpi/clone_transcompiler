static final String solve ( String state , int K ) throws IOException {
  final int N = state . length ( ) ;
  final double [ ] xs = new double [ N ] ;
  for ( int s = 0 ;
  s < N ;
  s ++ ) {
    xs [ s ] = s == '+' ? 1 : 0 ;
  }
  int ret = 0 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    if ( xs [ i ] == 0 ) {
      ret ++ ;
      xs [ i ] = 1 - xs [ i ] ;
    }
  }
  if ( xs . length - K > 0 ) {
    return "" + ret ;
  }
  return "IMPOSSIBLE" ;
}
