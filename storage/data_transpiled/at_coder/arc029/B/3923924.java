@ Nullable public static String print ( @ NotNull double [ ] input ) {
  int A = Integer . parseInt ( input [ 0 ] ) ;
  int B = Integer . parseInt ( input [ 1 ] ) ;
  if ( A > B ) {
    A = B ;
    B = A ;
  }
  int N = Integer . parseInt ( input [ 2 ] ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int C = Integer . parseInt ( input [ 3 ] ) ;
    int D = Integer . parseInt ( input [ 4 ] ) ;
    if ( C > D ) {
      C = D ;
      D = C ;
    }
    if ( A <= C && B <= D ) {
      print ( "YES" ) ;
    }
    else if ( A >= C && B >= D ) {
      print ( "NO" ) ;
    }
    else {
      double ok = 0 ;
      double ng = atan2 ( B , A ) + 1e-2 ;
      while ( ng - ok > 1e-9 ) {
        double m = ( ok + ng ) / 2 ;
        double h = B * sin ( m ) + A * cos ( m ) ;
        if ( h < D ) {
          ok = m ;
        }
        else {
          ng = m ;
        }
      }
      double w = B * cos ( ok ) + A * sin ( ok ) ;
      print ( new String [ ] {
        "NO" , "YES" }
        [ w <= C ] ) ;
      }
    }
    return null ;
  }
  