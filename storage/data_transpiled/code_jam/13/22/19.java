public static int solve ( int n , int x , int y ) throws IOException {
  x = Math . abs ( x ) ;
  int layer = ( x + y ) / 2 ;
  int below ;
  if ( layer == 0 ) {
    below = 0 ;
  }
  else {
    below = tri ( layer * 2 - 1 ) ;
  }
  if ( below >= n ) {
    return 0 ;
  }
  else if ( x == 0 ) {
    return ( int ) ( n >= tri ( layer * 2 + 1 ) ? 1 : 0 ) ;
  }
  else if ( layer * 2 + y + 1 <= n - below ) {
    return 1 ;
  }
  else {
    n -= below ;
  }
  return chance ( y + 1 , n ) ;
}
static double chance ( int needed , int n ) {
  double [ ] prob = new double [ n ] ;
  for ( int i = 0 ;
  i < xrange ( n ) ;
  i ++ ) {
    prob [ i ] = 1.0 ;
  }
  for ( int i = xrange ( n ) ;
  i < xrange ( n ) ;
  i ++ ) {
    for ( int j = xrange ( n - 1 , - 1 , - 1 ) ;
    j >= 0 ;
    j -- ) {
      prob [ j + 1 ] += prob [ j ] / 2 ;
      prob [ j ] = prob [ j ] / 2 ;
    }
  }
  return Arrays . stream ( prob ) . sum ( ) ;
}
private int tri ( int n ) {
  return n * ( n + 1 ) / 2 ;
}
