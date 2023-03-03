static final String getBase ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . valueOf ( input ) ;
  final String MAP = Integer . valueOf ( input ) ;
  final String LIST = Integer . valueOf ( input ) ;
  System . setProperty ( "Int32" , INT ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  final double MOD = 10 * 9 + 7 ;
  final int a = MAP . length ( ) ;
  final int b = MOD * INF ;
  final int x = MOD * INF ;
  return a + b + x ;
}
