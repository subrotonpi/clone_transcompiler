public static int MOD = ( 10 * * 9 ) + 7 ;
int listSize = 1000000 ;
int [ ] f_list = new int [ listSize ] ;
int [ ] f_r_list = new int [ listSize ] ;
for ( int i = 0 ;
i < listSize - 1 ;
i ++ ) {
  f_list [ i + 1 ] = ( int ) ( ( f_list [ i ] * ( i + 2 ) ) % MOD ) ;
}
/* power */
if ( f_list [ 0 ] == 1 ) {
  /* return n; */
}
else if ( f_list [ 0 ] % 2 == 0 ) {
  /* return power((int)((n*n)%MOD), (int)(x/2)); */
}
else {
  /* return (int)((n*power(n,x-1))%MOD); */
}
f_r_list [ f_list . length - 1 ] = power ( f_list [ f_list . length - 1 ] , MOD - 2 ) ;
for ( int i = 2 ;
i <= listSize ;
i ++ ) {
  f_r_list [ f_list . length - i ] = ( int ) ( ( f_r_list [ f_list . length - i + 1 ] * ( listSize + 2 - i ) ) % MOD ) ;
}
/* factorial */
if ( i == 0 ) {
  /* return 1; else return f_list[i-1]; */
}
/* comb n */
int n = Integer . parseInt ( input ( ) ) ;
int ans = ( ( n - 1 ) * factorial ( n - 1 ) ) % MOD ;
for ( int i = n - 2 ;
i >= ( n + 1 ) / 2 - 1 ;
i -- ) {
  ans -= comb ( i - 1 , n - i - 1 ) * factorial ( n - i - 1 ) * factorial ( i ) ;
  ans %= MOD ;
}
System . out . println ( ans ) ;
return ans ;
}
