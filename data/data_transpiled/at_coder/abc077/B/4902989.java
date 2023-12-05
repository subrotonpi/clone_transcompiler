public static double log2 ( ) {
  int n = input . nextInt ( ) ;
  double ans = 0 ;
  for ( int i = ( int ) ( ( n - 1 ) * 0.5 ) ;
  i <= ( int ) ( n * 0.5 ) ;
  i ++ ) {
    ans = Math . max ( ans , i * i ) ;
  }
  return ans ;
}
