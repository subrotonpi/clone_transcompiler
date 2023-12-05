@ SuppressWarnings ( "unchecked" ) public static < T extends Comparable < T >> Edge < T > [ ] createEdge ( T dst , int len ) {
  class Edge {
    int [ ] dst , len ;
    int MAX_K = ( int ) ( 1e5 + 5 ) ;
    int INF = ( int ) ( 1e9 ) ;
    int K = 0 ;
    int [ ] dis = new int [ MAX_K ] ;
    boolean [ ] vis = new boolean [ MAX_K ] ;
    Edge < T > [ ] edge = new Edge [ MAX_K ] ;
    PriorityQueue < Edge < T >> q = new PriorityQueue < Edge < T >> ( ) ;
    /* Add a new edge to the queue */
    for ( int i = 0 ;
    i <= MAX_K ;
    i ++ ) {
      dis [ i ] = INF ;
    }
    for ( int i = 0 ;
    i <= MAX_K ;
    i ++ ) {
      vis [ i ] = false ;
    }
    edge [ 0 ] = new Edge < T > [ K ] ;
    for ( int i = 0 ;
    i <= MAX_K ;
    i ++ ) {
      edge [ i ] = new Edge < T > ( ) ;
    }
  }
  /* build a new edge to the queue */
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    add ( i , i * 10 % K , 0 ) ;
    add ( i , ( i + 1 ) % K , 1 ) ;
  }
  /* dij */
  dis [ s ] = 0 ;
  q . add ( new Edge < T > ( 0 , s ) ) ;
  while ( ! q . isEmpty ( ) ) {
    int x = q . poll ( ) . getValue ( ) ;
    if ( vis [ x ] ) continue ;
    vis [ x ] = true ;
    for ( Edge < T > e : edge [ x ] ) {
      if ( dis [ e . dst ] > dis [ x ] + e . len ) {
        dis [ e . dst ] = dis [ x ] + e . len ;
        q . add ( new Edge < T > ( dis [ e . dst ] , e . dst ) ) ;
      }
    }
  }
  if ( className == "java" ) {
    K = Integer . parseInt ( input ( ) ) ;
    build ( ) ;
    /* dij (1) */
    System . out . println ( dis [ 0 ] + 1 ) ;
  }
  return edge ;
}
