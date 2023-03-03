public static int [ ] getN ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = 0 ;
    W [ i ] = 0 ;
  }
  int D = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    W [ i ] = - 2 * W [ i ] + 3 ;
    D += ( X [ i ] + T * W [ i ] ) / L ;
  }
  D %= N ;
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y [ i ] = ( ( T * W [ i ] ) + X [ i ] ) % L ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( Y [ ( D + i ) % N ] ) ;
  }
  return Y ;
}
