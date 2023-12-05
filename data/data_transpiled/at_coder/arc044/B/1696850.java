public static int MOD = ( int ) 1e9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] A = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int [ ] c = new int [ N ] ;
for ( int i = 0 ;
i < A . length ;
i ++ ) {
  c [ A [ i ] ] ++ ;
}
long ans = A [ 0 ] == 0 && c [ 0 ] == 1 ? 1 : 0 ;
for ( int i = 1 ;
i < N ;
i ++ ) {
  if ( c [ i ] > 0 ) {
    ans *= Math . pow ( 2 , ( ( c [ i ] * ( c [ i ] - 1 ) ) / 2 ) , MOD ) * Math . pow ( ( Math . pow ( 2 , c [ i - 1 ] ) - 1 ) , c [ i ] , MOD ) ;
    ans %= MOD ;
  }
}
System . out . println ( ( int ) ans ) ;
return ans ;
}
