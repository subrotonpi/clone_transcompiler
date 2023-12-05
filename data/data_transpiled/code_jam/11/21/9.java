public static double [ ] [ ] computeRPIs ( int n , char [ ] [ ] matrix ) {
  int [ ] wins = new int [ n ] ;
  int [ ] losses = new int [ n ] ;
  int [ ] opponents = new int [ n ] ;
  double [ ] wps = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int win = 0 ;
    int lose = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j == i ) continue ;
      if ( matrix [ i ] [ j ] == '1' ) win ++ ;
      else if ( matrix [ i ] [ j ] == '0' ) lose ++ ;
    }
    wins [ i ] = win ;
    losses [ i ] = lose ;
    opponents [ i ] = win + lose ;
    wps [ i ] = 1.0 * win / ( win + lose ) ;
  }
  double [ ] owps = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double sum = 0.0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( matrix [ i ] [ j ] == '.' ) continue ;
      if ( matrix [ i ] [ j ] == '1' ) {
        double adj_wp = 1.0 * wins [ j ] / ( opponents [ j ] - 1 ) ;
        if ( adj_wp > 0 ) adj_wp = 1.0 * wins [ j ] / ( opponents [ j ] - 1 ) ;
        else adj_wp = 1.0 * ( wins [ j ] - 1 ) / ( opponents [ j ] - 1 ) ;
        sum += adj_wp ;
      }
      owps [ i ] = sum / opponents [ i ] ;
    }
    double [ ] oowps = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      double sum = 0.0 ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( matrix [ i ] [ j ] == '.' ) continue ;
        sum += owps [ j ] ;
      }
      oowps [ j ] = sum / opponents [ i ] ;
    }
    double [ ] [ ] rpis = new double [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double rpi = 0.25 * wps [ i ] + 0.5 * owps [ i ] + 0.25 * oowps [ i ] ;
      rp @ @