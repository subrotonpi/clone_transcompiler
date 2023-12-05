public static int [ ] [ ] getThreads ( ) {
  int N = ( int ) input . nextInt ( ) ;
  int M = ( int ) input . nextInt ( ) ;
  int [ ] a = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int inputa = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = inputa ;
  }
  int [ ] [ ] thread = new int [ N ] [ M ] ;
  Set < Integer > appeared = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    if ( ! appeared . contains ( a [ M - 1 - i ] ) ) {
      thread [ i ] = a [ M - 1 - i ] ;
      appeared . add ( a [ M - 1 - i ] ) ;
    }
    else {
      continue ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( ! appeared . contains ( i ) ) {
      thread [ i ] = i ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( thread [ i ] ) ;
  }
  return thread ;
}
