@ Nullable public static double readDouble ( ) {
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int tInput : xrange ( 1 , T + 1 ) ) {
    String [ ] line = readLine ( ) . split ( " " ) ;
    double D = Double . parseDouble ( line [ 0 ] ) ;
    int N = Integer . parseInt ( line [ 1 ] ) , A = Integer . parseInt ( line [ 2 ] ) ;
    double [ ] ts = new double [ N ] ;
    double [ ] xs = new double [ N ] ;
    for ( int i : xrange ( N ) ) {
      line = readLine ( ) . split ( " " ) ;
      ts [ i ] = Double . parseDouble ( line [ 0 ] ) ;
      xs [ i ] = Double . parseDouble ( line [ 1 ] ) ;
    }
    float [ ] accelerations = map ( Float . parseFloat ( readLine ( ) . split ( " " ) ) , ts ) ;
    System . out . println ( "Case #" + tInput + ":" ) ;
    double c = xs [ 0 ] ;
    double v0 ;
    if ( N == 1 ) v0 = 0 ;
    else v0 = ( xs [ 1 ] - xs [ 0 ] ) / ( ts [ 1 ] - ts [ 0 ] ) ;
    if ( v0 == 0 ) {
      for ( float a : accelerations ) System . out . println ( sqrt ( 2 * D / a ) ) ;
    }
    else {
      double t2 = ( D - c ) / v0 ;
      for ( float a : accelerations ) {
        double t2star = ( v0 + sqrt ( v0 * v0 + 2 * a * c ) ) / a ;
        if ( a < ( 2 * t2 * v0 + 2 * c ) / ( t2 * t2 ) || v0 > a * t2 ) System . out . println ( sqrt ( 2 * D / a ) ) ;
        else System . out . println ( t2 ) ;
      }
    }
  }
  return T ;
}
