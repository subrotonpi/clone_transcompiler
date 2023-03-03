@ Sys public static double getans ( ) {
  int tmp = a . indexOf ( Math . min ( a ) ) ;
  a [ tmp ] ++ ;
  b [ tmp ] ++ ;
  int m = Math . min ( a ) ;
  double res = 0.0 ;
  int k = 0 ;
  for ( int i : xrange ( 37 ) ) {
    if ( a [ i ] == m ) {
      res += 36.0 * b [ i ] ;
      k ++ ;
    }
  }
  res /= k ;
  return res ;
}
