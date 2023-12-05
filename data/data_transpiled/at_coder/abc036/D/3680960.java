static final int [ ] getLevels ( ) {
  final String fin = System . getProperty ( "line.separator" ) ;
  @ SuppressWarnings ( "resource" ) final int [ ] parent = new int [ adj . length ] ;
  final int [ ] level = new int [ adj . length ] ;
  Arrays . fill ( level , 0 ) ;
  level [ s ] = 0 ;
  final Queue < Integer > queue = new ArrayDeque < > ( ) ;
  queue . add ( s ) ;
  while ( queue . size ( ) > 0 ) {
    final int node = queue . poll ( ) ;
    for ( int neighbor : adj [ node ] ) {
      if ( level [ neighbor ] == 0 ) {
        parent [ neighbor ] = node ;
        level [ neighbor ] = level [ node ] + 1 ;
        queue . add ( neighbor ) ;
      }
    }
  }
  return parent ;
}
