static final int [ ] [ ] getAdjacentIndices ( int n ) {
  System . setIn ( new InputReader ( ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  L = new int [ N + 1 ] [ ] ;
  L [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  adj = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    adj [ a ] [ b ] = b ;
  }
  return adj ;
}
