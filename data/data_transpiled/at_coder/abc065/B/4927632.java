public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int k = 1 ;
  int ans = 0 ;
  while ( ( k = a [ k - 1 ] ) != 0 ) {
    ans ++ ;
    if ( k == 2 || ans == N ) break ;
  }
  return ans > 0 ? ans : - 1 ;
}
