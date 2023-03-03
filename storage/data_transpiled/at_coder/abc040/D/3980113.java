public static void UnionFind ( ) {
  int [ ] parent = new int [ Q + 1 ] ;
  int [ ] size = new int [ Q + 1 ] ;
  int [ ] rank = new int [ Q + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  UnionFind ( ) ;
  int x = 0 ;
  int y = 0 ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    System . out . println ( ans [ i ] ) ;
  }
  UnionFind ( ) ;
  int x = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x = parent [ i ] ;
    y = parent [ i ] ;
    if ( x == y ) return ;
    if ( rank [ x ] < rank [ y ] ) {
      parent [ x ] = y ;
      size [ y ] += size [ x ] ;
    }
    else {
      parent [ y ] = x ;
      size [ x ] += size [ y ] ;
      if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
    }
  }
  /* Check that same value is equal to the first element */
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > road = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > rAppend = road . toArray ( new Integer [ 0 ] ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    rAppend . add ( new Integer ( input . readLine ( ) ) ) ;
  }
  int Q = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > query = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > qAppend = query . toArray ( new Integer [ 0 ] ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int v = Integer . parseInt ( input . readLine ( ) ) ;
    int w = Integer . parseInt ( input . readLine ( ) ) ;
    qAppend . add ( new Integer ( i ) ) ;
  }
  road = new ArrayList < Integer > ( ) ;
  query = new ArrayList < Integer > ( ) ;
  unionFind = new UnionFind ( N ) ;
  ans = new HashMap < Integer , Integer > ( ) ;
  int a = road . get ( 0 ) ;
  int b = road . get