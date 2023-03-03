static final String solve ( Map < Node , Set < Integer >> Wormholes , String Goal , Node Node , String Have ) throws IOException {
  final Set < Integer > connected = Wormholes . get ( Node ) . subtract ( Have ) ;
  if ( connected . contains ( Goal ) ) return true ;
  final Set < Integer > set = new HashSet < Integer > ( ) ;
  while ( connected . size ( ) > 0 ) {
    final Node item = connected . remove ( ) ;
    set . add ( item ) ;
    connected = connected . union ( set . add ( Wormholes . get ( item ) ) . subtract ( Have ) . subtract ( set ) ) ;
    if ( connected . contains ( Goal ) ) return true ;
  }
  return Goal . equals ( connected ) ? "" : "" ;
}
