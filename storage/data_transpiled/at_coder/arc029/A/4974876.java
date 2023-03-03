public static int N = Integer . parseInt ( input ) {
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int ans = 200 ;
  for ( int bit = 0 ;
  bit < 2 * N ;
  bit ++ ) {
    int ans1 = 0 , ans2 = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( ( bit & ( 1 << i ) ) != 0 ) {
        ans1 += t [ i ] ;
      }
      else {
        ans2 += t [ i ] ;
      }
    }
    ans = Math . min ( ans , Math . max ( ans1 , ans2 ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
