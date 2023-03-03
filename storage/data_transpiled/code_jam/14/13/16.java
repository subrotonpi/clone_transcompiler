public static final int getThreshold ( ) throws IOException {
  final int threshold = 400 ;
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  for ( int t = 1 ;
  t <= Integer . MAX_VALUE ;
  t ++ ) {
    final int N = Integer . parseInt ( br . readLine ( ) ) ;
    final int s = Integer . parseInt ( br . readLine ( ) ) ;
    int tooClose = 0 ;
    for ( int index = 0 ;
    index < N ;
    index ++ ) {
      final int i = s ;
      final int diff = i - index ;
      if ( diff <= 200 && diff >= 0 ) {
        tooClose ++ ;
      }
    }
    if ( tooClose >= 200 ) {
      System . out . println ( "Case #" + t + ": BAD" ) ;
    }
    else {
      System . out . println ( "Case #" + t + ": GOOD" ) ;
    }
  }
  return t ;
}
