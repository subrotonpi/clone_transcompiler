@ VisibleForTesting static int dfs ( List < Edge > edges , int start ) {
  final boolean [ ] visited = new boolean [ edges . size ( ) ] ;
  visited [ start ] = true ;
  int ans = 0 , dist = 0 ;
  final LinkedList < Edge > stack = new LinkedList < > ( ) ;
  stack . add ( new Edge ( start , 0 ) ) ;
  final ListIterator < Edge > pop = stack . listIterator ( ) ;
  final ListIterator < Edge > append = stack . listIterator ( ) ;
  while ( pop . hasNext ( ) ) {
    int v = pop . next ( ) ;
    final int _dist = pop . next ( ) . dist ;
    if ( _dist > dist ) {
      ans = v ;
      dist = _dist ;
    }
    for ( int e : edges . get ( v ) ) {
      if ( visited [ e ] ) continue ;
      visited [ e ] = true ;
      append . set ( new Edge ( e , _dist + 1 ) ) ;
    }
  }
  return ans ;
}
