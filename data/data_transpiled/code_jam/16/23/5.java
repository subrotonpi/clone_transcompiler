static final int tn = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int ti : xrange ( tn ) ) {
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  Map < Integer , List < Integer >> match = new HashMap < > ( ) ;
  Map < Integer , List < Integer >> edges = new HashMap < > ( ) ;
  Set < Integer > bside = new HashSet < > ( ) ;
  for ( int i : xrange ( n ) ) {
    int a = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int b = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    bside . add ( b ) ;
    if ( ! edges . containsKey ( a ) ) edges . put ( a , new ArrayList < > ( ) ) ;
    edges . get ( a ) . add ( b ) ;
  }
  /*for (int i = 0; i < edges.get(a).size(); i++) {
  int b = edges.get(a).get(i);
  if (!was.contains(b)) {
  was.add(b);
  if (!match.containsKey(b) || dfs(match.get(b))) {
  match.put(b, a);
  return true;
  }
  }
  }*/
  int m = 0 ;
  for ( int i = 0 ;
  i < edges . size ( ) ;
  i ++ ) {
    int a = Integer . parseInt ( edges . get ( i ) . get ( i ) ) ;
    Set < Integer > was = new HashSet < > ( ) ;
    m += was . size ( ) ;
    m += edges . get ( i ) . size ( ) ;
  }
  int mc = edges . size ( ) + bside . size ( ) - m ;
  int ret = n - mc ;
  System . out . println ( "Case #" + ( ti + 1 ) + ": " + ( n - mc ) ) ;
  return ret ;
}
