public static double n ( double a , double b , double ... s ) {
  int M = Math . max ( s . length , 2 ) ;
  int m = Math . min ( s . length , 2 ) ;
  double d = M - m ;
  if ( d == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  return d ;
}
