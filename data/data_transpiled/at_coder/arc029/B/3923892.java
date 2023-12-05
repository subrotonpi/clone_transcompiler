@ Nullable public static String print ( @ NotNull double [ ] input ) {
  double A = Double . parseDouble ( input [ 0 ] ) ;
  double B = Double . parseDouble ( input [ 1 ] ) ;
  if ( A > B ) {
    A = B ;
    B = A ;
  }
  int N = Integer . parseInt ( input [ 2 ] ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double C = Double . parseDouble ( input [ 3 ] ) ;
    double D = Double . parseDouble ( input [ 4 ] ) ;
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
      for ( ;
      ;
      ) {
        double m = ( ok + ng ) / 2 ;
        double w = B * cos ( m ) + A * sin ( m ) ;
        double h = B * sin ( m ) + A * cos ( m ) ;
        if ( Math . abs ( h - D ) < 1e-3 ) break ;
        if ( h < D ) {
          ok = m ;
        }
        else {
          ng = m ;
        }
      }
      print ( new String [ ] {
        "NO" , "YES" }
        [ w <= C ] ) ;
      }
    }
    return null ;
  }
  