public static double p = Double . parseDouble ( input ) {
  Function f = x -> x + p * ( 2 * ( - x / 1.5 ) ) ;
  int ub = 1000 ;
  int lb = 0 ;
  for ( int i = 0 ;
  i < 200 ;
  i ++ ) {
    int a = ( ub + 2 * lb ) / 3 ;
    int b = ( 2 * ub + lb ) / 3 ;
    if ( f . apply ( a ) > f . apply ( b ) ) {
      lb = a ;
    }
  }
  return lb ;
}
