@ VisibleForTesting static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int M = input . nextInt ( ) ;
  final int [ ] dp = new int [ N + 1 ] ;
  final List < Integer > sTList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int s = input . nextInt ( ) ;
    int t = input . nextInt ( ) ;
    s -- ;
    t -- ;
    sTList . add ( new Integer ( s ) ) ;
    sTList . add ( new Integer ( t ) ) ;
    dp [ s ] ++ ;
    dp [ t + 1 ] -- ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dp [ i + 1 ] += dp [ i ] ;
    dp [ i ] = dp [ i ] >= 2 ? 1 : 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( dp [ i + 1 ] != 0 ) dp [ i + 1 ] += dp [ i ] ;
  }
  final List < Integer > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < sTList . size ( ) ;
  i ++ ) {
    final int s = sTList . get ( i ) ;
    final int t = sTList . get ( i ) ;
    if ( dp [ t ] - dp [ s ] == t - s && dp [ t ] != 0 && dp [ s ] != 0 ) ans . add ( i ) ;
  }
  System . out . println ( ans . size ( ) ) ;
  if ( ans . size ( ) > 0 ) System . out . println ( ( Integer ) ans . get ( 0 ) ) ;
}
