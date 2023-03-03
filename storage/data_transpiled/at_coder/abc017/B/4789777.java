static final String input ( ) {
  String s = input ( ) ;
  if ( s . equals ( "" ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    String regex = rr '^((ch)|[oku])+$' ;
    Pattern pattern = Pattern . compile ( regex ) ;
    Matcher matchMatcher = pattern . matcher ( s ) ;
    System . out . println ( matchMatcher . matches ( ) ? "YES" : "NO" ) ;
  }
  return s ;
}
