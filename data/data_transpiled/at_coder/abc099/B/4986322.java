static final String getUsage ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . parseInt ( input ) ;
  final String MAP = Integer . parseInt ( input ) ;
  final String LIST = Integer . parseInt ( input ) ;
  System . setSecurityManager ( new SecurityManager ( ) {
    final double INF = Double . POSITIVE_INFINITY ;
    final double MOD = 10 * 9 + 7 ;
    @ Override public int getHashCode ( ) {
      return ( int ) ( ( - INF ) * ( - INF ) / 2 - a ) ;
    }
  }
  ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  final double MOD = 10 * 9 + 7 ;
  int a = MAP . getHashCode ( ) ;
  int b = MOD ;
  for ( int x = 2 ;
  x < 1000 ;
  x ++ ) {
    if ( b - a == x ) {
      System . out . println ( ( int ) ( ( x - 1 ) * x / 2 - a ) ) ;
    }
  }
  return INT + " " + a + " " + b ;
}
