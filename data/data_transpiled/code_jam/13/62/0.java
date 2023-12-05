public static int T = Integer . parseInt ( Scanner in ) {
  for ( int caseID = 1 ;
  caseID <= T ;
  caseID ++ ) {
    int n = in . nextInt ( ) ;
    int [ ] aa = map . get ( in . nextInt ( ) ) ;
    double answer = 1e9 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) {
        double a = ( double ) ( aa [ j ] - aa [ i ] ) / ( double ) ( j - i ) ;
        int l = 0 ;
        double r = 1e9 ;
        for ( int iter = 0 ;
        iter < 70 ;
        iter ++ ) {
          double m = ( l + r ) / 2.0 ;
          double bmin = - 1e9 , bmax = 1e9 ;
          for ( int k = 0 ;
          k < n ;
          k ++ ) {
            bmin = Math . max ( bmin , aa [ k ] - m - a * k ) ;
            bmax = Math . min ( bmax , aa [ k ] + m - a * k ) ;
          }
          if ( bmin <= bmax ) {
            r = m ;
          }
          else {
            l = m ;
          }
        }
        answer = Math . min ( answer , l ) ;
      }
    }
    System . out . println ( "Case #" + caseID + ": " + answer ) ;
  }
  return answer ;
}
