public static int manju ( @ IntRange ( from = 0 , to = 100 ) int A , int B , int C ) {
  int maxNum = 0 ;
  for ( int numA = C / A + 1 ;
  ;
  numA ++ ) {
    int numB = ( C - A * numA ) / B ;
    if ( numB < 0 ) {
      break ;
    }
    maxNum = Math . max ( maxNum , numA + numB ) ;
  }
  return maxNum ;
}
