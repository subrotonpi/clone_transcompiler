@ VisibleForTesting static int bfs ( List < List < Integer >> adjList , List < Integer > VCenter , int radius ) {
  final double INF = Double . MAX_VALUE ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> edges = new ArrayList < > ( ) ;
  for ( int e = 0 ;
  e < N - 1 ;
  e ++ ) {
    edges . add ( Lists . newArrayList ( ) ) ;
  }
  final List < List < Integer >> adjL = new ArrayList < > ( ) ;
  for ( int v = 0 ;
  v < N ;
  v ++ ) {
    adjL . add ( new ArrayList < > ( ) ) ;
  }
  for ( int a = 0 ;
  a < edges . size ( ) ;
  a ++ ) {
    final List < Integer > edges = edges . get ( a ) ;
    final int [ ] dist = new int [ numV ] ;
    for ( int v = 0 ;
    v < VCenter . size ( ) ;
    v ++ ) {
      dist [ v ] = INF ;
    }
    int ans = 0 ;
    final Queue < Integer > Q = new LinkedList < > ( VCenter ) ;
    while ( Q . size ( ) > 0 ) {
      final int vNow = Q . poll ( ) ;
      final int distNow = dist [ vNow ] ;
      if ( distNow > radius ) break ;
      ans ++ ;
      for ( final int v2 : adjList . get ( vNow ) ) {
        if ( dist [ v2 ] != INF ) continue ;
        dist [ v2 ] = distNow + 1 ;
        Q . add ( v2 ) ;
      }
    }
    return ans ;
  }
  int [ ] [ ] VC ;
  int r ;
  if ( K % 2 != 0 ) {
    VC = edges ;
    r = ( K - 1 ) / 2 ;
  }
  else {
    VC = new ArrayList < > ( ) ;
    for ( int v = 0 ;
    v < N ;
    v ++ ) {
      VC [ v ] = edges . get ( v ) ;
      r = K / 2 ;
    }
  }
  int ans = N ;
  for ( List < Integer > V : VC ) {
    int num = bfs ( adjL , V , r ) ;
    ans = Math . min ( ans , N - num ) ;
  }
  System . out . println ( ans ) ;
  return N ;
}
