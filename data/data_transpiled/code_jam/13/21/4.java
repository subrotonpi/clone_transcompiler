public static int T = Integer . parseInt ( input ) {
  for ( int test = 1 ;
  test <= T ;
  test ++ ) {
    int A = Integer . parseInt ( input . nextLine ( ) ) , N = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > V = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) V . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    if ( A == 1 ) {
      System . out . println ( "Case #" + test + ":" + N ) ;
      continue ;
    }
    int answer = N ;
    for ( int remove = 0 ;
    remove < N ;
    remove ++ ) {
      int oldA = A ;
      List < Integer > C = V . subList ( 0 , N - remove ) ;
      int add = 0 ;
      for ( int i = 0 ;
      i < C . size ( ) ;
      i ++ ) {
        int mote = C . get ( i ) ;
        if ( mote < A ) {
          A += mote ;
          continue ;
        }
        while ( mote >= A ) {
          A = A * 2 - 1 ;
          add ++ ;
        }
        A += mote ;
      }
      if ( remove + add < answer ) answer = remove + add ;
      A = oldA ;
    }
    System . out . println ( "Case #" + test + ":" + answer ) ;
  }
  return answer ;
}
