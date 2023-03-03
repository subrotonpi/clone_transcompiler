static private boolean findAncestorsDiamond ( int i , Set < Integer > Parents , Map < Integer , Set < Integer >> Ancestors ) throws IOException {
  final Set < Integer > PofI = Parents . get ( i ) ;
  Set < Integer > anI = PofI ;
  for ( int p : PofI ) {
    if ( ! Ancestors . containsKey ( p ) ) {
      if ( findAncestorsDiamond ( p , Parents , Ancestors ) ) return true ;
    }
    if ( anI . size ( ) & Ancestors . get ( p ) . size ( ) > 0 ) return true ;
    anI = anI . toArray ( new Set [ anI . size ( ) ] ) ;
  }
  Ancestors . put ( i , anI ) ;
  return false ;
}
