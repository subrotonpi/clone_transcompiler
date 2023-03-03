public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int M = inpl ( ) ;
  if ( M < N ) {
    N = M ;
    M = N ;
  }
  if ( N == 1 ) {
    if ( M == 1 ) {
      System . out . println ( 1 ) ;
    }
    else {
      System . out . println ( M - 2 ) ;
    }
  }
  else if ( N == 2 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( ( N - 2 ) * ( M - 2 ) ) ;
  }
  return new int [ ] {
    Integer . parseInt ( input . readLine ( ) ) }
    ;
  }
  