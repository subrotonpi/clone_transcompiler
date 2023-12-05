public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Set < Integer >> edge = new HashMap < Integer , Set < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < S . length ;
    j ++ ) {
      e . put ( i , i % S . length ) ;
    }
    e . put ( i , e . get ( i ) . stream ( ) . reduce ( new HashSet < Integer > ( ) ) ) ;
  }
  return edge ;
}
