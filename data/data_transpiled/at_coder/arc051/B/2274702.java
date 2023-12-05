public static double [ ] [ ] matMult ( double a [ ] [ ] , double b [ ] [ ] ) {
  double ans [ ] [ ] = new double [ a . length ] [ b . length ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    ans [ i ] = new double [ a [ 0 ] . length ] ;
    for ( int j = 0 ;
    j < b [ 0 ] . length ;
    j ++ ) {
      double tmp = 0 ;
      for ( int k = 0 ;
      k < a [ 0 ] . length ;
      k ++ ) {
        tmp += a [ i ] [ k ] * b [ k ] [ j ] ;
      }
      ans [ i ] [ j ] = tmp ;
    }
  }
  return ans ;
}
