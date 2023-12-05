public static void print ( int N , int K ) {
  int [ ] H = Integer . parseInt ( input ( ) ) ;
  double min_h = 1e15 ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    double tmp = H [ i + K - 1 ] - H [ i ] ;
    if ( tmp < min_h ) {
      min_h = tmp ;
    }
  }
  System . out . println ( min_h ) ;
}
