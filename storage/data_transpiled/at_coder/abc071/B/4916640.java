public static void input ( Scanner in ) {
  String s = in . nextLine ( ) ;
  ArrayList < String > a = new ArrayList < String > ( Arrays . asList ( s . split ( " " ) ) ) ;
  String E = "abcdefghijklmnopqrstuvwxyz" ;
  if ( new HashSet < String > ( a ) . size ( ) == 26 ) {
    System . out . println ( "null" ) ;
  }
  else {
    int count = 0 ;
    for ( int i = 0 ;
    i < a . size ( ) ;
    i ++ ) {
      if ( a . get ( i ) . equals ( E . charAt ( i ) ) ) {
        count ++ ;
      }
      else {
        break ;
      }
    }
    System . out . println ( E . charAt ( count ) ) ;
  }
}
