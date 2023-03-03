public static int rui ( int [ ] a , int m , int w ) {
  int r = 1 ;
  while ( m > 0 ) {
    if ( ( m & 1 ) != 0 ) {
      r = r * a [ m ] % w ;
    }
    a = a [ m ] % w ;
    m >>= 1 ;
  }
  return r ;
}
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int len = Integer . parseInt ( input . nextLine ( ) ) ;
int ans = 0 ;
w = 10 * 9 + 7 ;
if ( a [ 0 ] == 0 && a . length == 1 ) {
  Arrays . sort ( a ) ;
  int now = 0 ;
  int old = 1 ;
  int b = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( b != a [ i ] ) {
      if ( a [ i ] - b == 1 ) {
        ans *= rui ( 2 , now * ( now - 1 ) / 2 , w ) ;
        ans %= w ;
        old = now ;
        now = 0 ;
        b = a [ i ] ;
      }
      else {
        ans = 0 ;
        break ;
      }
    }
    ans *= rui ( 2 , old , w ) - 1 ;
    ans %= w ;
    now ++ ;
    if ( i == n - 1 ) {
      ans *= rui ( 2 , now * ( now - 1 ) / 2 , w ) ;
      ans %= w ;
    }
  }
  return ans ;
}
