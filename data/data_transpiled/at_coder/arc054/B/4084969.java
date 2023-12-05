public static double p = Double . parseDouble ( input ) {
  Function f = x -> x + p * 2 * x * ( - 2 * x / 3 ) ;
  double a = 0 , b = 100 , d = 0 ;
  while ( a + 1e-9 < b && d < 10 * 5 ) {
    double c = ( a + b ) / 2 ;
    if ( f . apply ( a ) > f . apply ( ( a + c ) / 2 ) ) a = ( a + c ) / 2 ;
    d ++ ;
  }
  return a ;
}
