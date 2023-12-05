public static int MOD = 10 * * 9 + 7 ;
int n = Integer . parseInt ( input ) ;
int A = 0 , C = 1 , G = 2 , T = 3 ;
int [ ] [ ] [ ] dp = new int [ 4 ] [ 4 ] [ 4 ] ;
for ( int i = 0 ;
i < n + 1 ;
i ++ ) {
  dp [ 3 ] [ A ] [ G ] [ C ] = 0 ;
  dp [ 3 ] [ A ] [ C ] [ G ] = 0 ;
  dp [ 3 ] [ A ] [ C ] [ G ] = 0 ;
  dp [ 3 ] [ G ] [ A ] [ C ] = 0 ;
  for ( int i = 4 ;
  i <= n ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      for ( int k = 0 ;
      k < 4 ;
      k ++ ) {
        for ( int l = 0 ;
        l < 4 ;
        l ++ ) {
          dp [ i ] [ j ] [ k ] [ l ] = 0 ;
          for ( int h = 0 ;
          h < 4 ;
          h ++ ) {
            if ( l == C ) {
              if ( h == A && k == G ) continue ;
              if ( h == A && j == G ) continue ;
            }
            dp [ i ] [ j ] [ k ] [ l ] += dp [ i - 1 ] [ h ] [ j ] [ k ] ;
          }
          dp [ i ] [ j ] [ k ] [ l ] %= MOD ;
        }
      }
    }
    dp [ i ] [ A ] [ G ] [ C ] = 0 ;
    dp [ i ] [ A ] [ C ] [ G ] = 0 ;
    dp [ i ] [ G ] [ A ] [ C ] = 0 ;
  }
  int ans = 0 ;
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) {
    for ( int k = 0 ;
    k < 4 ;
    k ++ ) {
      for ( int l = 0 ;
      l < 4 ;
      l ++ ) {
        ans += dp [ n ] [ j ] [ k ] [ l ] ;
        ans %= MOD ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
