static final int [ ] [ ] resize ( int N , int K ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = i ;
  HeapSort . sort ( X ) ;
  return X ;
}
