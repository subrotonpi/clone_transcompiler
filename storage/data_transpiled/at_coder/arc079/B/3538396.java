public static int [ ] getSmalls ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = 50 ;
  int [ ] a = new int [ 50 ] ;
  if ( K <= 50 ) {
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      a [ i ] = 50 ;
    }
  }
  else {
    int m = ( K - 1 ) / 50 ;
    int base = 100 + m ;
    int r = K % 50 ;
    int big = base - r ;
    int small = big - 50 - r ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      a [ i ] = big ;
    }
    for ( int i = r ;
    i < N ;
    i += 1 ) {
      a [ i ] = small ;
    }
  }
  return a ;
}
