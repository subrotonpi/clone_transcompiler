static final void solve ( int N , int M , int Q , String s , String t , String x ) {
  /* binary search */
  int n = ary . length ( ) ;
  int l = - 1 ;
  int r = n ;
  while ( r - l > 1 ) {
    int mid = ( l + r ) / 2 ;
    if ( ary . charAt ( mid ) >= val ) {
      r = mid ;
    }
    else {
      l = mid ;
    }
  }
  if ( l == - 1 ) {
    /* left */
    return ;
  }
  /* right */
  if ( r == n ) {
    /* left */
    return ;
  }
  /* left */
  for ( int q = 0 ;
  q < x . length ( ) ;
  q ++ ) {
    double ret = Double . POSITIVE_INFINITY ;
    int [ ] aPos = binarySearch ( s , q ) ;
    int [ ] bPos = binarySearch ( t , q ) ;
    for ( int a = 0 ;
    a < aPos . length ;
    a ++ ) {
      for ( int b = 0 ;
      b < bPos . length ;
      b ++ ) {
        ret = Math . min ( ret , Math . abs ( a - q ) + Math . abs ( b - a ) ) ;
        ret = Math . min ( ret , Math . abs ( b - q ) + Math . abs ( a - b ) ) ;
      }
    }
    System . out . println ( ret ) ;
  }
  /* main */
  /* iterate tokens */
  Scanner scanner = new Scanner ( System . in ) ;
  while ( scanner . hasNextInt ( ) ) {
    String line = scanner . nextLine ( ) ;
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      scanner . nextLine ( ) ;
    }
  }
  /* iterate tokens */
  scanner . close ( ) ;
  /* iterate through line */
  while ( scanner . hasNextInt ( ) ) {
    String line = scanner . nextLine ( ) ;
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      scanner . nextLine ( ) ;
    }
  }
  /* iterate through line */
  scanner . close ( ) ;
  /* iterate through line */
  scanner . close ( ) ;
}
