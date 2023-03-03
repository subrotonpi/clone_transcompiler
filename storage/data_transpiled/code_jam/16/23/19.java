public static final String getMatchingName ( ) throws IOException {
  final BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int numOfTests = Integer . parseInt ( bufferedReader . readLine ( ) ) ;
  for ( int i = 0 ;
  i < numOfTests ;
  i ++ ) {
    final int numOfTitles = Integer . parseInt ( bufferedReader . readLine ( ) ) ;
    final Map < String , List < String >> titles = new HashMap < > ( ) ;
    final Set < String > firstTitles = new HashSet < > ( ) ;
    final Set < String > secondTitles = new HashSet < > ( ) ;
    for ( int j = 0 ;
    j < numOfTitles ;
    j ++ ) {
      final String [ ] title = bufferedReader . readLine ( ) . substring ( 0 , bufferedReader . readLine ( ) . length ( ) - 1 ) . split ( "\\s+" ) ;
      firstTitles = firstTitles . stream ( ) . map ( title -> {
        firstTitles . add ( title [ 0 ] ) ;
        secondTitles . add ( title [ 1 ] ) ;
      }
      ) . collect ( Collectors . toSet ( ) ) ;
      if ( titles . containsKey ( title [ 0 ] ) ) {
        titles . get ( title [ 0 ] ) . add ( title [ 1 ] ) ;
      }
      else {
        titles . put ( title [ 0 ] , new ArrayList < > ( Arrays . asList ( title [ 1 ] ) ) ) ;
      }
    }
    final List < String > matching = bipartiteMatching ( titles ) . get ( 0 ) ;
    final int lenM = matching . size ( ) ;
    final int lenF = firstTitles . size ( ) ;
    final int lenS = secondTitles . size ( ) ;
    final int cover = lenF + lenS - lenM ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + ( numOfTitles - cover ) + " " ) ;
  }
  return new String ( titles . values ( ) ) ;
}
