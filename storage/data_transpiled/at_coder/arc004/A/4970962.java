public static double [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] xList = new double [ N ] ;
  double [ ] yList = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double x = Integer . parseInt ( input . nextLine ( ) ) ;
    double y = Integer . parseInt ( input . nextLine ( ) ) ;
    xList [ i ] = x ;
    yList [ i ] = y ;
  }
  double lenMax = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      double l = ( xList [ i ] - xList [ j ] ) * ( xList [ i ] - xList [ j ] ) + ( yList [ i ] - yList [ j ] ) * ( yList [ i ] - yList [ j ] ) ;
      if ( l > lenMax ) lenMax = l ;
    }
  }
  return lenMax * ( 0.5 ) ;
}
