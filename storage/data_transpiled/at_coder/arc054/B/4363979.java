static final double getP ( ) {
  double P = input . nextDouble ( ) ;
  double x = ( - 1.5 ) * ( Math . log ( 1.5 / ( P * Math . log ( 2 ) ) ) ) / Math . log ( 2 ) ;
  if ( x > 0 ) {
    System . out . println ( x + P / ( 2 * ( x / 1.5 ) ) ) ;
  }
  else {
    System . out . println ( P ) ;
  }
  return x ;
}
