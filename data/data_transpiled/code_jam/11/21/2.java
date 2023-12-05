static void foo ( Scanner iScanner ) {
  int n = Integer . parseInt ( iScanner . nextLine ( ) ) ;
  String [ ] a = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = iScanner . nextLine ( ) . trim ( ) ;
  double [ ] [ ] b = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double t1 = 0.0 ;
    double t2 = 0.0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( a [ i ] [ j ] . equals ( "0" ) ) t2 ++ ;
      else if ( a [ i ] [ j ] . equals ( "1" ) ) {
        t1 ++ ;
        t2 ++ ;
      }
    }
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( a [ i ] [ j ] . equals ( "0" ) ) b [ i ] [ j ] = t1 / ( t2 - 1 ) ;
      else if ( a [ i ] [ j ] . equals ( "1" ) ) b [ i ] [ j ] = ( t1 - 1 ) / ( t2 - 1 ) ;
      else b [ i ] [ j ] = t1 / t2 ;
    }
  }
  double [ ] WP = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) WP [ i ] = b [ i ] [ i ] ;
  double [ ] OWP = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double t1 = 0 ;
    double t2 = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String x = a [ i ] [ j ] ;
      if ( x . equals ( "0" ) || x . equals ( "1" ) ) {
        t1 += b [ j ] [ i ] ;
        t2 ++ ;
      }
    }
    OWP [ i ] = t1 / t2 ;
  }
  double [ ] OOWP = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double t1 = 0 ;
    double t2 = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      String x = a [ i ] [ j ] ;
      if ( x . equals ( "0" ) || x . equals ( "1" ) ) {
        t1 += OWP [ j ] [ i ] ;
        t2 ++ ;
      }
    }
    if ( t1 == 0 ) OOW @ @