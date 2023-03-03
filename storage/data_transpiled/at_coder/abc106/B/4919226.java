public static int N = Integer . parseInt ( input ) {
  int M ;
  if ( N % 2 == 0 ) M = N + 1 ;
  else M = N + 2 ;
  int ans = 0 ;
  for ( int x = 1 ;
  x <= M ;
  x += 2 ) {
    int cnt = 0 ;
    for ( int i = 1 ;
    i <= x ;
    i ++ ) {
      if ( x % i == 0 ) cnt ++ ;
    }
    if ( cnt == 8 ) ans ++ ;
  }
  return ans ;
}
