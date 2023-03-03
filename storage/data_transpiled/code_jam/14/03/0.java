static final String readWord ( Reader in ) throws IOException {
  final int M = in . nextInt ( ) ;
  final String readWord = in . next ( ) . trim ( ) ;
  final int R = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final StringBuilder res = new StringBuilder ( ) ;
  for ( int r = R ;
  r < R + 1 ;
  r ++ ) {
    final int c = m / r ;
    final int z = m % r ;
    if ( c < 2 || c + ( z > 0 ? 1 : 0 ) ) continue ;
    if ( z < 3 || c < 3 ) continue ;
    for ( int x = 0 ;
    x < r ;
    x ++ ) res . append ( '.' ) ;
    for ( int y = 0 ;
    y < z ;
    y ++ ) res . append ( '.' ) ;
    if ( z == 1 ) res . append ( '.' ) ;
    res . append ( '*' ) ;
  }
  return "Impossible" ;
}
