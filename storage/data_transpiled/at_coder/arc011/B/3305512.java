public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] wn = input . nextLine ( ) . split ( " " ) ;
  List < String > strnums = new ArrayList < String > ( ) ;
  for ( String w : wn ) {
    strnums . add ( wordToStrNumbers ( w ) ) ;
  }
  strnums = new ArrayList < String > ( ) ;
  for ( String s : strnums ) {
    if ( s != "" ) {
      System . out . println ( Arrays . toString ( strnums ) ) ;
    }
  }
  {
    Map < String , String > di = new HashMap < String , String > ( ) ;
    di . put ( "b" , "1" ) ;
    di . put ( "c" , "1" ) ;
    di . put ( "d" , "2" ) ;
    di . put ( "w" , "2" ) ;
    di . put ( "t" , "3" ) ;
    di . put ( "j" , "3" ) ;
    di . put ( "f" , "4" ) ;
    di . put ( "q" , "4" ) ;
    di . put ( "l" , "5" ) ;
    di . put ( "v" , "5" ) ;
    di . put ( "s" , "6" ) ;
  }
}
