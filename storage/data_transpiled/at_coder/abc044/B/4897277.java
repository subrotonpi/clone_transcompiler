public static final String pattern = "[a-z]+$" ;
String w = input . readLine ( ) ;
boolean result = w . matches ( pattern ) ;
if ( result ) {
  Set < String > wSet = new HashSet < String > ( Collections . singleton ( w ) ) ;
  for ( String word : wSet ) {
    int counter = w . indexOf ( word ) ;
    if ( counter % 2 == 1 ) {
      System . out . println ( "No" ) ;
      break ;
    }
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
else {
  System . out . println ( "No" ) ;
}
return w ;
}
