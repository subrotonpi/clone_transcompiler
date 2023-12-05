public static final String getInput ( ) {
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
    final int maxA = max ( A ) ;
    final int minA = min ( A ) ;
    final int maxA = max ( A ) ;
    if ( maxA - minA >= 2 ) {
      return "No" ;
    }
    else if ( minA * 2 <= N ) {
      return "Yes" ;
    }
  }
}
