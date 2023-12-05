public static int comb ( int n , int k ) {
  int ret = 1 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    ret *= n - i ;
    ret /= i + 1 ;
  }
  return ret ;
}
int mod = 10 * 9 + 7 ;
n = Integer . parseInt ( input . nextLine ( ) ) ;
int m = Integer . parseInt ( input . nextLine ( ) ) ;
n = Math . abs ( n ) ;
int res = ( 2 * m ) / 2 % mod ;
for ( int i = 2 ;
i < 1000000 ;
i ++ ) {
  if ( i * i > n ) break ;
  if ( n % i == 0 ) {
    int npow = 0 ;
    while ( n % i == 0 ) {
      n /= i ;
      npow ++ ;
    }
    res *= comb ( npow + m - 1 , npow ) ;
    res %= mod ;
  }
}
if ( n > 1 ) res = res * m % mod ;
System . out . println ( res ) ;
return res ;
}
