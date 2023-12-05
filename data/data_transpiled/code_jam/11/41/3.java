static final String solve ( double X , double S , double R , double t , List < Pair < Double , Double >> wL ) {
  final double X0 = X - Math . pow ( L , 2 ) ;
  wL . add ( new Pair < > ( 0 , X0 ) ) ;
  Collections . sort ( wL ) ;
  double res = 0 ;
  for ( Pair < Double , Double > w : wL ) {
    double L = w . second ;
    double rT = Math . min ( L / ( w + R ) , t ) ;
    t -= rT ;
    res += rT ;
    wT = ( L - ( w + R ) * rT ) / ( w + S ) ;
    res += wT ;
  }
  return String . valueOf ( res ) ;
}
