@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] XY = new int [ N ] [ ] ;
  int [ ] X = new int [ N ] , Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    X [ i ] = x ;
    Y [ i ] = y ;
    XY [ i ] = new int [ N ] ;
  }
  Arrays . sort ( X ) ;
  Arrays . sort ( Y ) ;
  Arrays . sort ( XY ) ;
  int ans = 10 * 19 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int l = X [ i ] ;
    int r = Y [ i ] ;
    int t = Y [ i ] ;
    if ( l > r ) {
      continue ;
    }
    int cnt = - K ;
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      int y = XY [ x ] [ i ] ;
      if ( y < t ) {
        continue ;
      }
      if ( l <= x && x <= r ) {
        cnt ++ ;
        if ( cnt >= 0 ) {
          int area = ( r - l ) * ( y - t ) ;
          if ( area < ans ) {
            ans = area ;
          }
          break ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return XY ;
}
