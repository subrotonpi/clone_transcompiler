public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  Map < Integer , List < Integer >> dict = new HashMap < > ( ) ;
  for ( int m = 0 ;
  m < M ;
  m ++ ) {
    int a = input . nextInt ( ) , b = input . nextInt ( ) ;
    if ( dict . containsKey ( a ) ) dict . get ( a ) . add ( b ) ;
    else dict . put ( a , new ArrayList < > ( ) ) ;
    if ( dict . containsKey ( b ) ) dict . get ( b ) . add ( a ) ;
    else dict . put ( b , new ArrayList < > ( ) ) ;
  }
  int ans = 0 ;
  int [ ] l = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    l [ i ] = 0 ;
  }
  l [ 1 ] = 1 ;
  /* dfs */
  if ( sum ( l ) == N ) {
    ans ++ ;
    return ( 0 ) ;
  }
  for ( int i : dict . get ( now ) ) {
    if ( l [ i ] == 0 ) {
      l [ i ] ++ ;
      now = i ;
      dfs ( l , now ) ;
      l [ i ] -- ;
    }
    else continue ;
  }
  return ans ;
}
