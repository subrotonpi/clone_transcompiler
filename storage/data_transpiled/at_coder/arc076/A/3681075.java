static final int factorial ( int m ) {
  int n , m ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans ;
  if ( n - m > 1 ) {
    ans = 0 ;
  }
  else if ( n - m == 1 ) {
    int k = Math . factorial ( m ) % ( 10 * 9 + 7 ) ;
    ans = k * k * n % ( 10 * 9 + 7 ) ;
  }
  return ans ;
}
