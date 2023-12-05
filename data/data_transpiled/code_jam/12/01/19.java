static final String getStdIn ( ) {
  String a = "ejp mysljylc kd kxveddknmc re jsicpdrysi" + "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd" ;
  String b = "our language is impossible to understand" + "there are twenty six factorial possibilities" ;
  HashMap < String , String > h = new HashMap < String , String > ( ) ;
  for ( int i = 0 ;
  i < a . length ( ) ;
  i ++ ) {
    h . put ( a . charAt ( i ) , b . charAt ( i ) ) ;
  }
  h . put ( 'q' , 'z' ) ;
  for ( int caseIndex = 1 ;
  caseIndex <= 1 ;
  caseIndex ++ ) {
    System . err . print ( String . valueOf ( caseIndex ) + ' ' ) ;
    String res = StringUtils . toString ( h . get ( caseIndex ) ) ;
    System . out . println ( ) ;
  }
  return a ;
}
