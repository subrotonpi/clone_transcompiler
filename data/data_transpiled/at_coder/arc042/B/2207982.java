public static double x = ( double ) input ( ) {
  x = ( double ) input ( ) ;
  y = ( double ) input ( ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  double [ ] [ ] point = new double [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) point [ i ] [ 0 ] = Integer . parseInt ( input ( ) ) ;
  double [ ] dArray = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double a = point [ i - 1 ] [ 0 ] - point [ i ] [ 0 ] ;
    double b = point [ i - 1 ] [ 1 ] - point [ i ] [ 1 ] ;
    double d = ( a * y - b * x - a * point [ i ] [ 1 ] + b * point [ i ] [ 0 ] ) * ( a * a + b * b ) ;
    dArray [ i ] = d ;
  }
  return Math . min ( dArray ) * ( 1 / 2 ) ;
}
