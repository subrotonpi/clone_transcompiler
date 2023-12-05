public static int input ( int N , int X ) {
  N = Integer . parseInt ( input ) ;
  X = Integer . parseInt ( X , 2 ) ;
  int p = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int v = Integer . parseInt ( input ) ;
    if ( p > v ) {
      p = v ;
    }
    int q ;
    while ( 0 < p ) {
      q = ( v ^ ( p << ( v >>> ( v - p ) ) ) ) ;
      if ( p < q ) {
        p = q ;
      }
      else {
        p = q ;
      }
    }
    p = v ;
  }
  int lx = X >>> 1 ;
  int lp = p << 1 ;
  int MOD = 998244353 ;
  int ans = ( X >>> ( p - 1 ) ) % MOD ;
  int q = p << 1 ;
  for ( int k = lx - lp ;
  k >= 0 ;
  k -- ) {
    if ( ( b & ( X ^ y ) ) != 0 ) {
      y ^= q ;
    }
    b >>= 1 ;
    q >>= 1 ;
  }
  if ( y <= X ) {
    ans = ( ans + 1 ) % MOD ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
