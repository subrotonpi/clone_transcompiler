@ VisibleForTesting static void optimize ( ) {
  double p = Double . parseDouble ( input ) ;
  Function < Double , Double > t = x -> x + p / ( 2 * ( x / 1.5 ) ) ;
  Constraint < Double > c = ( new Constraint < Double > ( ) ) ;
  c . add ( t ) ;
  Matrix m = new Matrix ( ) ;
  m . solve ( t , 0 , 0.1 * 9 , c , Matrix . COBYLA ) ;
  System . out . println ( min ( p , m . fun ( ) ) ) ;
}
