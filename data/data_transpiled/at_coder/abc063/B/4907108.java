static final LinkedHashMap < String , Integer > getCounts ( ) {
  String s = input . nextLine ( ) ;
  Counter < String > c = new ClassicCounter < String > ( s ) ;
  if ( c . getCount ( ) != 1 ) {
    System . out . println ( "no" ) ;
  }
  else {
    System . out . println ( "yes" ) ;
  }
  return c ;
}
