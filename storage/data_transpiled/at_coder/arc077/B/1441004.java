public static int MOD = 10 * * 9 + 7 ;
int a , m , y , x ;
int i ;
int m ;
int k ;
int s ;
int t ;
int k ;
int g ;
int y ;
x = y ;
g = egcd ( b % a , a ) ;
y = egcd ( g , x - ( b / a ) * y , y ) ;
x = egcd ( g , x - ( b / a ) * y , y ) ;
m = m ;
if ( g != 1 ) {
  throw new IllegalStateException ( "modular inverse does not exist" ) ;
}
else {
  return x % m ;
}
n = Integer . parseInt ( input ( ) ) ;
temp = new int [ n + 2 ] ;
temp [ 0 ] = null ;
for ( i = 0 ;
i < m ;
i ++ ) {
  a = Integer . parseInt ( input ( ) ) ;
  if ( temp [ a - 1 ] == null ) {
    temp [ a - 1 ] = i ;
  }
  else {
    m = n - i + temp [ a - 1 ] ;
    break ;
  }
}
b = 1 ;
for ( i = 2 ;
i <= m ;
i ++ ) {
  b *= i ;
  b %= MOD ;
}
a = b ;
for ( i = m + 1 ;
i <= n ;
i ++ ) {
  a *= i ;
  a %= MOD ;
}
ik = modinv ( a , MOD ) ;
for ( i = 0 ;
i < n ;
i ++ ) {
  temp [ i ] = ik ;
  ik *= i ;
  ik %= MOD ;
}
for ( k = 1 ;
k <= m ;
k ++ ) {
  s = a * temp [ k ] * temp [ n + 1 - k ] ;
  t = b * temp [ k - 1 ] * temp [ m + 1 - k ] ;
  System . out . println ( ( s - t ) % MOD ) ;
}
for ( k = m + 2 ;
k <= n ;
k ++ ) {
  s = a * temp [ k ] * temp [ n + 1 - k ] ;
  System . out . println ( s % MOD ) ;
}
return m ;
}
