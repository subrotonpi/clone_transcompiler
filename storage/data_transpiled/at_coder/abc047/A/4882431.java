static final String getExample ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . parseInt ( input ) ;
  final String MAP = Integer . parseInt ( input ) ;
  final String LIST = Integer . parseInt ( input ) ;
  System . setSecurityManager ( new SecurityManager ( ) {
    final double INF = Double . POSITIVE_INFINITY ;
    final double MOD = 10 * 9 + 7 ;
    final int a = MAP . get ( ) ;
    final int b = MAP . get ( ) ;
    final int c = MAP . get ( ) ;
    if ( a + b == c ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( a + c == b ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( b + c == a ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  ) ;
  return INT + " " + MAP + " " + LIST + " " + LIST ;
}
