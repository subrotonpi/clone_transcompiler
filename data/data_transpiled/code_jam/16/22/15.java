static final String [ ] args ( ) throws IOException {
  final String [ ] args = new String [ args . length ] ;
  final String [ ] poss = new String [ args . length ] ;
  for ( int i = 0 ;
  i < args . length ;
  i ++ ) {
    final char [ ] c = new char [ args . length ] ;
    final StringBuilder j = new StringBuilder ( args [ i ] ) ;
    for ( int j = 0 ;
    j < args . length ;
    j ++ ) {
      final int i = j ;
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' ) ;
        j . append ( '0' ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
        j . append ( args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '1' + args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
      }
      if ( args [ i ] . equals ( "?" ) && args [ i ] . equals ( "?" ) ) {
        poss [ j ] = ( char ) ( '0' + args [ i ] ) ;
      }
    }
    final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    final int T = Integer .