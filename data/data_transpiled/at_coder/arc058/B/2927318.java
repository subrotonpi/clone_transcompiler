public static int MOD = 10 * * 9 + 7 ;
int H = Integer . parseInt ( input . readLine ( ) ) ;
int W = Integer . parseInt ( input . readLine ( ) ) ;
int A = Integer . parseInt ( input . readLine ( ) ) ;
int B = Integer . parseInt ( input . readLine ( ) ) ;
int N = H - 1 ;
int [ ] inv = new int [ N + 1 ] ;
inv [ 1 ] = 1 ;
for ( int k = 2 ;
k <= N ;
k ++ ) inv [ k ] = ( - ( MOD / k ) * inv [ MOD % k ] ) % MOD ;
int n1 = B - 1 ;
int [ ] C1s = new int [ H - A ] ;
C1s [ 0 ] = 1 ;
for ( int r = 1 ;
r <= H - A ;
r ++ ) C1s [ r ] = ( C1s [ r - 1 ] * ( n1 + r ) * inv [ r ] ) % MOD ;
int n2 = W - B - 1 ;
int [ ] C2s = new int [ H ] ;
C2s [ 0 ] = 1 ;
for ( int r = 1 ;
r <= H ;
r ++ ) C2s [ r ] = ( C2s [ r - 1 ] * ( n2 + r ) * inv [ r ] ) % MOD ;
int ans = 0 ;
for ( int i = 0 ;
i < H - A ;
i ++ ) {
  ans += ( C1s [ i ] * C2s [ C2s . length - 1 - i ] ) % MOD ;
  ans %= MOD ;
}
System . out . println ( ans ) ;
return ans ;
}
