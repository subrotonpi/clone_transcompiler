@ VisibleForTesting static LinkedHashMap < Integer , Double > map ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  /* inpl */
  final LinkedHashMap < Integer , Double > inpls = new LinkedHashMap < > ( ) ;
  /* inpls */
  final double func = Double . parseDouble ( input ) ;
  final int N = Integer . parseInt ( input ) ;
  final int L = String . valueOf ( N ) . length ( ) ;
  final int MIN = Math . max ( N - 9 * L , 1 ) ;
  final ArrayList < Integer > ans = new ArrayList < > ( ) ;
  for ( int n = MIN ;
  n <= N ;
  n ++ ) {
    if ( n + func ( n ) == N ) {
      ans . add ( n ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( int a : ans ) {
    System . out . println ( a ) ;
  }
  return ans ;
}
