public static int solve ( String s ) {
  if ( s . length ( ) == 2 ) {
    return s . charAt ( 0 ) == s . charAt ( 1 ) ? 1 : 2 ;
  }
  else if ( s . length ( ) == 3 ) {
    if ( s . charAt ( 0 ) == s . charAt ( 1 ) == s . charAt ( 2 ) ) {
      return 1 ;
    }
    else if ( s . charAt ( 0 ) == s . charAt ( 1 ) || s . charAt ( 1 ) == s . charAt ( 2 ) ) {
      return 6 ;
    }
    else if ( s . charAt ( 0 ) == s . charAt ( 2 ) ) {
      return 7 ;
    }
    else {
      return 3 ;
    }
  }
  if ( Arrays . equals ( s , s ) ) {
    return 1 ;
  }
  int [ ] [ ] dp = new int [ 3 ] [ 2 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    dp [ i ] [ 0 ] = dp [ i ] [ 1 ] + dp [ i ] [ 2 ] [ 0 ] ;
  }
  dp [ 0 ] [ 0 ] = 1 ;
  dp [ 0 ] [ 1 ] = 1 ;
  dp [ 0 ] [ 2 ] = 1 ;
  int MOD = 998244353 ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    int [ ] [ ] ndp = new int [ 3 ] [ 2 ] ;
    for ( int j = 0 ;
    j < dp [ i ] [ 0 ] ;
    j ++ ) {
      ndp [ i ] [ j ] = dp [ i ] [ j ] [ 1 ] + dp [ i ] [ 2 ] [ 0 ] ;
    }
    dp [ i ] [ 0 ] = dp [ i ] [ 2 ] ;
    dp [ i ] [ 1 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 1 ] + dp [ i ] [ 2 ] [ 1 ] ) % MOD ;
    ndp [ i ] [ 2 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 2 ] [ 0 ] + dp [ i ] [ 1 ] [ 2 ] ) % MOD ;
    ndp [ i ] [ 2 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 1 ] [ 2 ] ) % MOD ;
    ndp [ i ] [ 2 ] = ( dp [ i ] [ 0 ] + dp [ i ] [ 2 ] [ 1 ] ;
    