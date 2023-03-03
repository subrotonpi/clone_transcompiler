@ VisibleForTesting static int getOne ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final String C = input . nextLine ( ) ;
  final List < Pair > ss = Lists . newArrayList ( ) ;
  ss . add ( "ABXY" ) ;
  int ans = N ;
  for ( Pair l : ss ) {
    final Pair r = l . getSecond ( ) ;
    int i = 0 ;
    int tmp = 0 ;
    while ( i < N - 1 ) {
      if ( l . first ( ) == C . charAt ( i ) && l . second ( ) == C . charAt ( i + 1 ) ) {
        tmp ++ ;
        i += 2 ;
      }
      else if ( r . first ( ) == C . charAt ( i ) && r . second ( ) == C . charAt ( i + 1 ) ) {
        tmp ++ ;
        i += 2 ;
      }
      else {
        tmp ++ ;
        i ++ ;
      }
    }
    if ( i == N - 1 ) tmp ++ ;
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
