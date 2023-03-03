@ VisibleForTesting static void input ( ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] m = new String [ H ] ;
  int [ ] [ ] v = new int [ W ] [ W ] ;
  int f = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    if ( f > 0 ) break ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( m [ i ] [ j ] . equals ( "S" ) ) {
        x = i ;
        y = j ;
        f = 1 ;
        break ;
      }
    }
  }
  Queue < Integer > dq = new ArrayDeque < > ( ) ;
  dq . add ( new Integer [ ] {
    x , y , 0 }
    ) ;
    v [ x ] [ y ] = 1 ;
    int ans = ( min ( x , y , H - 1 - x , W - 1 - y ) + K - 1 ) / K ;
    while ( dq . size ( ) > 0 ) {
      int x = dq . poll ( ) ;
      int y = dq . poll ( ) ;
      int c = dq . poll ( ) ;
      ans = Math . min ( ans , ( min ( x , y , H - 1 - x , W - 1 - y ) + K - 1 ) / K ) ;
      if ( c < K ) {
        c ++ ;
        if ( x > 0 && m [ x - 1 ] [ y ] . equals ( "." ) && ! v [ x - 1 ] [ y ] ) {
          dq . add ( new Integer [ ] {
            x - 1 , y , c }
            ) ;
            v [ x - 1 ] [ y ] = 1 ;
          }
          if ( x < H - 1 && m [ x + 1 ] [ y ] . equals ( "." ) && ! v [ x ] [ y - 1 ] ) {
            dq . add ( new Integer [ ] {
              x , y - 1 , c }
              ) ;
              v [ x ] [ y - 1 ] = 1 ;
            }
            if ( y < W - 1 && m [ x ] [ y + 1 ] . equals ( "." ) && ! v [ x ] [ y + 1 ] ) {
              dq . add ( new Integer [ ] {
                x , y + 1 , c }
                )