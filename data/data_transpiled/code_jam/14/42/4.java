static int compute ( int N , int [ ] A ) {
  int [ ] y = A ;
  List < Integer > x = new ArrayList < Integer > ( A ) ;
  Collections . sort ( x ) ;
  int total = 0 ;
  for ( int k : x ) {
    int [ ] z = new int [ N ] ;
    for ( int i : xrange ( y . length ) ) {
      if ( y [ i ] == k ) {
        total += min ( i , y . length - i - 1 ) ;
      }
      else {
        z [ i ] = y [ i ] ;
      }
    }
    y = z ;
  }
  return total ;
}
