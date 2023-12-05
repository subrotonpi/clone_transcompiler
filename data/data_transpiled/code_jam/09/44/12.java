@ Sys public static double minR ( ) throws IOException {
  final Scanner in = new Scanner ( System . in ) ;
  final double minR = Math . atan2 ( a . y - b . y , a . x - b . x ) ;
  double cos = Math . cos ( angle ) ;
  if ( a . x == b . x ) {
    final double miny = Math . min ( a . y - a . z , b . y - b . z ) ;
    final double maxy = Math . max ( a . y + a . z , b . y + b . z ) ;
    return ( maxy - miny ) / 2.0 ;
  }
  else {
    if ( cos < 0 ) cos = - cos ;
    final double minx = Math . min ( a . x - a . z * cos , b . x - b . z * cos ) ;
    final double maxx = Math . max ( a . x + a . z * cos , b . x + b . z * cos ) ;
    return ( maxx - minx ) / cos / 2.0 ;
  }
}
