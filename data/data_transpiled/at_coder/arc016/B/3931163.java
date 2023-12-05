public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  int [ ] memo = new int [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    memo [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String l = input . next ( ) ;
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( ( l . charAt ( j ) != 'o' ) || ( i == ( N - 1 ) ) ) {
        ans += memo [ j ] ;
        memo [ j ] = 0 ;
      }
      else {
        memo [ j ] = 1 ;
      }
    }
    ans += l . indexOf ( "x" ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
