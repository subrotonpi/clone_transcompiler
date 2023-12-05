static final double [ ] getDoubleArray ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final double [ ] result = new double [ N ] ;
  int ans = 0 ;
  while ( ( i < N ) && ( result [ i ] > ( N - 1 ) ) ) {
    final double diff = Math . ceil ( ( result [ i ] - ( N - 1 ) ) / N ) ;
    result [ i ] -= N * diff ;
    result [ 0 ] += 1 * diff ;
    result [ i + 1 ] += 1 * diff ;
    ans += diff ;
  }
  return result ;
}
