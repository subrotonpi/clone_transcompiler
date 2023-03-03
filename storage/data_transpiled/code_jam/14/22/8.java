@ VisibleForTesting static void solve ( ) {
  final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int B = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int cnt = 0 ;
    for ( int a = 0 ;
    a < A ;
    a ++ ) {
      for ( int b = 0 ;
      b < B ;
      b ++ ) {
        if ( ( a & b ) < K ) {
          cnt ++ ;
        }
      }
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + cnt ) ;
  }
}
