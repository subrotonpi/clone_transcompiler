public static int [ ] getAlphabet ( ) {
  int N = Integer . parseInt ( input ( ) ) , K = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < 65 ;
  i ++ ) A [ i ] = i ;
  int [ ] memo = new int [ 65 ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) memo [ i ] = 0 ;
  int [ ] AA = new int [ A . length ] ;
  for ( int i = 0 ;
  i < AA . length ;
  i ++ ) AA [ i ] = A [ i ] ;
  for ( int i = 0 ;
  i < AA . length ;
  i ++ ) {
    int r = 0 ;
    while ( i > 0 ) {
      if ( ( ( i & 1 ) == 1 ) && ( ( ( i & 1 ) == 0 ) || ( ( i & 1 ) == 1 ) ) ) memo [ r ] = memo [ r ] + 1 ;
      i = i / 2 ;
      r = r + 1 ;
    }
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    if ( 2 * memo [ i ] < N ) res = res ^ ( 1 << i ) ;
  }
  int d = 51 ;
  while ( d > 0 ) {
    if ( ( res >>> d ) && ( ( d & 1 ) == 1 ) ) res = res ^ ( 1 << d ) ;
    d = d - 1 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) ans = ans + ( res ^ A [ i ] ) ;
  return ans ;
}
