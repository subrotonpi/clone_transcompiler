static final void debug ( String ... args ) {
  final String s = "" ;
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . readLine ( ) ) ;
    final int [ ] heap = new int [ N ] ;
    int hikers = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int d = Integer . parseInt ( fin . readLine ( ) ) ;
      final int h = Integer . parseInt ( fin . readLine ( ) ) ;
      final int m = Integer . parseInt ( fin . readLine ( ) ) ;
      for ( int p = m ;
      p < m + h ;
      p ++ ) {
        final double t = p * ( 360 - d ) / 360.0 ;
        heapify ( heap , t , 1 , p ) ;
        hikers ++ ;
      }
    }
    int current = hikers ;
    int least = current ;
    while ( current <= hikers * 2 ) {
      final int [ ] token = heapify ( heap , 0 , current ) ;
      final int t = token [ 0 ] ;
      final int d = token [ 1 ] ;
      final int p = token [ 2 ] ;
      current -= d ;
      least = Math . min ( current , least ) ;
      heapify ( heap , t + p , - 1 , p ) ;
    }
    final int result = least ;
    debug ( "Case " + testCase ) ;
    System . out . println ( "Case #" + testCase + ": " + result ) ;
  }
}
