public static int solve ( int N , int [ ] A ) {
  int [ ] counts = new int [ N ] ;
  for ( int i : xrange ( N ) ) {
    for ( int j : xrange ( i ) ) {
      counts [ i ] += A [ j ] > A [ i ] ? 1 : 0 ;
    }
  }
  List < Integer > indices = new ArrayList < Integer > ( ) ;
  for ( int i : xrange ( N ) ) {
    indices . add ( a [ 1 ] ) ;
  }
  return Integer . valueOf ( Math . min ( counts [ indices . get ( i ) ] , N - i - 1 - counts [ indices . get ( i ) ] ) ) ;
}
