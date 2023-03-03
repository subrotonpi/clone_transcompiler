@ inFile ( "D-large.in" ) public static String [ ] [ ] inFile ( ) {
  boolean [ ] used = new boolean [ L . length ] ;
  List < List < Integer >> subsets = new ArrayList < List < Integer >> ( ) ;
  for ( int ix : xrange ( L . length ) ) {
    if ( used [ ix ] ) continue ;
    used [ ix ] = true ;
    List < Integer > ixSubset = new ArrayList < Integer > ( ) ;
    ixSubset . add ( ix ) ;
    int nextIx = L . length - 1 ;
    while ( nextIx != ix ) {
      ixSubset . add ( nextIx ) ;
      used [ nextIx ] = true ;
      nextIx = L . length - 1 ;
    }
    subsets . add ( ixSubset ) ;
  }
  assert false == used [ 0 ] ;
  assert subsets . size ( ) == L . length ;
  return subsets . toArray ( new List < Integer > [ 0 ] [ ] ) ;
}
