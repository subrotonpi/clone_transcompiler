@ Produces @ IntoMap @ IntKey private static int [ ] [ ] readFrom ( int N ) {
  class Dinic {
    int N ;
    int [ ] [ ] G = new int [ N ] [ ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int c = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
      int d = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( ab [ j ] [ 0 ] < c && ab [ j ] [ 1 ] < d ) {
          dinic . addEdge ( i + 1 , n + j , 1 ) ;
        }
      }
      dinic . addEdge ( 0 , i + 1 , 1 ) ;
      dinic . addEdge ( n + 1 , 2 * n + 1 , 1 ) ;
    }
    int ans = dinic . flow ( 0 , 2 * n + 1 ) ;
    System . out . println ( ans ) ;
    G [ 0 ] [ 0 ] = ans ;
    System . out . println ( ans ) ;
  }
  {
    int [ ] [ ] edge1 = new int [ N ] [ ] ;
    edge1 [ 0 ] = v2 ;
    edge1 [ 1 ] = cap1 ;
    edge1 [ 1 ] = null ;
    edge1 [ 2 ] = edge2 [ 1 ] = v1 ;
    edge2 [ 2 ] = cap2 ;
    edge1 [ 3 ] = edge2 [ 2 ] = v1 ;
    G [ 0 ] [ 1 ] = edge1 ;
    G [ 1 ] [ 2 ] = edge2 [ 3 ] = v2 ;
  }
  int ans ;
  int [ ] [ ] level = new int [ N ] [ N ] ;
  Deque < int [ ] > deq = new ArrayDeque < > ( ) ;
  level [ N ] = null ;
  deq . add ( N ) ;
  deq . add ( N ) ;
  level [ N ] = 0 ;
  int [ ] [ ] G = G ;
  while ( deq . size ( ) > 0 ) {
    int v = deq . poll ( ) ;
    int lv = level [ N ] + 1 ;
    for ( int [ ] w : G [ v ] ) {
      int cap = level [ N ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        int [ ] rev = level [ N ] ;
        if ( cap > 0 && level [ N ] < level [ N ] ) {
          level [ N ] =