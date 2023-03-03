public static String A = new LinkedList < String > ( ) {
  @ Override public String get ( ) {
    return input . next ( ) ;
  }
}
;
String B = new LinkedList < String > ( ) {
  @ Override public String get ( ) {
    return input . next ( ) ;
  }
}
;
String C = new LinkedList < String > ( ) {
  @ Override public String get ( ) {
    return input . next ( ) ;
  }
}
;
Map < String , String > cards = new HashMap < String , String > ( ) ;
cards . put ( "a" , A ) ;
cards . put ( "b" , B ) ;
cards . put ( "c" , C ) ;
String s = A . remove ( ) ;
while ( ( s = cards . get ( s ) ) != null ) {
  try {
    s = cards . get ( s ) . remove ( ) ;
  }
  catch ( NoSuchElementException e ) {
    System . out . println ( s . toUpperCase ( ) ) ;
    exit ( ) ;
  }
}
