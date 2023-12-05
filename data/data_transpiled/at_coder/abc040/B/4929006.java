@ VisibleForTesting static int from ( int input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = 10 * * 9 ;
  for ( int i = 1 ;
  i <= ( int ) Math . sqrt ( n ) ;
  i ++ ) {
    ans = Math . min ( ans , n - i * ( n / i ) + Math . abs ( i - ( n / i ) ) ) ;
  }
  return ans ;
}
