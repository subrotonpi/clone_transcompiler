public static int [ ] dfs ( ) {
  int ans [ ] = new int [ N ] ;
  int vNow = 0 ;
  do {
    useds [ vNow ] = true ;
    ans [ vNow + 1 ] = vNow ;
    for ( int v2 : adjL [ vNow ] ) {
      if ( ! useds [ v2 ] ) {
        vNow = v2 ;
        break ;
      }
    }
  }
  while ( vNow != 0 ) ;
  return ans ;
}
