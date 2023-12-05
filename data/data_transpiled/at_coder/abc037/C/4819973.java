public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    a [ i ] = i ;
  }
  int ex = 0 ;
  for ( int i = 0 ;
  i < N - K ;
  i ++ ) {
    ex += ( a [ i ] + a [ N - 1 - i ] ) * ( N - K ) ;
  }
  return ex ;
}
