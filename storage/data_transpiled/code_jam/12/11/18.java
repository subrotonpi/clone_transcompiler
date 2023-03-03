public static double alphabet ( int a , int b , double [ ] z ) throws IOException {
  double ans = ( double ) b + 2 ;
  double p = 1 ;
  for ( int i : xrange ( a ) ) {
    p *= z [ i ] ;
    double v = p * ( a + b - ( i + 1 ) * 2 + 1 ) + ( 1 - p ) * ( a + b - ( i + 1 ) * 2 + 1 + b + 1 ) ;
    if ( v < ans ) ans = v ;
  }
  return ans ;
}
