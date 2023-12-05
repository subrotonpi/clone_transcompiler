static final double INF = Double . POSITIVE_INFINITY ;
{
  double m = INF , n = - 1 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( m > a [ i ] ) {
      m = a [ i ] ;
      n = a [ i ] ;
    }
  }
  return m ;
}
