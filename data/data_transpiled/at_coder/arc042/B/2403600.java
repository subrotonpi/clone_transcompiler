@ VisibleForTesting static double from ( Scanner input ) {
  int x = input . nextInt ( ) ;
  int y = input . nextInt ( ) ;
  int n = input . nextInt ( ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = input . nextInt ( ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    double z1 = ( a [ i ] [ 1 ] - a [ i - 1 ] [ 1 ] ) * x + ( a [ i - 1 ] [ 0 ] - a [ i ] [ 0 ] ) * y + a [ i - 1 ] [ 0 ] * ( a [ i - 1 ] [ 1 ] - a [ i ] [ 1 ] ) + a [ i - 1 ] [ 1 ] * ( a [ i ] [ 0 ] - a [ i - 1 ] [ 0 ] ) ;
    double z2 = Math . sqrt ( ( a [ i ] [ 1 ] - a [ i - 1 ] [ 1 ] ) * ( a [ i ] [ 1 ] - a [ i - 1 ] [ 1 ] ) + ( a [ i - 1 ] [ 0 ] - a [ i ] [ 0 ] ) * ( a [ i ] [ 0 ] - a [ i ] [ 0 ] ) ) ;
    ans = Math . min ( ans , Math . abs ( z1 ) * 1.0 / z2 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
