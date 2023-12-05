static final String getUsage ( ) {
  final String usage = System . getProperty ( "usage" ) ;
  final int INT = Integer . parseInt ( usage ) ;
  final int MAP = Integer . parseInt ( usage ) ;
  final int LIST = Integer . parseInt ( usage ) ;
  System . setOut ( new PrintStream ( System . out ) ) ;
  INF = Double . MAX_VALUE ;
  MOD = 10 * * 9 + 7 ;
  final String s = usage ;
  System . out . println ( s [ 0 ] . charAt ( 0 ) + "," + s [ 1 ] . charAt ( 0 ) + "," + s [ 2 ] . charAt ( 0 ) + "," " ) ; return s ; }