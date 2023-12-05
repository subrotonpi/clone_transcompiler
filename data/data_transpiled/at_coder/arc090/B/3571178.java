public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* Find the first value in the list */
  if ( par [ 0 ] == 0 ) {
    return par [ 0 ] ;
  }
  else {
    par [ 0 ] = find ( par [ 0 ] ) ;
    dist [ 0 ] = dist [ 0 ] + dist [ par [ 0 ] ] ;
    return par [ 0 ] ;
  }
}
