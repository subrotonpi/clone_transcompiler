@ Sys public static int [ ] readLines ( ) {
  /* line numbers */
  int N = 1000 ;
  /* good */
  int [ ] A = new int [ N ] ;
  for ( int k : xrange ( N ) ) {
    int p = nextInt ( k , N - 1 ) ;
    A [ k ] = A [ p ] ;
  }
  /* bad */
  int [ ] A = new int [ N ] ;
  for ( int k : xrange ( N ) ) {
    int p = nextInt ( N - 1 ) ;
    A [ k ] = A [ p ] ;
  }
  /* bad */
  int T = nextInt ( N ) ;
  for ( int j : xrange ( 1 , T + 1 ) ) {
    N = nextInt ( N ) ;
    int [ ] A = line ( ) ;
    double rate = 0 ;
    for ( int i = A . length - 1 ;
    i >= 0 ;
    i -- ) {
      int a = A [ i ] ;
      if ( a <= i ) a += i ;
      rate += ( a - i ) * 0.25 ;
    }
    rate /= 1e4 ;
    boolean y = rate > 0.396 ;
    System . out . println ( "Case #" + j + ": " + ( y ? "GOOD" : "BAD" ) ) ;
  }
  return A ;
}
