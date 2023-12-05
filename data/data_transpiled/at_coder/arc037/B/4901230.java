@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int N = input . size ( ) ;
  int M = input . size ( ) ;
  HashMap < Integer , HashSet < Integer >> memo = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = input . get ( ) ;
    int v = input . get ( ) ;
    memo . computeIfAbsent ( u , k -> new HashSet < > ( ) ) . add ( v ) ;
    memo . computeIfAbsent ( v , k -> new HashSet < > ( ) ) . add ( u ) ;
  }
  Set < Integer > toVisit = new HashSet < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    toVisit . add ( i ) ;
  }
  Set < Integer > visited = new HashSet < > ( ) ;
  int answer = 0 ;
  while ( toVisit . size ( ) > 0 ) {
    int v = toVisit . remove ( ) ;
    visited . add ( v ) ;
    Queue < Integer > dq = new LinkedList < > ( ) ;
    dq . add ( new Integer ( v ) ) ;
    boolean isTree = true ;
    while ( dq . size ( ) > 0 ) {
      int v = dq . poll ( ) ;
      Integer frm = dq . poll ( ) ;
      for ( int u : memo . get ( v ) ) {
        if ( u == frm ) continue ;
        if ( visited . contains ( u ) ) {
          isTree = false ;
        }
        else {
          visited . add ( u ) ;
          toVisit . remove ( u ) ;
          dq . add ( new Integer ( u ) ) ;
        }
      }
    }
    if ( isTree ) {
      answer ++ ;
    }
  }
  System . out . println ( answer ) ;
}
