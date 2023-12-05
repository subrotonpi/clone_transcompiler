public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  int bN = N ;
  while ( bN > 0 ) {
    ans += bN % 10 ;
    bN /= 10 ;
  }
  for ( int i = 17 ;
  i > 0 ;
  i -- ) {
    int p = N / ( 10 * i ) ;
    if ( p == 0 ) {
      continue ;
    }
    int tmp = 0 ;
    int rem = p - 1 ;
    while ( rem > 0 ) {
      tmp += rem % 10 ;
      rem /= 10 ;
    }
    tmp += 9 * i ;
    if ( tmp > ans ) {
      ans = tmp ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
