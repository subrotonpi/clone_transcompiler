static final String solve ( ) {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  L = Integer . parseInt ( br . readLine ( ) ) ;
  D = Integer . parseInt ( br . readLine ( ) ) ;
  N = Integer . parseInt ( br . readLine ( ) ) ;
  List < String > words = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Range . of ( D ) ;
  i ++ ) words . add ( br . readLine ( ) ) ;
  List < String > tests = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Range . of ( N ) ;
  i ++ ) tests . add ( br . readLine ( ) ) ;
  tests = CollectionUtils . transform ( tests , new Function < String , String > ( ) {
    @ Override public String apply ( String input ) {
      return ( '^' + input . replace ( '(' , '[' ) . replace ( ')' , ']' ) + '$' ) ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < tests . size ( ) ;
  i ++ ) {
    String v = tests . get ( i ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + StreamUtils . stream ( ( Matcher ) words . filter ( w -> w . matches ( v ) ) . count ( ) ) . collect ( Collectors . joining ( ) ) ) ;
  }
  return v ;
}
