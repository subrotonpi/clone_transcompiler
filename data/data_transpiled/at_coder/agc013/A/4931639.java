private static int N ( Scanner in ) {
  int N = in . nextInt ( ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = in . nextInt ( ) ;
  }
  int total = 1 ;
  int trend = 0 ;
  int prev = A [ 0 ] ;
  for ( int a = 1 ;
  a < N ;
  a ++ ) {
    if ( A [ a ] > prev && trend < 0 ) {
      total ++ ;
      trend = 0 ;
    }
    else if ( A [ a ] < prev && trend > 0 ) {
      total ++ ;
      trend = 0 ;
    }
    else if ( trend == 0 ) {
      trend = A [ a ] - prev ;
    }
    prev = A [ a ] ;
  }
  System . out . println ( total ) ;
  return total ;
}
