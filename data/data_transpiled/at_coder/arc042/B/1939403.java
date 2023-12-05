static final double distance ( double x , double y ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Point [ ] ps = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ps [ i ] = new Point ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  ps [ 0 ] . x = x ;
  /* Distance between the x and y */
  double dist = dist ( x , y , x , y ) ;
  /* Area between the x and y */
  double a = dist ( x , y , x , y ) ;
  double b = dist ( x , y , x , y ) ;
  double c = dist ( x , y , x , y ) ;
  double s = ( a + b + c ) / 2 ;
  /* Distance between the x and y */
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    double x1 = ps [ i ] . x ;
    double y1 = ps [ i ] . y ;
    double a = area ( x1 , y1 , x2 , y2 , x , y ) ;
    double bottom = dist ( x1 , y , x , y ) ;
    double h = a / bottom * 2 ;
    ans = Math . min ( ans , h ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
