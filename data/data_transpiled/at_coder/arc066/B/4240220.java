public static int MOD = 10 * 9 + 7 ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] dp = new int [ 3 ] [ 61 ] ;
dp [ 60 ] [ 0 ] = 1 ;
for ( int i = 59 ;
i >= 0 ;
i -- ) {
  if ( ( n >> i ) & 1 == 1 ) {
    dp [ i ] [ 0 ] += dp [ i + 1 ] [ 0 ] ;
    dp [ i ] [ 1 ] += dp [ i + 1 ] [ 0 ] + dp [ i + 1 ] [ 1 ] ;
    dp [ i ] [ 2 ] += 2 * dp [ i + 1 ] [ 1 ] + 3 * dp [ i + 1 ] [ 2 ] ;
  }
  else {
    dp [ i ] [ 0 ] += dp [ i + 1 ] [ 0 ] + dp [ i + 1 ] [ 1 ] ;
    dp [ i ] [ 1 ] += dp [ i + 1 ] [ 1 ] ;
    dp [ i ] [ 2 ] += dp [ i + 1 ] [ 1 ] + 3 * dp [ i + 1 ] [ 2 ] ;
  }
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) dp [ i ] [ j ] %= MOD ;
}
System . out . println ( Integer . toString ( dp [ 0 ] ) % MOD ) ;
return 0 ;
}
