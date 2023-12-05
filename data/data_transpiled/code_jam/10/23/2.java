public static int MAX = 501 ;
final int MOD = 100003 ;
int [ ] [ ] dp = new int [ MAX ] [ MAX ] ;
int [ ] [ ] c = new int [ MAX ] [ MAX ] ;
int i , n , k ;
int sum ;
/* CC */
int n = Math . min ( n - k , k ) ;
k = Math . min ( n - k , k ) ;
nom = 1 ;
denom = 1 ;
for ( i = 0 ;
i < k ;
i ++ ) {
  nom *= n - i ;
  denom *= i + 1 ;
}
for ( i = 0 ;
i < MAX ;
i ++ ) {
  dp [ i ] = new int [ MAX ] ;
  c [ i ] = new int [ MAX ] ;
  for ( j = 0 ;
  j < MAX ;
  j ++ ) {
    dp [ i ] [ j ] = - 1 ;
    c [ i ] [ j ] = cc ( i , j ) % MOD ;
  }
}
/* get */
if ( ( dp [ n ] [ k ] != - 1 ) && ( dp [ n ] [ k ] != - 1 ) ) return dp [ n ] [ k ] ;
if ( ( k >= n ) && ( k == 1 ) ) return 0 ;
if ( ( k == 1 ) && ( k == n ) ) return 1 ;
sum = 0 ;
for ( i = 1 ;
i < k ;
i ++ ) {
  if ( ( k - i > n - k ) ) continue ;
  sum = ( sum + get ( k , i ) * c [ n - k - 1 ] [ k - i - 1 ] ) % MOD ;
}
dp [ n ] [ k ] = sum ;
return sum ;
}
