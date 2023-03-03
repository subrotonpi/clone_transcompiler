@ VisibleForTesting static int from ( ) {
  int ans = 10 * 9 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] m = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < 1 << N ;
  i ++ ) {
    int a = 0 , b = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 0 ) {
        a += m [ j ] ;
      }
      else {
        b += m [ j ] ;
      }
    }
    ans = Math . min ( ans , Math . max ( a , b ) ) ;
  }
  return ans ;
}
