@ VisibleForTesting static int getPrime ( ) {
  int a = ( int ) input . nextInt ( ) ;
  int b = ( int ) input . nextInt ( ) ;
  Map < Integer , Integer > x = new HashMap < > ( ) , ans = 1 , mod = 10 * 9 + 7 ;
  for ( int i = b + 1 ;
  i <= a ;
  i ++ ) {
    int n = i ;
    for ( int j = 2 ;
    j <= ( int ) Math . sqrt ( n ) ;
    j ++ ) {
      while ( n % j == 0 ) {
        x . put ( j , 1 ) ;
        n /= j ;
        n /= j ;
      }
    }
    if ( n != 1 ) x . put ( n , 1 ) ;
  }
  for ( int i : x . values ( ) ) ans = ans * ( i + 1 ) % mod ;
  return ans ;
}
