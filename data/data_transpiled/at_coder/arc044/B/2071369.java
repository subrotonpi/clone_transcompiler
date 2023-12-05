@ VisibleForTesting static int modPow ( int x , int n , int mod ) {
  if ( n == 0 ) {
    return 1 ;
  }
  int res = modPow ( x * x % mod , n / 2 , mod ) ;
  if ( ( n & 1 ) != 0 ) {
    res = res * x % mod ;
  }
  return res ;
}
