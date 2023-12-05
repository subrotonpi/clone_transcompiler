public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  int C = inpl ( ) ;
  int D = inpl ( ) ;
  for ( int k = 0 ;
  k < N + 1 ;
  k ++ ) {
    int j = N - 1 - k ;
    if ( D * k - C * j >= B - A >= C * k - D * j ) {
      System . out . println ( "YES" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return new int [ ] {
    Integer . parseInt ( input . readLine ( ) ) }
    ;
  }
  