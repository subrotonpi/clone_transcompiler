static final private boolean diamondInheritance ( Map < Integer , Set < Integer >> M ) throws IOException {
  System . setProperty ( "java.awt.headless" , "true" ) ;
  /* DiamondInheritance */
  Set < Integer > visited = new HashSet < Integer > ( ) ;
  for ( Integer node : M . keySet ( ) ) {
    if ( ! visited . contains ( node ) ) {
      Set < Integer > currVisited = new HashSet < Integer > ( ) ;
      if ( visit ( M , node , currVisited ) ) return true ;
      visited . addAll ( currVisited ) ;
    }
  }
  /* DiamondInheritance */
  for ( Integer k : M . keySet ( ) ) {
    if ( visited . contains ( k ) ) return true ;
  }
  return false ;
}
