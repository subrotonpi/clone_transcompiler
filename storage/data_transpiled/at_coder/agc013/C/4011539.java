static final int [ ] getWordCount ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X0 = new int [ N ] ;
  int [ ] W = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  ++ i ) {
    X0 [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    W [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] X = X0 . clone ( ) ;
  X [ 0 ] = T * ( 3 - 2 * W ) ;
  int count = Integer . parseInt ( X [ 0 ] / L ) ;
  count %= N ;
  X [ 1 ] %= L ;
  Arrays . sort ( X ) ;
  for ( int i = count ;
  i < X . length ;
  ++ i ) {
    System . out . println ( X [ i ] ) ;
  }
  for ( int i = 0 ;
  i < X . length ;
  ++ i ) {
    System . out . println ( X [ i ] ) ;
  }
  return X ;
}
