private static double computeEtries ( double p ) throws Exception {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  double pr = p / 100.0 ;
  double re = 1 ;
  double running = pr ;
  int multiplier = 2 ;
  while ( multiplier < 10000 || multiplier * running > 1e-9 ) {
    re += multiplier * running ;
    running *= pr ;
    multiplier ++ ;
  }
  return ( 1 - pr ) * re ;
}
