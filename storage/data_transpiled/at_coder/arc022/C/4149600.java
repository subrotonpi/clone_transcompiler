static private int dfs ( int [ ] [ ] edges , int start ) {
  boolean [ ] visited = new boolean [ edges . length ] ;
  visited [ start ] = true ;
  int ans = 0 , dist = 0 ;
  Stack < Edge > stack = new Stack < Edge > ( ) ;
  stack . push ( new Edge ( start , 0 ) ) ;
  Stack pop = stack . pop ( ) ;
  Stack append = stack . append ( new Edge ( start , 0 ) ) ;
  while ( stack . size ( ) > 0 ) {
    int v = pop . peek ( ) ;
    int _dist = dist ;
    if ( _dist > dist ) {
      ans = v ;
      dist = _dist ;
    }
    for ( int e : edges [ v ] ) {
      if ( visited [ e ] ) continue ;
      visited [ e ] = true ;
      append . push ( new Edge ( e , _dist + 1 ) ) ;
    }
  }
  return ans ;
}
