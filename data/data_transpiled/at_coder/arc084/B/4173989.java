@ VisibleForTesting static LinkedHashMap < Integer , Integer > getCost ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] dp = new double [ K + 1 ] ;
  PriorityQueue < Integer > dq = new PriorityQueue < > ( 1 ) ;
  dq . add ( new Integer ( 1 ) ) ;
  popleft = dq . pop ( ) , append = dq . append ( ) , appendleft = dq . appendleft ( ) ;
  while ( dq . size ( ) > 0 ) {
    int v = popleft . poll ( ) ;
    int cost = dq . poll ( ) ;
    if ( v == 0 ) {
      System . out . println ( cost ) ;
      exit ( ) ;
    }
    if ( dp [ v ] < cost ) continue ;
    int plus_10 = ( v * 10 ) % K , plus_1 = ( v + 1 ) % K ;
    if ( dp [ plus_10 ] > cost ) {
      dp [ plus_10 ] = cost ;
      appendleft . add ( new Integer ( plus_10 ) ) ;
    }
    if ( dp [ plus_1 ] > cost + 1 ) {
      dp [ plus_1 ] = cost + 1 ;
      append . add ( new Integer ( plus_1 ) ) ;
    }
  }
  return dp ;
}
