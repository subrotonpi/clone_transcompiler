public static int tn = Integer . parseInt ( Scanner in ) {
  int tn = in . nextInt ( ) ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] == 1 ) {
      k -- ;
      if ( k == 0 ) {
        break ;
      }
    }
    else {
      cnt += k ;
    }
  }
  for ( int loop = xrange ( tn ) ;
  loop < tn ;
  loop ++ ) {
    System . out . println ( "Case #" + ( loop + 1 ) + ":" ) ;
    int N = in . nextInt ( ) ;
    int K = in . nextInt ( ) ;
    int B = in . nextInt ( ) ;
    int T = in . nextInt ( ) ;
    int X [ ] = in . nextInt ( ) ;
    int V [ ] = in . nextInt ( ) ;
    int C [ ] = new int [ N ] ;
    cnt = 0 ;
    for ( int i : xrange ( N ) ) {
      if ( X [ i ] + V [ i ] * T >= B ) {
        cnt ++ ;
        C [ i ] = 1 ;
      }
      else {
        C [ i ] = 0 ;
      }
    }
    if ( cnt >= K ) {
      System . out . println ( solve ( C , K ) ) ;
    }
    else {
      System . out . println ( "IMPOSSIBLE" ) ;
    }
  }
  return cnt ;
}
