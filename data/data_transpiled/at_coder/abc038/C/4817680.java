public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int l = 1 ;
  int r = 1 ;
  int ans = 0 ;
  while ( l <= N ) {
    while ( l <= r && r < N && a [ r - 1 ] < a [ r ] ) {
      r ++ ;
    }
    ans += r - l + 1 ;
    if ( r == l ) r ++ ;
    l ++ ;
  }
  System . out . println ( ans ) ;
}
