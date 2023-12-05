public static int MOD = 10 * * 9 + 7 ;
int m ;
int i ;
int g ;
int y ;
int x ;
int m ;
int n ;
int m ;
int t ;
int ik ;
{
  g = egcd ( b % a , a ) ;
  y = egcd ( b % a , a ) ;
  x = egcd ( g , x - ( b / a ) * y , y ) ;
  x = egcd ( g , x - ( b / a ) * y , y ) ;
  y = egcd ( g , x - ( b / a ) * y , y ) ;
  x = egcd ( g , x - ( b / a ) * y , y ) ;
}
{
  g = egcd ( a , m ) ;
  x = egcd ( m , a ) ;
  y = egcd ( m , a ) ;
  if ( g != 1 ) {
    throw new IllegalStateException ( "modular inverse does not exist" ) ;
  }
  else {
    return x % m ;
  }
}
n = Integer . parseInt ( input ( ) ) ;
temp = new int [ n ] ;
m = m ;
for ( i = 0 ;
i < m ;
i ++ ) {
  temp [ i ] = null ;
}
for ( i = 0 ;
i < m ;
i ++ ) {
  temp [ i ] = i ;
}
m = m ;
m = n - i + 1 ;
m = m ;
System . out . println ( n ) ;
ik = 1 ;
for ( k = 0 ;
k < n ;
k ++ ) {
  t *= ( m - k ) * ik ;
  t %= MOD ;
  ik = modinv ( k + 2 , MOD ) ;
  s *= ( n - k ) * ik ;
  s %= MOD ;
  System . out . println ( ( s - t ) % MOD ) ;
}
