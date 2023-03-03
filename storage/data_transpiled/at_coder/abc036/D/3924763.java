static final int [ ] [ ] getEdges ( ) {
  System . setIn ( 10 * 6 ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] edges = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < N ;
  ++ a ) {
    int b = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    edges [ a - 1 ] [ b ] = b - 1 ;
    edges [ b - 1 ] [ a ] = a - 1 ;
  }
  int mod = 10 * 9 + 7 ;
  int [ ] [ ] dp = new int [ N ] [ N ] ;
  for ( int from = 0 ;
  from < N ;
  ++ from ) {
    dp [ from ] [ 0 ] = 1 ;
    for ( int to : edges [ from ] ) {
      if ( to != from ) {
        dp [ from ] [ 0 ] = ( dp [ from ] [ 0 ] * ( dfw ( from , to ) + dfb ( to , to ) ) ) % mod ;
      }
    }
  }
  System . out . println ( ( dfw ( - 1 , 0 ) + dfb ( - 1 , 0 ) ) % mod ) ;
  return dp ;
}
