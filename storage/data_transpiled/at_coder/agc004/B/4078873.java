public static double N ( int x , int N ) {
  int [ ] aArray = Integer . parseInt ( input ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  double [ ] costArray = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    costArray [ i ] = Double . POSITIVE_INFINITY ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double cost = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == 0 ) {
        cost += aArray [ j ] ;
        costArray [ j ] = aArray [ j ] ;
      }
      else {
        double tmp = costArray [ j ] ;
        if ( tmp > aArray [ aArray . length - i + j ] ) {
          costArray [ j ] = aArray [ aArray . length - i + j ] ;
          cost += aArray [ aArray . length - i + j ] ;
        }
        else {
          cost += tmp ;
        }
      }
    }
    cost += x * i ;
    ans = Math . min ( ans , cost ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
