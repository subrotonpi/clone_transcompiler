public static int N = Integer . parseInt ( input ) {
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int tmp = i ;
    for ( int j = 2 ;
    j <= N ;
    j ++ ) {
      while ( tmp % j == 0 ) {
        tmp /= j ;
        map . put ( j , map . getOrDefault ( j , 0 ) + 1 ) ;
      }
    }
  }
  int ans = 1 ;
  for ( Integer k : map . keySet ( ) ) {
    ans *= map . get ( k ) + 1 ;
    ans %= 10 * 9 + 7 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
