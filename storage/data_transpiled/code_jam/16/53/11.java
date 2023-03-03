@ input public static void input ( ) {
  /* do k */
  Map < Integer , Integer > parent = Maps . newHashMap ( ) ;
  Map < Integer , Integer > rank = Maps . newHashMap ( ) ;
  /* make a set of vertices */
  int N = Integer . parseInt ( readLine ( ) ) ;
  /* find q */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( readLine ( ) ) ;
    int b = Integer . parseInt ( readLine ( ) ) ;
    int c = Integer . parseInt ( readLine ( ) ) ;
    int x = Integer . parseInt ( readLine ( ) ) ;
    int y = Integer . parseInt ( readLine ( ) ) ;
    int z = Integer . parseInt ( readLine ( ) ) ;
    /* print "Case #" */
    if ( i == N ) {
      parent . put ( vertice , i ) ;
      /* print "Case #" */
    }
    else {
      parent . put ( vertice , i ) ;
      /* print "Case #" */
    }
  }
  /* union of vertices */
  int root1 = find ( vertice1 ) ;
  int root2 = find ( vertice2 ) ;
  if ( root1 != root2 ) {
    if ( rank . get ( root1 ) > rank . get ( root2 ) ) parent . put ( root2 , i ) ;
    else {
      parent . put ( root1 , i ) ;
      if ( rank . get ( root1 ) == rank . get ( root2 ) ) rank . get ( root2 ) ++ ;
    }
  }
  for ( Integer vertice : graph . getVertices ( ) ) {
    /* make a set of edges */
    int minimumSpanningTree = Sets . newHashSet ( ) ;
    List < Edge > edges = Lists . newArrayList ( graph . getEdges ( vertice1 ) ) ;
    edges . forEach ( edge -> {
      int weight = edge . weight ;
      int vertice1 = edge . weight ;
      int vertice2 = edge . weight ;
      if ( weight != weight ) {
        /* union of edges */
        vertice1 = weight ;
        vertice2 = weight ;
      }
      if ( weight != weight ) {
        /* union of edges */
        minimumSpanningTree . add ( edge ) ;
      }
    }
    /* print "Case #" */
  }
  /* do dfs */
  {
    Map < Integer ,