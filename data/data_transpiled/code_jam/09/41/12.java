static List < List < String >> readInput ( ) throws IOException {
  BufferedReader file = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  int testCaseCount = Integer . parseInt ( file . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
  List < List < String >> testCases = new ArrayList < List < String >> ( ) ;
  for ( int i = 0 ;
  i <= testCaseCount ;
  i ++ ) {
    int lineCount = Integer . parseInt ( file . readLine ( ) . replaceAll ( "\\s+" , "" ) ) ;
    List < String > lines = new ArrayList < String > ( lineCount ) ;
    for ( int j = 0 ;
    j <= lineCount ;
    j ++ ) {
      lines . add ( file . readLine ( ) . replaceAll ( "0" , "" ) ) ;
    }
    testCases . add ( lines ) ;
  }
  /* Number of sort steps */
  int steps = 0 ;
  boolean stop = false ;
  for ( int lineNr = 0 ;
  stop && lineNr < testCases . size ( ) ;
  lineNr ++ ) {
    for ( int targetLineNr = lineNr ;
    targetLineNr < testCases . size ( ) ;
    targetLineNr ++ ) {
      if ( testCases . get ( targetLineNr ) . compareTo ( testCases . get ( lineNr ) ) <= 0 ) {
        testCases . add ( lineNr , testCases . remove ( targetLineNr ) ) ;
        steps += targetLineNr - lineNr ;
        break ;
      }
    }
  }
  return steps ;
}
