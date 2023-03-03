static final String compute ( int A , int B , double [ ] p ) {
  double q = 1.0 ;
  double smin = B + 2.0 ;
  for ( int i : xrange ( p . length ) ) {
    q *= p [ i ] ;
    double s = ( A - i - 1 ) + q * ( B - i ) + ( 1.0 - q ) * ( B - i + B + 1 ) ;
    if ( s < smin ) smin = s ;
  }
  return "" + smin ;
  /* parse */
  final int A = Integer . parseInt ( input ( ) ) ;
  final int B = Integer . parseInt ( input ( ) ) ;
  final double [ ] p = new double [ A ] ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    p [ i ] = Double . parseDouble ( input ( ) ) ;
  }
  /* if (Class.isPrimitive()) {
  int T = Integer.parseInt(input());
  for (int i :xrange(T)) {
  data = parse();
  String result = compute(data);
  System.out.println("Case #"+(i+1)+": "+result);
  }
  }*/
}
