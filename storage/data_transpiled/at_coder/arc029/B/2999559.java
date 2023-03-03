@ VisibleForTesting static LinkedHashMap < String , Double > map ( ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * 9 + 7 ;
  final double eps = 10 * - 7 ;
  final double PI = Math . PI ;
  final char [ ] AtoZ = new char [ 65 ] ;
  final char [ ] atoz = new char [ 97 ] ;
  for ( int i = 65 ;
  i < 65 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  for ( int i = 97 ;
  i < 97 + 26 ;
  i ++ ) AtoZ [ i ] = ( char ) i ;
  /* inpl */
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final int B = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Math . min ( A , B ) ;
  B = Math . max ( A , B ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final double phi = Math . atan ( A / B ) ;
  final double r = Math . sqrt ( A * A + B * B ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int C = Integer . parseInt ( input . nextLine ( ) ) ;
    final int D = Integer . parseInt ( input . nextLine ( ) ) ;
    C = Math . min ( C , D ) ;
    D = Math . max ( C , D ) ;
    if ( A <= C && B <= D ) System . out . println ( "YES" ) ;
    else if ( C < A && B < D ) System . out . println ( "NO" ) ;
    else {
      double OK = 0 ;
      double NG = PI - phi ;
      for ( int j = 0 ;
      j < 100 ;
      j ++ ) {
        final double mid = ( OK + NG ) / 2 ;
        final double h = r * Math . sin ( mid + phi ) ;
        if ( h <= D ) OK = mid ;
        else NG = mid ;
        final double w = r * Math . cos ( OK - phi ) ;
        if ( w <= C ) System . out . println ( "YES" ) ;
        else System . out . println ( "NO" ) ;
      }
    }
  }
  return new LinkedHashMap < String , Double > ( ) ;
}
