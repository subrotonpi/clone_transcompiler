@ VisibleForTesting static int binarySearch ( int a , int b , int q ) {
  int [ ] S = new int [ a ] ;
  int [ ] T = new int [ b ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    S [ i ] = - inf ;
    T [ i ] = inf ;
  }
  return a + b + 1 ;
}
