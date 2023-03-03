@ VisibleForTesting static LinkedHashMap < Integer , Double > map ( String input ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  /* inpl */
  final List < Integer > inpl = Lists . newArrayList ( ) ;
  /* inplS */
  final List < Double > inplS = Lists . newArrayList ( ) ;
  /* Comb */
  final int n = input . length ( ) ;
  /* Comb */
  final double [ ] gyakugen = new double [ n + 1 ] ;
  final double [ ] fac = new double [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) fac [ i ] = ( fac [ i - 1 ] * i ) % mod ;
  gyakugen [ n ] = Math . pow ( fac [ n ] , mod - 2 , mod ) ;
  for ( int i = n ;
  i > 0 ;
  i -- ) gyakugen [ i - 1 ] = ( gyakugen [ i ] * gyakugen [ n - i ] ) % mod ;
  /* Comb */
  final int N = Integer . parseInt ( input ) ;
  final int k = Integer . parseInt ( input ) ;
  System . out . println ( Comb ( N + k - 1 , k ) ) ;
  return new LinkedHashMap < > ( ) {
  }
  ;
}
