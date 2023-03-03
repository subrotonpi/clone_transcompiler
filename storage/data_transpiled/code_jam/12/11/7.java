@ VisibleForTesting static double calc ( int A , int B , double [ ] prob ) {
  int _42 = Integer . parseInt ( scanner . nextLine ( ) ) ;
  {
    double ans = 1000000000000000000. ;
    double p = 1. ;
    for ( int i : xrange ( A + 1 ) ) {
      ans = Math . min ( ans , ( A - i ) + ( B - i ) + 1 + ( 1 - p ) * ( B + 1 ) ) ;
      p *= prob [ i ] ;
    }
    return ans ;
  }
  for ( int i = 0 ;
  i < xrange ( _42 ) ;
  i ++ ) {
    Arrays . sort ( prob ) ;
    Arrays . sort ( prob ) ;
    prob [ i ] = 1 ;
    double ans = min ( ( double ) ( B + 2 ) , calc ( A , B , prob ) ) ;
    System . out . printf ( "Case #%d: %.6f%n" , i + 1 , ans ) ;
  }
  return ans ;
}
