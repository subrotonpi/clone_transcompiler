public static int N = Integer . parseInt ( input ) {
  int [ ] T = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int P = 0 ;
  int X = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    P = Integer . parseInt ( input . nextLine ( ) ) ;
    X = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( Arrays . toString ( T ) - T [ P - 1 ] + X ) ;
  }
  return P ;
}
