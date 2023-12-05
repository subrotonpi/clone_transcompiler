public static void print ( int test , String input ) {
  int N = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int L = Integer . parseInt ( input ) ;
  double [ ] R = Integer . parseInt ( input ) ;
  Arrays . sort ( R ) ;
  double [ ] P = new double [ N ] ;
  int c = 0 ;
  for ( double r : R ) {
    c ++ ;
    double [ ] Y = new double [ N ] ;
    Y [ 0 ] = 0.0 ;
    Y [ 1 ] = P [ 0 ] + R [ 1 ] + r + 0.00001 ;
    Arrays . sort ( Y ) ;
    double cx = 0 , cy = 0 ;
    double [ ] TP = new double [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      TP [ i ] = new double [ N ] ;
      TP [ i ] = new double [ N ] ;
      TP [ i ] [ 0 ] = ( P [ i ] [ 0 ] + P [ i ] [ 1 ] + r ) ;
      TP [ i ] [ 1 ] = ( P [ i ] [ 1 ] + P [ i ] [ 2 ] + r ) ;
      TP [ i ] [ 2 ] = ( P [ i ] [ 1 ] + P [ i ] [ 2 ] + r ) ;
      TP [ i ] [ 3 ] = ( P [ i ] [ 3 ] + P [ i ] [ 3 ] + r ) ;
      TP [ i ] [ 4 ] = ( P [ i ] [ 4 ] + P [ i ] [ 5 ] + r ) ;
      TP [ i ] [ 5 ] = ( P [ i ] [ 6 ] + P [ i ] [ 7 ] + p [ 8 ] ) ;
      TP [ i ] [ 6 ] = ( P [ i ] [ 8 ] + P [ i ] [ 9 ] + r ) ;
      TP [ i ] [ 7 ] = ( P [ i ] [ 7 ] + P [ i ] [ 8 ] + r ) ;
      TP [ i ] [ 8 ] = ( P [ i ] [ 8 ] + P [ i ] [ 9 ] + r ) ;
      TP [ i ] [ 9 ] = ( P [ i ] [ 8 ] + P [ i ] [ 9 ] + r ) ;
      TP [ i ] [ 10 ] = ( P [ i ] [ 10 ] + P [ i ] [ 11 ] + r ) ;
      TP [ i ] [ 11 ] = ( P