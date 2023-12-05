static final double [ ] solve ( ) {
  final double p = Double . parseDouble ( input ( ) ) ;
  final double b = getB ( ) ;
  final double x = Math . max ( 0.0 , Math . log ( - 1.0 / ( p * b ) ) / b ) ;
  final double f = func ( p , x ) ;
  System . out . println ( f ( ternarySearch ( f , 0 , p ) ) ) ;
  return x3 ;
}
