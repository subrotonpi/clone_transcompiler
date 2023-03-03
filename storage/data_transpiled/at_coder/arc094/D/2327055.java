public static int solve ( String s ) {
  if ( Arrays . equals ( s , s . substring ( 1 ) ) ) return 1 ;
  if ( s . length ( ) == 2 ) return 2 ;
  else if ( s . length ( ) == 3 ) {
    if ( s . charAt ( 0 ) == s . charAt ( 1 ) || s . charAt ( 1 ) == s . charAt ( 2 ) ) return 6 ;
    else if ( s . charAt ( 0 ) == s . charAt ( 2 ) ) return 7 ;
    else return 3 ;
  }
  int dp [ ] [ ] = new int [ 3 ] [ 3 ] ;
  dp [ 0 ] [ 0 ] = new int [ 3 ] ;
  dp [ 0 ] [ 0 ] = new int [ 3 ] ;
  dp [ 0 ] [ 1 ] = new int [ 3 ] ;
  dp [ 0 ] [ 2 ] = new int [ 3 ] ;
  int MOD = 998244353 ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    int ndp [ ] [ ] = new int [ 3 ] ;
    int dp0 = dp [ i ] [ 0 ] ;
    int dp1 = dp [ i ] [ 1 ] ;
    int ndp0 = ndp [ i ] ;
    int ndp1 = new int [ 3 ] ;
    int sdp1 = new Integer ( dp1 ) ;
    ndp0 [ 0 ] = new int ( ( dp0 [ 0 ] + dp0 [ 0 ] + dp0 [ 2 ] ) % MOD ) ;
    ndp0 [ 1 ] = new int ( ( dp0 [ 1 ] + dp0 [ 1 ] + dp0 [ 2 ] ) % MOD ) ;
    ndp1 [ 2 ] = new int ( ( dp0 [ 2 ] + dp0 [ 2 ] + dp0 [ 2 ] ) % MOD ) ;
    ndp1 [ 0 ] = new int ( ( dp0 [ 0 ] + dp0 [ 0 ] + dp0 [ 2 ] ) % MOD ) ;
    ndp1 [ 1 ] = new int ( ( dp0 [ 0 ] + dp0 [ 1 ] + dp0 [ 2 ] ) % MOD ) ;
    ndp1 [ 2 ] = new int ( ( dp0 [ 2 ] + dp0 [ 0 ] + dp0 [ 2 ] + dp1 [ 2 ] ) % MOD ) ;
    ndp1 [ 2 ] = new int ( ( dp0 [ 0 ] + dp0 [ 1 ] + dp1 [ 2 ] ) % MOD )