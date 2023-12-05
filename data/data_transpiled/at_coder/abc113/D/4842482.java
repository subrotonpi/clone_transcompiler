@ VisibleForTesting static int [ ] [ ] combinations ( ) {
  final int mod = 1000000007 ;
  final int H = Integer . parseInt ( input . nextLine ( ) ) ;
  final int W = Integer . parseInt ( input . nextLine ( ) ) ;
  final int K = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] dp = new int [ H + 1 ] [ W + 1 ] ;
  dp [ 0 ] = new int [ W + 1 ] ;
  for ( int h = 1 ;
  h <= H ;
  h ++ ) {
    dp [ h ] [ h ] = new int [ W ] ;
    for ( int i = 0 ;
    i <= W ;
    i ++ ) {
      int [ ] pattern = new int [ ] {
        i }
        ;
        c = ( p == 1 ) ? 1 : 0 ;
        if ( c >= 2 ) break ;
        if ( c >= 2 ) continue ;
        for ( int i = 0 ;
        i <= W ;
        i ++ ) {
          dp [ h ] [ i ] = ( dp [ h ] [ i ] + dp [ h - 1 ] [ i + 1 ] ) % mod ;
        }
      }
    }
    return dp [ H ] [ K - 1 ] ;
  }
  