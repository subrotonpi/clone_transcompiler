public static int C ( int n , int m ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] occur = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( occur [ a [ i ] ] > 0 ) val = n - 1 - i + occur [ a [ i ] ] ;
    else occur [ a [ i ] ] = i + 1 ;
  }
  int [ ] inv = new int [ n + 2 ] ;
  int [ ] pinv = new int [ n + 2 ] ;
  int [ ] perm = new int [ n + 2 ] ;
  for ( int i = 2 ;
  i < n + 2 ;
  i ++ ) {
    inv [ i ] = i > 2 ? 0 : 1 ;
    pinv [ i ] = i > 2 ? 0 : 1 ;
    pinv [ i ] = i > 2 ? 0 : 1 ;
    perm [ i ] = i > 2 ? 0 : 1 ;
  }
  for ( int i = 2 ;
  i < n + 2 ;
  i ++ ) {
    inv [ i ] = i > 2 ? - ( int ) ( MOD / i ) * inv [ MOD % i ] + MOD : 1 ;
    pinv [ i ] = pinv [ i - 1 ] * inv [ i ] % MOD ;
    perm [ i ] = perm [ i - 1 ] * i % MOD ;
  }
  int temp ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    temp = ( perm [ i ] * pinv [ i ] % MOD ) * pinv [ m - n ] % MOD ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    temp = ( perm [ i ] * pinv [ i ] ) - C ( i - 1 , val ) ;
    if ( temp < 0 ) temp += MOD ;
    System . out . println ( temp ) ;
  }
  return 0 ;
}
