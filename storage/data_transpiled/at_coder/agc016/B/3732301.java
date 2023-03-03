static final String getInput ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final double INF = Double . MAX_VALUE ;
  final double MOD = 10 * 9 + 7 ;
  {
    final List < Integer > inpl = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < input . length ( ) ;
    i ++ ) {
      inpl . add ( Integer . parseInt ( input . substring ( i , i + 1 ) ) ) ;
    }
  }
  {
    final int N = Integer . parseInt ( input ) ;
    final List < Integer > A = inpl . get ( ) ;
    final int maxA = Collections . max ( A ) ;
    final int minA = Collections . min ( A ) ;
    final List < Integer > numCnt = Lists . newArrayList ( A ) ;
    if ( maxA - minA > 1 ) {
      return "No" ;
    }
    if ( numCnt . size ( ) == 1 ) {
      if ( maxA == N - 1 || 2 * maxA <= N ) {
        return "Yes" ;
      }
      else {
        return "No" ;
      }
    }
  }
}
