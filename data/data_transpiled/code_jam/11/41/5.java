static final double nextDouble ( ) {
  final double eps = 1e-8 ;
  double time = 1. * s / v ;
  {
    int X , S , R , t , n ;
    X = Double . parseDouble ( readLine ( ) ) ;
    S = Double . parseDouble ( readLine ( ) ) ;
    R = Double . parseDouble ( readLine ( ) ) ;
    t = Double . parseDouble ( readLine ( ) ) ;
    n = Integer . parseInt ( readLine ( ) ) ;
    X = Double . parseDouble ( X ) ;
    S = Double . parseDouble ( S ) ;
    R = Double . parseDouble ( R ) ;
    t = Double . parseDouble ( t ) ;
    List < Pair > l = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      double b = Double . parseDouble ( readLine ( ) ) ;
      double e = Double . parseDouble ( readLine ( ) ) ;
      double w = Double . parseDouble ( readLine ( ) ) ;
      double d = e - b ;
      l . add ( new Pair ( w , d ) ) ;
      X -= d ;
    }
    l . add ( new Pair ( 0 , X ) ) ;
    Collections . sort ( l ) ;
    double res = 0. ;
    for ( Pair s : l ) {
      double d = s . second ;
      double runt = time ( d , s . first ( ) + R ) ;
      if ( runt > t + eps ) {
        res += t ;
        d -= t * ( s . first ( ) + R ) ;
        t = 0 ;
      }
      else {
        res += runt ;
        d = 0 ;
        t -= runt ;
      }
      res += time ( d , S . first ( ) + s ) ;
    }
    System . out . printf ( "%.9lf" , res ) ;
  }
  {
    int T = input . nextInt ( ) ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      System . out . printf ( "Case #%d:%n" , i ) ;
      solve ( ) ;
    }
  }
  if ( __name__ == null ) {
    throw new RuntimeException ( "No input for " + __name__ ) ;
  }
  return time ;
}
