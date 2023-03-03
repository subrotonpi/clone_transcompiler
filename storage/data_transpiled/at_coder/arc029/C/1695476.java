static final PriorityQueue < Integer > heapSort ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] es = new int [ N ] ;
  HeapSort . sort ( es ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    HeapSort . sort ( es , new HeapSort . Comparator ( c , 0 , i + 1 ) ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    HeapSort . sort ( es , new HeapSort . Comparator ( r , a , b ) ) ;
  }
  int [ ] parent = new int [ N + 1 ] ;
  int [ ] rank = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    parent [ i ] = i ;
  }
  /* root */
  if ( parent [ N ] == parent [ N ] ) return parent [ N ] ;
  else {
    parent [ N ] = parent [ N ] ;
  }
  /* root */
  boolean isSameTree ( parent [ N ] , parent [ N ] ) ;
  /* unite */
  int ra = parent [ N ] ;
  int rb = parent [ N ] ;
  if ( ra == rb ) return parent [ N ] ;
  /* unite */
  ans = 0 ;
  e ++ ;
  while ( e < N ) {
    int cost = heapSort . size ( es ) ;
    a = heapSort . get ( es ) ;
    b = heapSort . get ( es ) ;
    if ( isSameTree ( a , b ) ) continue ;
    /* unite */
    unite ( a , b ) ;
    ans += cost ;
    e ++ ;
  }
  System . out . println ( ans ) ;
  return new ArrayList < > ( ) ;
}
