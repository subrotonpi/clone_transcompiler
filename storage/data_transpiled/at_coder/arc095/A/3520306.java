static final int [ ] binarySearch ( int N ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( X ) ;
  Arrays . sort ( X ) ;
  Arrays . sort ( X2 ) ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int idx = Arrays . binarySearch ( X , i ) ;
    if ( idx < N / 2 ) System . out . println ( X2 [ N / 2 ] ) ;
    else System . out . println ( X2 [ N / 2 - 1 ] ) ;
  }
  return X ;
}
