static final String getBase ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . parseInt ( input ) ;
  final String MAP = Integer . parseInt ( input ) ;
  final String LIST = Integer . parseInt ( input ) ;
  System . setSecurityManager ( new SecurityManager ( ) {
    final double INF = Double . POSITIVE_INFINITY ;
    final double MOD = 10 * 9 + 7 ;
    final int n = INT . compareTo ( INT ) ;
    if ( n < 1000 ) {
      System . out . println ( "ABC" ) ;
    }
    else {
      System . out . println ( "ABD" ) ;
    }
  }
  ) ;
  return INT ;
}
