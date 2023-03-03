public static int [ ] readIntArrayInRange ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( X ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
  }
  else {
    int [ ] tmp = new int [ M - 1 ] ;
    for ( int i = 0 ;
    i < M - 1 ;
    i ++ ) {
      tmp [ i ] = X [ i + 1 ] - X [ i ] ;
    }
    Arrays . sort ( tmp , Collections . reverseOrder ( ) ) ;
    int interval = 0 ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      if ( i + 1 == M - 1 ) {
        break ;
      }
      interval += tmp [ i ] ;
    }
    System . out . println ( Arrays . toString ( tmp ) - interval ) ;
  }
  return X ;
}
