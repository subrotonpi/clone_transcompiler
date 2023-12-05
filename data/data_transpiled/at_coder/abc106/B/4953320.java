public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int n = 1 ;
  n <= N ;
  n += 2 ) {
    int cnt = 0 ;
    for ( int z = 1 ;
    z <= n ;
    z ++ ) {
      if ( n % z == 0 ) {
        cnt ++ ;
      }
    }
    if ( cnt == 8 ) {
      ans ++ ;
    }
  }
  return ans ;
}
