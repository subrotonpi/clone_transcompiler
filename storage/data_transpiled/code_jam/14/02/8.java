public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    double C = Double . parseDouble ( readLine ( ) ) ;
    double F = Double . parseDouble ( readLine ( ) ) ;
    double X = Double . parseDouble ( readLine ( ) ) ;
    double R = 2 ;
    double total = 0 ;
    do {
      double time = X / R ;
      double tf = C / R + X / ( R + F ) ;
      if ( tf > time ) break ;
      total += C / R ;
      R += F ;
    }
    while ( true ) ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + ( total + X / R ) ) ;
  }
  return T ;
}
