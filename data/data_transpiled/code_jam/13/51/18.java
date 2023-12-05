static final double calc ( int [ ] x , int [ ] y , double b ) {
  int ymin = min ( y ) ;
  int count = 0 ;
  double total = 0 ;
  for ( int i : xrange ( y . length ) ) {
    if ( y [ i ] == ymin ) {
      count ++ ;
      total += y [ i ] - x [ i ] ;
    }
  }
  double res = total * 36.0 / count - b ;
  return res ;
}
