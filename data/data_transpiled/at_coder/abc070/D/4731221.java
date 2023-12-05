@ Nullable private static Map < Integer , Integer > solve ( ) {
  @ SuppressWarnings ( "resource" ) Map < Integer , Set < Integer >> branch = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    branch . put ( a , new HashSet < > ( ) ) ;
    branch . put ( b , new HashSet < > ( ) ) ;
    branch . put ( a , new HashSet < > ( ) ) ;
    branch . put ( b , new HashSet < > ( ) ) ;
    branch . put ( a , new HashSet < > ( ) ) ;
  }
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] dist = new double [ N + 1 ] ;
  dist [ K ] = Double . MAX_VALUE ;
  Deque < Integer > check = new ArrayDeque < > ( ) ;
  check . add ( K ) ;
  while ( check . size ( ) > 0 ) {
    int now = check . poll ( ) ;
    for ( int i = 0 ;
    i < branch . size ( ) ;
    i ++ ) {
      int nex = branch . get ( now ) ;
      int c = branch . get ( i ) ;
      if ( dist [ nex ] > dist [ now ] + c ) {
        dist [ nex ] = dist [ now ] + c ;
        check . add ( nex ) ;
      }
    }
  }
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( dist [ x ] + dist [ y ] ) ;
  }
  return branch ;
}
