static final int [ ] [ ] dijkstra ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] s1 = new int [ N ] [ M ] ;
  int [ ] [ ] s2 = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    int g = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    s1 [ s - 1 ] [ 0 ] = new int [ g - 1 ] ;
    s2 [ g - 1 ] [ 0 ] = new int [ s - 1 ] ;
  }
  int INF = 10 * 9 ;
  int [ ] [ ] TT = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    TT [ i ] = T ;
  }
  {
    int [ ] cost = new int [ N ] ;
    Arrays . fill ( cost , INF ) ;
    cost [ 0 ] = 0 ;
    Set < Integer > visited = new THashSet < Integer > ( 0 ) ;
    HashSet < Integer > set = new HashSet < Integer > ( ) ;
    set . add ( new Integer ( 0 ) ) ;
    while ( hashSet . size ( ) > 0 ) {
      int u = heapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheapheap @ @