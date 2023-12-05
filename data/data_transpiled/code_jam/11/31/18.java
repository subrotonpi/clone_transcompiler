static private void pout ( String [ ] [ ] panel ) {
  final int T ;
  for ( int i : xrange ( panel . length ) ) {
    for ( int j : xrange ( panel [ i ] . length ) ) System . out . print ( panel [ i ] [ j ] ) ;
    System . out . println ( "" ) ;
  }
  final int [ ] [ ] trans = new int [ xrange ( panel . length - 1 ) ] [ ] ;
  for ( int i = 0 ;
  i < xrange ( panel . length - 1 ) ;
  i ++ ) {
    if ( panel [ i ] . indexOf ( "#" ) == 1 ) return ;
    for ( int j = xrange ( panel [ i ] . length - 1 ) ;
    j < xrange ( panel [ i ] . length - 1 ) ;
    j ++ ) {
      if ( panel [ i ] [ j ] == '#' ) {
        if ( panel [ i ] [ j + 1 ] != '#' ) return ;
        if ( panel [ i + 1 ] [ j ] != '#' ) return ;
        if ( panel [ i + 1 ] [ j + 1 ] != '#' ) return ;
        if ( panel [ i + 1 ] [ j + 1 ] != '#' ) return ;
        panel [ i ] [ j ] = '/' ;
        panel [ i ] [ j + 1 ] = '\\' ;
        panel [ i + 1 ] [ j ] = '\\' ;
        panel [ i + 1 ] [ j ] = '/' ;
      }
    }
  }
  for ( int i = 0 ;
  i < xrange ( panel . length ) ;
  i ++ ) {
    if ( panel [ i ] . indexOf ( "#" ) > 0 ) return ;
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int t = xrange ( T ) ;
  t < T ;
  t ++ ) {
    final String [ ] data = scanner . nextLine ( ) . split ( " " ) ;
    final int R = Integer . parseInt ( data [ 0 ] ) ;
    final int C = Integer . parseInt ( data [ 1 ] ) ;
    final String [ ] [ ] panel = new String [ R ] [ C ] ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) {
      panel [ r ] = new String [ R ] ;
      final String line = scanner . nextLine ( ) ;
      for ( int c = 0 ;
      c < C ;
      c ++ ) panel [ r ] [ c ]