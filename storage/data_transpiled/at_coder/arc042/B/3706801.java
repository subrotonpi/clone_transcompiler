@ VisibleForTesting static double calc ( double [ ] input ) {
  int X = Integer . parseInt ( input [ 0 ] ) ;
  int Y = Integer . parseInt ( input [ 1 ] ) ;
  int N = Integer . parseInt ( input [ 2 ] ) ;
  List < List < Integer >> P = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    P . add ( Collections . singletonList ( Integer . parseInt ( input [ 2 ] ) ) ) ;
  }
  P . add ( P . get ( 0 ) ) ;
  /* calc */
  double x1 = p1 . get ( 0 ) - X ;
  double x2 = p2 . get ( 0 ) - X ;
  double y1 = p1 . get ( 1 ) - Y ;
  double y2 = p2 . get ( 1 ) - Y ;
  double area = Math . abs ( x1 * y2 - y1 * x2 ) ;
  return area / Math . sqrt ( ( x1 - x2 ) * ( x1 - x2 ) + ( y1 - y2 ) * ( y1 - y2 ) ) ;
}
