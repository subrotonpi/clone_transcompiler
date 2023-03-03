static public String [ ] checkq ( String s ) throws IOException {
  final HashMap < String , String > qmap = new HashMap < String , String > ( ) ;
  qmap . put ( "1" , "-" ) ;
  qmap . put ( "-" , "1" ) ;
  qmap . put ( "i" , "I" ) ;
  qmap . put ( "I" , "i" ) ;
  qmap . put ( "j" , "J" ) ;
  qmap . put ( "j" , "J" ) ;
  qmap . put ( "k" , "K" ) ;
  qmap . put ( "K" , "k" ) ;
  return qmap . get ( s ) ;
}
