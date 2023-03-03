@ VisibleForTesting static int from ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = Integer . MAX_VALUE ;
  for ( int a = 1 , b = 11 ;
  a < N ;
  a ++ , b ++ ) {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( i % 2 == 0 && A [ i ] != a ) tmp += C ;
      if ( i % 2 == 1 && A [ i ] != b ) tmp += C ;
    }
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
