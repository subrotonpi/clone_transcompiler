static private String climit ( double V , List < Pair < Integer , Double >> cr , double t ) {
  final double cv = 0.0 ;
  double v = 0.0 ;
  for ( Pair < Integer , Double > ci : cr ) {
    final double ri = ci . first ;
    if ( v + ri . second * t >= V ) {
      cv += ci . second * ( V - v ) ;
      v = V ;
      if ( Math . abs ( ci . second - cr . get ( 0 ) . second ) < 1.0e-9 ) {
        return cr . get ( 0 ) . first ;
      }
      return cv / v ;
    }
    else {
      cv += ci . second * ri . second * t ;
      v += ri . second * t ;
    }
  }
  return null ;
}
