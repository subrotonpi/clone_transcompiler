@ VisibleForTesting static int factorial ( ) {
  int n , m ;
  Map < Integer , Integer > map = Maps . newHashMap ( ) ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  map . clear ( ) ;
  int ans = 1 ;
  int mod = 10 * 9 + 7 ;
  /* f2 */
  int ret = 1 ;
  for ( int i = n ;
  i >= n - r ;
  i -- ) {
    ret *= i ;
  }
  /* cc */
  int t = Math . min ( r , n - r ) ;
  return f2 ( n , t ) / fac ( t ) ;
}
