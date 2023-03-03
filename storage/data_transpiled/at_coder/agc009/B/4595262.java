static final int [ ] getDepth ( ) {
  System . setIn ( 2 * 10 * 10 * 5 ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  if ( new HashSet < Integer > ( A ) . size ( ) == N - 1 ) {
    System . out . println ( N - 1 ) ;
    System . exit ( 0 ) ;
  }
  int [ ] H = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) {
    H [ i ] = new int [ N ] ;
  }
  return H ;
}
