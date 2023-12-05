@ Function public static double input ( ) {
  double p = input ( ) ;
  double q = 1.5 * Math . log ( p * Math . log ( 2 ) / 1.5 ) / Math . log ( 2 ) ;
  double r = q + p / ( 2 * ( q / 1.5 ) ) ;
  if ( p * Math . log ( 2 ) / 1.5 > 1 ) {
    System . out . println ( r ) ;
  }
  else {
    System . out . println ( p ) ;
  }
  return r ;
}
