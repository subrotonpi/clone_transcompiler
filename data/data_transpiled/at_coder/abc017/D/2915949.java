public static int MOD = 10 * * 9 + 7 ;
int n = Integer . parseInt ( input . readLine ( ) ) ;
int m = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] f = new int [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) f [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
int leftmost = 0 ;
int [ ] last = new int [ m ] ;
last [ f [ 0 ] - 1 ] = 1 ;
int [ ] dp = new int [ n + 1 ] ;
int [ ] sums = new int [ n + 1 ] ;
dp [ 0 ] = 1 ;
dp [ 1 ] = 1 ;
sums [ 0 ] = 1 ;
sums [ 1 ] = 2 ;
for ( int i = 1 ;
i < n ;
i ++ ) {
  leftmost = Math . max ( leftmost , last [ f [ i ] - 1 ] ) ;
  if ( leftmost == 0 ) {
    dp [ i + 1 ] = ( dp [ i ] * 2 ) % MOD ;
    sums [ i + 1 ] = ( sums [ i ] + dp [ i + 1 ] ) % MOD ;
    last [ f [ i ] - 1 ] = i + 1 ;
  }
}
System . out . println ( dp [ n ] ) ;
return dp [ n ] ;
}
