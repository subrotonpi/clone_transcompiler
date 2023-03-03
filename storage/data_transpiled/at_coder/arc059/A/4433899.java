public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = Integer . MAX_VALUE ;
  for ( int i = - 100 ;
  i < 101 ;
  i ++ ) {
    int tmp = 0 ;
    for ( int a : A ) {
      tmp += ( a - i ) * ( a - i ) ;
    }
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
