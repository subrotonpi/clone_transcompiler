@ VisibleForTesting static void input ( Scanner in ) {
  final int N = in . nextInt ( ) ;
  final int X = in . nextInt ( ) ;
  final List < Edge > [ ] edges = new ArrayList [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] = new ArrayList < > ( ) ;
    for ( int l = in . nextInt ( ) ;
    l > 0 ;
    l -- ) {
      edges [ i ] . add ( new Edge ( in . nextInt ( ) , l ) ) ;
      edges [ i ] . add ( new Edge ( in . nextInt ( ) , l ) ) ;
    }
  }
  final IntHashMap xorCount = new IntHashMap ( ) , answer = 0 , dq = new ArrayDeque < > ( edges [ 1 ] ) ;
  final Deque < Edge > popLeft = new ArrayDeque < > ( ) , append = new ArrayDeque < > ( edges [ 1 ] ) ;
  final IntHashMap visited = new IntHashMap ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int v = popLeft . pop ( ) ;
    final int cost = dq . pop ( ) ;
    answer += xorCount . get ( X ^ cost ) ;
    xorCount . put ( cost , ++ v ) ;
    for ( int toV = 0 ;
    toV < N ;
    toV ++ ) {
      final int toCost = dq . pop ( ) ;
      if ( visited . get ( toV ) ) {
        continue ;
      }
      visited . put ( toV , 1 ) ;
      append . add ( new Edge ( toV , cost ^ toCost ) ) ;
    }
  }
  System . out . println ( answer ) ;
}
