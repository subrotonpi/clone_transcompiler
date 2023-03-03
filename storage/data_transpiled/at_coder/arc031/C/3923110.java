public static int N = Integer . parseInt ( input ) {
  int * A , * A ;
  int ans = 0 ;
  int [ ] data = new int [ N + 1 ] ;
  /* get the k */
  int s = 0 ;
  while ( k > 0 ) {
    s += data [ k ] ;
    k -= k & - k ;
  }
  /* add the k */
  while ( k <= N ) {
    data [ k ] += x ;
    k += k & - k ;
  }
  for ( int i = 0 ;
  i < A ;
  i ++ ) {
    int a = A [ i ] ;
    int w = data [ a ] ;
    ans += Math . min ( N - a - ( i - w ) , i - w ) ;
    /* add the k */
  }
  System . out . println ( ans ) ;
  return ans ;
}
