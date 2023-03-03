@ VisibleForTesting static void heapSort ( ) {
  int MOD = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] adjList = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int U = Integer . parseInt ( input . nextLine ( ) ) ;
    int V = Integer . parseInt ( input . nextLine ( ) ) ;
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    adjList [ U - 1 ] [ i ] = new int [ V - 1 ] ;
    adjList [ V - 1 ] [ i ] = new int [ D ] ;
    for ( int j = 0 ;
    j < D ;
    j ++ ) adjList [ i ] [ j ] = new int [ D ] ;
  }
  int [ ] numRouteS = new int [ N ] ;
  numRouteS [ S ] = 1 ;
  float [ ] cost = new float [ N ] ;
  cost [ S ] = 0 ;
  int [ ] prev = new int [ N ] ;
  List < Integer > vs = new ArrayList < Integer > ( ) ;
  PriorityQueue < Integer > pq = new PriorityQueue < Integer > ( ) ;
  heapSort ( pq , ( int ) 0 , S ) ;
  while ( pq . size ( ) > 0 ) {
    int c = pq . poll ( ) ;
    int vNow = pq . poll ( ) ;
    if ( c > cost [ vNow ] ) continue ;
    if ( c > cost [ T ] ) break ;
    vs . add ( vNow ) ;
    for ( int j = 0 ;
    j < V ;
    j ++ ) {
      int v2 = adjList [ vNow ] [ j ] ;
      float wt = c + wt ;
      if ( c2 < cost [ v2 ] ) {
        cost [ v2 ] = c2 ;
        prev [ v2 ] = new int [ vNow ] ;
        numRouteS [ v2 ] = numRouteS [ vNow ] ;
        heapSort ( pq , ( int ) c2 ) ;
      }
      else if ( c2 == cost [ v2 ] ) {
        prev [ v2 ] += new int [ vNow ] ;
        numRouteS [ v2 ] = ( numRouteS [ v2 ] + numRouteS [ vNow ] ) % MOD ;
      }
    }
  }
  