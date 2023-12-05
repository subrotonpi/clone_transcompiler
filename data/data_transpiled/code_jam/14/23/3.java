@ VisibleForTesting static int solve ( Map < Integer , Set < Integer >> graph , Set < Integer > removed , int start ) {
  /* feasible */
  Set < Integer > visited = new HashSet < > ( ) ;
  /* feasible */
  if ( visited . contains ( start ) || removed . contains ( start ) ) {
    return 0 ;
  }
  visited . add ( start ) ;
  for ( int v : graph . get ( start ) ) {
    /* feasible */
    dfs ( v ) ;
  }
  /* feasible */
  int ans = postcodes . get ( start ) ;
  /* feasible */
  while ( visited . size ( ) < postcodes . size ( ) ) {
    int best = 100000000 ;
    int bestStack = 0 ;
    int bestNeighbor = 0 ;
    for ( int i = stack . length ;
    i > 0 ;
    i -- ) {
      if ( ! feasible ( graph , removed . toArray ( new Integer [ stack . length - i ] ) , start ) ) {
        continue ;
      }
      for ( int v : graph . get ( stack [ i - 1 ] ) ) {
        if ( ! visited . contains ( v ) && postcodes . get ( v ) < best ) {
          best = postcodes . get ( v ) ;
          bestStack = i ;
          bestNeighbor = v ;
        }
      }
    }
    /* feasible */
    removed . addAll ( Arrays . copyOfRange ( stack , bestStack , 0 , bestStack ) ) ;
    stack = Arrays . copyOfRange ( stack , 0 , bestStack ) ;
    stack . add ( bestNeighbor ) ;
    visited . add ( bestNeighbor ) ;
    ans = ans * 100000 + postcodes . get ( bestNeighbor ) ;
  }
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int no = 1 ;
  no <= T ;
  no ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    Map < Integer , Set < Integer >> postcodes = new HashMap < > ( ) ;
    graph . clear ( ) ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      postcodes . put ( i , Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      graph . get