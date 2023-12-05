public static void bfs ( int n , int m ) {
  HashMap < Integer , ArrayList < Integer >> g = new HashMap < > ( ) ;
  HashMap < Integer , Boolean > used = new HashMap < > ( 11 ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    used . put ( i , new Boolean ( false ) ) ;
  }
  int [ ] color = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int u = Integer . parseInt ( input . readLine ( ) ) ;
    int v = Integer . parseInt ( input . readLine ( ) ) ;
    u -- ;
    v -- ;
    if ( ! g . containsKey ( u ) ) g . put ( u , new ArrayList < > ( ) ) ;
    if ( ! g . containsKey ( v ) ) g . put ( v , new ArrayList < > ( ) ) ;
    g . get ( u ) . add ( v ) ;
    g . get ( v ) . add ( u ) ;
  }
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > [ ] Q = new ArrayList [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int node = Integer . parseInt ( input . readLine ( ) ) ;
    int dis = Integer . parseInt ( input . readLine ( ) ) ;
    int col = Integer . parseInt ( input . readLine ( ) ) ;
    Q [ i ] = new ArrayList < > ( node - 1 ) ;
    Q [ i ] . add ( dis ) ;
    Q [ i ] . add ( col ) ;
  }
  Q = Q . toArray ( new Integer [ Q . size ( ) ] ) ;
  /* bfs(now,dist,col); */
  if ( dist < 0 ) return ;
  if ( used . get ( now ) . booleanValue ( ) ) return ;
  used . get ( now ) . booleanValue ( ) ;
  if ( color [ now ] == null ) color [ now ] = col ;
  if ( g . containsKey ( now ) ) {
    for ( int x : g . get ( now ) ) bfs ( x , dist - 1 , col ) ;
  }
  for ( int x : Q ) bfs ( x , dist , col ) ;
  for ( int x : color ) System . out . println ( x ) ;
}
