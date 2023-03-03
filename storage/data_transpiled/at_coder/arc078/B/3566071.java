@ Function public static LinkedHashMap < Integer , Integer > inpl ( ) {
  return new LinkedHashMap < Integer , Integer > ( ) {
    {
      for ( int i = 0 ;
      i < input . length ( ) ;
      i ++ ) {
        Integer a = input . get ( i ) ;
        Integer b = input . get ( i ) ;
        path . put ( a , b ) ;
        path . get ( b ) . add ( a ) ;
      }
    }
  }
  ;
  int N = Integer . parseInt ( input . get ( ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    Integer a = inpl ( ) ;
    Integer b = inpl ( ) ;
    path . get ( a ) . add ( b ) ;
    path . get ( b ) . add ( a ) ;
  }
  Float inf = Float . POSITIVE_INFINITY ;
  int ctr = 1 ;
  Set < Integer > now = new THashSet < Integer > ( 1 ) ;
  List < Float > distF = new ArrayList < Float > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    distF . add ( inf ) ;
    distF . add ( 1 ) ;
  }
  do {
    for ( int na = now . size ( ) ;
    na >= 0 ;
    na -- ) {
      Integer na = now . remove ( na ) ;
      for ( int nb : path . get ( na ) ) {
        if ( distF . get ( nb ) > distF . get ( na ) + 1 ) {
          distF . set ( nb , distF . get ( na ) + 1 ) ;
          now . add ( nb ) ;
          ctr ++ ;
        }
      }
    }
    if ( ctr >= N ) break ;
  }
  while ( ctr < N ) ;
  ctr = 1 ;
  now = new THashSet < Integer > ( N ) ;
  List < Float > distS = new ArrayList < Float > ( ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    distS . add ( inf ) ;
    distS . add ( inf ) ;
  }
  distS . add ( N ) ;
  while ( true ) {
    for ( int na = now . size ( ) ;
    na >= 0 ;
    na -- ) {
      Integer nb = now . remove ( na ) ;
      if ( distS . get ( nb ) > distS . get ( na ) + 1 ) {
        distS . set ( nb , distS . get ( na ) + 1 ) ;
        now . add ( nb ) ;
        ctr ++ ;
        