static final double log2p ( ) {
  final double p = input . nextDouble ( ) ;
  final double x = 1.5 * Math . log2 ( Math . log ( 2 ) * p / 1.5 ) ;
  if ( x < 0 ) {
    System . out . println ( p ) ;
  }
  else {
    System . out . println ( x + 1.5 / Math . log ( 2 ) ) ;
  }
  return x ;
}
