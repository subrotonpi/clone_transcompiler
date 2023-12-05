static final int T = Integer . parseInt ( readLine ( ) ) ;
for ( int i : xrange ( T ) ) {
  System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  String [ ] codes = new String [ N ] ;
  Arrays . fill ( codes , "" ) ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) codes [ j ] = "" ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) codes [ j ] = readLine ( ) . trim ( ) ;
  HashMap < Integer , HashSet < Integer >> edges = new HashMap < Integer , HashSet < Integer >> ( ) ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    int u = Integer . parseInt ( readLine ( ) ) ;
    int v = Integer . parseInt ( readLine ( ) ) ;
    if ( u < v ) edges . put ( u , new HashSet < Integer > ( ) ) ;
    if ( v < v ) edges . put ( v , new HashSet < Integer > ( ) ) ;
    edges . get ( u ) . add ( v ) ;
    edges . get ( v ) . add ( u ) ;
  }
  Integer best = null ;
  HashMap < Integer , Integer > usedE = new HashMap < Integer , Integer > ( ) ;
  HashMap < Integer , Integer > usedV = new HashMap < Integer , Integer > ( ) ;
  /* make a dependency for the first one */
  if ( u < v ) {
    /* if (u < v) return */
    if ( usedV . size ( ) == N ) {
      boolean flag = true ;
      for ( int e : usedE . keySet ( ) ) {
        if ( usedE . get ( e ) == 1 ) {
          flag = false ;
          break ;
        }
      }
      if ( flag && ( best == null || best . compareTo ( best ) < 0 ) ) best = status ;
    }
  }
  if ( edges . containsKey ( u ) ) {
    for ( int v : edges . get ( u ) ) {
      int e = makeE ( u , v ) ;
      if ( usedE . containsKey ( e ) && usedE . get ( e ) == 1 ) {
        usedE . put ( e , 2 ) ;
        dfs ( dep + 1 , v , status ) ;
        usedE .