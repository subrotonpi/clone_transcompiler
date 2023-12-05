public static int BIG = ( 10 * 9 ) + 7 ;
int [ ] f_list = new int [ 200000 ] ;
int [ ] f_r_list = new int [ 200000 ] ;
for ( int i = 0 ;
i < 199999 ;
i ++ ) {
  f_list [ i + 1 ] = ( int ) ( ( f_list [ i ] * ( i + 2 ) ) % BIG ) ;
}
/* power of the first 2 digits */
if ( f_list [ 0 ] == 1 ) {
  /* return n; */
}
else if ( f_list [ 0 ] % 2 == 0 ) {
  /* return power of (int)((n*n)%BIG); */
}
else {
  /* return (int)((n*power(n,x-1))%BIG); */
}
f_r_list [ f_r_list . length - 1 ] = power ( f_list [ f_r_list . length - 1 ] , BIG - 2 ) ;
for ( int i = 2 ;
i < 200001 ;
i ++ ) {
  f_r_list [ f_r_list . length - i ] = ( int ) ( ( f_r_list [ f_r_list . length - i + 1 ] * ( 200002 - i ) ) % BIG ) ;
}
/* comb the first 2 digits */
if ( n == 0 || r == 0 || n == r ) {
  /* return 1; */
}
else {
  /* return (((f_list[n-1]*f_r_list[n-r-1])%BIG)*f_r_list[r-1])%BIG ; */
}
int h = Integer . parseInt ( input ( ) ) ;
int w = Integer . parseInt ( input ( ) ) ;
int a = Integer . parseInt ( input ( ) ) ;
int b = Integer . parseInt ( input ( ) ) ;
long ans = 0 ;
for ( int i = 0 ;
i < h - a ;
i ++ ) {
  ans = ( long ) ( ( ans + ( long ) ( ( comb ( b + i - 1 , b - 1 ) * comb ( h + w - b - i - 2 , w - b - 1 ) ) % BIG ) ) % BIG ) ;
}
System . out . println ( ( int ) ans ) ;
return a ;
}
