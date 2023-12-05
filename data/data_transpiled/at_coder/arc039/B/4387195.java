static final int combinations ( int N , int K ) {
  int mod = 10 * 9 + 7 ;
  int ans ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans = Math . factorial ( i ) / ( Math . factorial ( i - 1 ) * Math . factorial ( i ) ) ;
  }
  return ans ;
}
