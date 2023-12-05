private static void getEdge ( int n , int m ) {
  List < Edge > edge = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edge . add ( new Edge ( 0 , i + 1 , Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    edge . add ( new Edge ( i , i + 1 , Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( edge , new Comparator < Edge > ( ) {
    int [ ] parent = new int [ n + 1 ] ;
    int [ ] rank = new int [ n + 1 ] ;
    {
      int rootx ;
      int rooty ;
      int rankx ;
      int ranky ;
      int rootx ;
      int rankx ;
      int rooty ;
      int ranky ;
      for ( int x = 0 ;
      x < n ;
      x ++ ) {
        parent [ x ] = i ;
        rank [ x ] = i ;
      }
    }
  }
  ) ;
  /* if (parent[0] == parent[0]) {
  return;
  }*/
  /* union */
  int rootx ;
  int rankx ;
  int rooty ;
  int ranky ;
  rootx = parent [ 0 ] ;
  rankx = rank [ rootx ] ;
  ranky = rank [ rooty ] ;
  ranky = rank [ rooty ] ;
  if ( rankx > ranky ) {
    parent [ rooty ] = rootx ;
  }
  else {
    parent [ rootx ] = rooty ;
    rank [ rooty ] = Math . max ( rank [ rooty ] , rank [ rootx ] + 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n + m ;
  i ++ ) {
    Edge a = edge . get ( i ) ;
    Edge b = edge . get ( i ) ;
    Edge c = a . next ;
    if ( isGroup ( a , b ) ) {
      continue ;
    }
    else {
      ans += c ;
      union ( a , b ) ;
    }
  }
  System . out . println ( ans ) ;
}
