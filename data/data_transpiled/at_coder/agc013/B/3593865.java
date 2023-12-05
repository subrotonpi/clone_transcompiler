public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . readLine ( ) ) ) ;
  /*for (int i = 0; i < edge[v]; i++) {
  if (visited[i]) continue;
  visited[i] = true;
  return i;
  }*/
  @ SuppressWarnings ( "unchecked" ) Map < Integer , List < Integer >> edge = new HashMap < Integer , List < Integer >> ( ) ;
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  boolean [ ] visited = new boolean [ N + 1 ] ;
  visited [ N ] = false ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) visited [ i ] = true ;
  return edge ;
}
