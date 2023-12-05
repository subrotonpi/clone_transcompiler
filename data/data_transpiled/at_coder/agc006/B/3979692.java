public static int [ ] getN ( int N , int x ) {
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  A [ N ] = 1 ;
  if ( x == 1 || x == 2 * N - 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
    if ( x > N ) {
      A [ x - N - 1 ] = A [ N - 1 ] ;
    }
    else {
      A [ x + N - 2 ] = A [ N - 1 ] ;
    }
  }
  System . out . println ( ( int [ ] ) A [ N ] ) ;
  return A ;
}
