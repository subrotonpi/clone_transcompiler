static final int [ ] [ ] resize ( int N , int K ) {
  int [ ] [ ] inputs = new int [ N ] [ ] ;
  for ( int index = 0 ;
  index < N ;
  index ++ ) inputs [ index ] [ 0 ] = index ;
  return inputs ;
}
