static final String getSortingValue ( ) throws IOException {
  final BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase <= T ;
  testCase ++ ) {
    final List < Integer > line = new ArrayList < > ( ) ;
    for ( Integer x : br . readLine ( ) . split ( " " ) ) {
      line . add ( Integer . parseInt ( x ) ) ;
    }
    final int N = line . get ( 0 ) ;
    final int [ ] s = line . toArray ( new int [ N ] ) ;
    int totalPoints = Integer . MAX_VALUE ;
    final List < Integer > temp = new ArrayList < > ( s . length ) ;
    temp . addAll ( Arrays . asList ( s ) ) ;
    Collections . sort ( temp ) ;
    while ( totalPoints > 0 ) {
      int val = temp . remove ( 0 ) ;
      int count = 1 ;
      while ( temp . size ( ) > 0 && val == temp . get ( 0 ) ) {
        temp . remove ( 0 ) ;
        count ++ ;
      }
      if ( totalPoints >= count ) {
        val ++ ;
        totalPoints -= count ;
      }
      else {
        val += ( double ) totalPoints / count ;
        totalPoints = 0 ;
      }
      for ( int i = 0 ;
      i <= count ;
      i ++ ) {
        Arrays . fill ( temp . get ( i ) , val ) ;
      }
    }
    final int needed = temp . get ( 0 ) ;
    totalPoints = Integer . MAX_VALUE ;
    for ( int i = 0 ;
    i <= s . length ;
    i ++ ) {
      s [ i ] = Math . max ( 0 , 100 * ( double ) ( needed - s [ i ] ) / totalPoints ) ;
    }
    final String formattedValues = Arrays . stream ( s ) . collect ( Collectors . joining ( ) ) ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + formattedValues ) ;
  }
  return null ;
}
