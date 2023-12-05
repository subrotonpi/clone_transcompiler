static final void debug ( Object ... args ) {
  final System . err . println ( args ) ;
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final String moods = fin . readLine ( ) . trim ( ) ;
    int points = 0 ;
    final List < Character > list = new ArrayList < > ( ) ;
    last = null ;
    for ( int i = 0 ;
    i < moods . length ( ) ;
    i ++ ) {
      final char c = moods . charAt ( i ) ;
      if ( list . isEmpty ( ) || list . get ( list . size ( ) - 1 ) != c ) {
        list . add ( c ) ;
      }
      else {
        list . remove ( list . size ( ) - 1 ) ;
        points += 10 ;
      }
    }
    points += list . size ( ) / 2 * 5 ;
    System . err . println ( "Case #" + testCase + ": " + points ) ;
  }
}
