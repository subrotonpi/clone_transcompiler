public static int MOD = 1000000007 ;
int H = Integer . parseInt ( input . readLine ( ) ) , W = Integer . parseInt ( input . readLine ( ) ) , A = Integer . parseInt ( input . readLine ( ) ) , B = Integer . parseInt ( input . readLine ( ) ) ;
if ( H - A > W - B ) {
  H = W ;
  W = H ;
  A = B ;
  B = A ;
}
int [ ] ans1 = new int [ H - A - 1 ] ;
ans1 [ 0 ] = 1 ;
for ( int i = 0 ;
i < H - A - 1 ;
i ++ ) {
  ans1 [ i ] = ( ans1 [ i ] * ( H - A - 1 + B - i ) * Math . pow ( i + 1 , MOD - 2 , MOD ) ) % MOD ;
}
int c = 1 ;
for ( int i = 0 ;
i < W - H + A - B ;
i ++ ) {
  c = ( c * ( W - B - 1 + A - i ) * Math . pow ( i + 1 , MOD - 2 , MOD ) ) % MOD ;
}
int ans = c ;
for ( int i = 0 ;
i < H - A - 1 ;
i ++ ) {
  c = ( c * ( H - 1 - i ) * Math . pow ( W - H + A - B + 1 + i , MOD - 2 , MOD ) ) % MOD ;
  ans = ( ans + c * ans1 [ i + 1 ] ) % MOD ;
}
System . out . println ( ans ) ;
return ans ;
}
