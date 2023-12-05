static final void dfs ( int i ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  System . setSecurityManager ( new RMISecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > [ ] adj = new ArrayList [ n ] ;
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    int u = Integer . parseInt ( input . readLine ( ) ) ;
    int v = Integer . parseInt ( input . readLine ( ) ) ;
    adj [ u - 1 ] . add ( v - 1 ) ;
    adj [ v - 1 ] . add ( u - 1 ) ;
  }
  boolean loop = visited . contains ( now ) ;
  visited . add ( now ) ;
  while ( adj [ now ] . size ( ) > 0 ) {
    int nxt = adj [ now ] . remove ( ) ;
    adj [ nxt ] . remove ( now ) ;
    loop = dfs ( nxt , visited ) || loop ;
  }
  Set < Integer > visitedAll = new HashSet < Integer > ( ) ;
  int count = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    if ( visitedAll . contains ( j ) ) continue ;
    Set < Integer > visited = new HashSet < Integer > ( ) ;
    if ( ! dfs ( j , visited ) ) count ++ ;
    visitedAll . addAll ( visited ) ;
  }
  System . out . println ( count ) ;
}
