@ VisibleForTesting static int kruskal ( int vCount , @ Nonnull List < Edge > edges ) {
  final int [ ] tree = new int [ vCount ] ;
  Arrays . fill ( tree , - 1 ) ;
  /* get root */
  if ( tree [ vCount ] < 0 ) {
    return vCount ;
  }
  tree [ vCount ] = getRoot ( tree [ vCount ] ) ;
  /* unite a pair */
  int x = getRoot ( a [ 1 ] ) , y = getRoot ( a [ 2 ] ) ;
  if ( x != y ) {
    int big = ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( x < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y < tree [ vCount ] ) ? tree [ vCount ] : ( y