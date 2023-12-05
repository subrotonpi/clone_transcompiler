static final String getUsage ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . parseInt ( input ) ;
  final String MAP = Integer . parseInt ( input ) ;
  final String LIST = Integer . parseInt ( input ) ;
  System . setProperty ( "line.separator" , "," ) ;
  INF = Double . MAX_VALUE ;
  MOD = 10 * 9 + 7 ;
  final int H = MAP . length ( ) ;
  final int W = MAP . length ( ) ;
  final int [ ] C = new int [ H ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    C [ i ] = MAP [ i ] ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    System . out . println ( i ) ;
    System . out . println ( " " + i ) ;
  }
  return INT ;
}
