static final double getDoubleFromInput ( ) {
  final double P = Double . parseDouble ( input . nextLine ( ) ) ;
  double x = 1.5 / Math . log ( 2.000000000 ) * Math . log ( P * Math . log ( 2.000000000000 ) / 1.500000000000000 ) ;
  if ( ( x > 0 ) && ( x < 0 ) ) {
    System . out . println ( x + P * Math . pow ( 2.0000000000000 , - x / 1.500000000000000 ) ) ;
  }
  else {
    System . out . println ( P ) ;
  }
  return x ;
}
