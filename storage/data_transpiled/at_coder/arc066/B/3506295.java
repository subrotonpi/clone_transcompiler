public static int MOD = 10 * * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > binN = Lists . newArrayList ( Integer . toBinaryString ( N ) . substring ( 2 ) ) ;
int [ ] [ ] dp = new int [ binN . size ( ) + 1 ] [ 3 ] ;
for ( int i = 0 ;
i < dp . length ;
i ++ ) {
  dp [ i ] [ 0 ] = 1 ;
  for ( int j = 0 ;
  j < dp [ i ] . length ;
  j ++ ) {
    dp [ i + 1 ] [ 0 ] += dp [ i ] [ 0 ] * 1 ;
    dp [ i + 1 ] [ 1 ] += dp [ i ] [ 0 ] * Ni ;
    dp [ i + 1 ] [ 0 ] += dp [ i ] [ 1 ] * ( 1 - Ni ) ;
    dp [ i + 1 ] [ 1 ] += dp [ i ] [ 1 ] * ( 1 + Ni ) ;
    dp [ i + 1 ] [ 2 ] += dp [ i ] [ 2 ] * 3 ;
    dp [ i + 1 ] [ 0 ] %= MOD ;
    dp [ i + 1 ] [ 1 ] %= MOD ;
    dp [ i + 1 ] [ 2 ] %= MOD ;
  }
}
System . out . println ( Integer . toString ( dp [ dp . length - 1 ] ) % MOD ) ;
return MOD ;
}
