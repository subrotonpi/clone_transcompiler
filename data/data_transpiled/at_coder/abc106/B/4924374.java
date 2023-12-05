public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int a = 1 ;
  a <= N ;
  a ++ ) {
    if ( a % 2 == 0 ) {
      continue ;
    }
    int c = 0 ;
    for ( int b = 1 ;
    b <= a ;
    b ++ ) {
      if ( a % b == 0 ) {
        c ++ ;
      }
    }
    if ( c == 8 ) {
      ans ++ ;
    }
  }
  return ans ;
}
