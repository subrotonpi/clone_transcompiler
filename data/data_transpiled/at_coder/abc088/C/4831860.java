{
  c = Arrays . asList ( new int [ 3 ] ) ;
  if ( c [ 0 ] [ 0 ] - c [ 0 ] [ 1 ] == c [ 1 ] [ 0 ] - c [ 1 ] [ 1 ] == c [ 2 ] [ 0 ] - c [ 2 ] [ 1 ] && c [ 0 ] [ 1 ] - c [ 0 ] [ 2 ] == c [ 1 ] [ 1 ] - c [ 1 ] [ 2 ] == c [ 2 ] [ 1 ] - c [ 2 ] [ 2 ] && c [ 0 ] [ 0 ] - c [ 1 ] [ 0 ] == c [ 0 ] [ 1 ] - c [ 1 ] [ 1 ] == c [ 0 ] [ 2 ] - c [ 1 ] [ 2 ] && c [ 1 ] [ 0 ] - c [ 2 ] [ 0 ] == c [ 1 ] [ 1 ] - c [ 2 ] [ 1 ] == c [ 1 ] [ 2 ] - c [ 2 ] [ 2 ] ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}