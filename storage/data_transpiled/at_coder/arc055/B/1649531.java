@ VisibleForTesting static void main ( String [ ] args ) {
  final double INF = Double . MAX_VALUE ;
  final Scanner input = new Scanner ( System . in ) ;
  final double N = input . nextDouble ( ) ;
  final int K = input . nextInt ( ) ;
  final double [ ] [ ] dp = new double [ K + 2 ] [ N + 1 ] ;
  for ( int j = 0 ;
  j < N + 1 ;
  j ++ ) {
    dp [ j ] [ 0 ] = 0 ;
    dp [ j ] [ 1 ] = 1 ;
  }
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      final double p = 1 / ( i + 1 ) ;
      final double a = p * Math . max ( dp [ i + 1 ] [ j + 1 ] [ 1 ] , dp [ i + 1 ] [ j ] [ 0 ] ) ;
      dp [ i ] [ j ] [ 1 ] = ( 1 - p ) * dp [ i + 1 ] [ j ] [ 1 ] + a ;
      dp [ i ] [ j ] [ 0 ] = ( 1 - p ) * dp [ i + 1 ] [ j ] [ 0 ] + a ;
    }
  }
  System . out . println ( dp [ 0 ] [ 0 ] [ 0 ] ) ;
}
