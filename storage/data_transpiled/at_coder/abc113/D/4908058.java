@ VisibleForTesting static int [ ] [ ] [ ] matrix ( ) {
  int H = Integer . parseInt ( input ( ) ) ;
  int W = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int mod = ( int ) ( 1e9 + 7 ) ;
  int [ ] [ ] [ ] memo = new int [ H + 1 ] [ W ] [ W ] ;
  memo [ 0 ] [ 0 ] = 1 ;
  @ SuppressWarnings ( "unchecked" ) {
    int [ ] [ ] oneRowAMida = new int [ W ] [ W ] ;
    for ( int i = 0 ;
    i < W ;
    i ++ ) {
      oneRowAMida [ i ] = new int [ W ] ;
      for ( int p : Arrays . asList ( 0 , 1 , W - 1 ) ) {
        if ( ArrayUtils . contains ( p , i ) && p [ i + 1 ] == 1 ) {
          continue ;
        }
        int [ ] after = new int [ W ] ;
        for ( int i = 0 ;
        i < W - 1 ;
        i ++ ) {
          after [ i ] = i ;
        }
        for ( int i = 0 ;
        i < W - 1 ;
        i ++ ) {
          if ( p [ i ] ) {
            after [ i ] = after [ i + 1 ] ;
          }
        }
        for ( int i = 0 ;
        i < W ;
        i ++ ) {
          int a = after [ i ] ;
          oneRowAMida [ i ] [ a ] ++ ;
        }
      }
    }
    return oneRowAMida ;
  }
}
