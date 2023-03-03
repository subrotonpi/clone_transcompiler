public static long cmb ( int n , int r , long mod ) {
  if ( r < 0 || r > n ) return 0 ;
  r = Math . min ( r , n - r ) ;
  return g1 [ n ] * g2 [ r ] * g2 [ n - r ] % mod ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int a = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int k = Integer . parseInt ( input . nextLine ( ) ) ;
int m = 998244353 ;
long count = 0 ;
long [ ] g1 = {
  1 , 1 }
  ;
  long [ ] g2 = {
    1 , 1 }
    ;
    long [ ] inverse = {
      0 , 1 }
      ;
      for ( int i = 2 ;
      i <= n ;
      i ++ ) {
        g1 [ i ] = ( g1 [ i - 1 ] * i ) % m ;
        inverse [ i ] = ( - inverse [ m % i ] * ( m / i ) ) % m ;
        g2 [ i ] = ( g2 [ i - 1 ] * inverse [ i - 1 ] ) % m ;
      }
      for ( int j1 = 0 ;
      j1 < n + 1 ;
      j1 ++ ) {
        if ( ( k - a * j1 ) % b == 0 ) {
          int j2 = ( k - a * j1 ) / b ;
          count += cmb ( n , j1 , m ) * cmb ( n , j2 , m ) ;
        }
        count %= m ;
      }
      System . out . println ( count ) ;
      return count ;
    }
    