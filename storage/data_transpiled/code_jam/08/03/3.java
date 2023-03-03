static double integral ( double R , double x1 , double x2 ) {
  double f , R , t , g , f ;
  int N = ( int ) Math . sqrt ( R * R - x2 * x2 ) - x1 * Math . sqrt ( R * R - x1 * x1 ) + R * R * ( Math . asin ( x2 / R ) - Math . asin ( x1 / R ) ) ;
  for ( int nc = 1 ;
  nc < N ;
  nc ++ ) {
    final double f = Double . parseDouble ( System . in . readLine ( ) . trim ( ) ) ;
    final double R = Double . parseDouble ( System . in . readLine ( ) . trim ( ) ) ;
    final double t = Double . parseDouble ( System . in . readLine ( ) . trim ( ) ) ;
    final double r = Double . parseDouble ( System . in . readLine ( ) . trim ( ) ) ;
    final double g = Double . parseDouble ( System . in . readLine ( ) . trim ( ) ) ;
    System . out . println ( String . format ( "Case #%d: %s" , nc , 1 - prob ( R , t , g , f ) ) ) ;
    nc ++ ;
  }
  return f * f * f * f ;
}
