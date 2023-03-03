public static void main ( String [ ] args ) {
  int c1 [ ] = new int [ 3 ] ;
  int c2 [ ] = new int [ 3 ] ;
  int c3 [ ] = new int [ 3 ] ;
  boolean t = true ;
  if ( ! ( c1 [ 0 ] - c2 [ 0 ] == c1 [ 1 ] - c2 [ 1 ] == c1 [ 2 ] - c2 [ 2 ] ) ) {
    t = false ;
  }
  if ( ! ( c1 [ 0 ] - c3 [ 0 ] == c1 [ 1 ] - c3 [ 1 ] == c1 [ 2 ] - c3 [ 2 ] ) ) {
    t = false ;
  }
  if ( ! ( c1 [ 0 ] - c1 [ 1 ] == c2 [ 0 ] - c2 [ 1 ] == c3 [ 0 ] - c3 [ 1 ] ) ) {
    t = false ;
  }
  if ( ! ( c1 [ 0 ] - c1 [ 2 ] == c2 [ 0 ] - c2 [ 2 ] == c3 [ 0 ] - c3 [ 2 ] ) ) {
    t = false ;
  }
  if ( t ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
