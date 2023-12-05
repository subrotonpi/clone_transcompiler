static final int N = Integer . parseInt ( input ) {
  final int [ ] [ ] a = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  double sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sum += a [ i ] [ 0 ] * a [ i ] [ 1 ] ;
  }
  sum *= 1.05 ;
  return sum ;
}
