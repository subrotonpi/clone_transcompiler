@ GwtIncompatible ( "java.util.Scanner" ) private static double [ ] [ ] solve ( ) {
  /* read the input */
  int T = Integer . parseInt ( System . in . readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    r [ i ] = map ( Integer . parseInt ( System . in . readLine ( ) ) ) ;
  }
  /* solve the problem */
  int W = Integer . parseInt ( System . in . readLine ( ) ) ;
  int L = Integer . parseInt ( System . in . readLine ( ) ) ;
  int U = Integer . parseInt ( System . in . readLine ( ) ) ;
  int G = Integer . parseInt ( System . in . readLine ( ) ) ;
  int [ ] low = read ( L ) ;
  int [ ] up = read ( U ) ;
  List < Integer > xx = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    xx . add ( i ) ;
  }
  Collections . sort ( xx ) ;
  /* interpolate the poly */
  double [ ] [ ] ret = new double [ xx . size ( ) ] [ ] ;
  int i_ = 0 ;
  int x_ = poly [ 0 ] ;
  int y_ = poly [ 1 ] ;
  for ( int i = 1 ;
  i < xx . size ( ) ;
  i ++ ) {
    int x = xx . indexOf ( x ) ;
    for ( int j = i_ ;
    j <= i ;
    j ++ ) {
      ret [ j ] = y_ + ( xx [ j ] - x_ ) * ( y - y_ ) / ( double ) ( x - x_ ) ;
    }
    i_ = i ;
    x_ = x ;
    y_ = y ;
  }
  /* area the part of the poly */
  double [ ] uu = new double [ uu . length ] ;
  for ( int i = 0 ;
  i < uu . length ;
  i ++ ) {
    uu [ i ] = uu [ i ] - ll [ i ] ;
  }
  /* cut the part of the poly */
  double m = ( uu [ i ] - uu [ i ] ) / ( double ) xx [ i + 1 ] ;
  double b = uu [ i ] ;
  double x ;
  if ( ( Math . abs ( m ) < 1e-20 ) && ( b < G ) ) {
    x = a / b ;
  }
  else {
    x = - b + sqrt