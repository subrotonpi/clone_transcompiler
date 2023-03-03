@ VisibleForTesting static Statistics statistics ( double mean , double median , double variance , double stdev ) {
  final double [ ] a = new double [ n ] ;
  final int i ;
  final int j = 0 ;
  final int q = Math . min ( mean , a . length ) ;
  for ( int q = 0 ;
  q < n ;
  q ++ ) {
    if ( q == 1 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
    exit ( 0 ) ;
  }
  return new Statistics ( j , a ) ;
}
