public static void input ( ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < String > a = new TreeSet < String > ( new HashSet < String > ( Arrays . asList ( s . split ( " " ) ) ) ) . subList ( 0 , 5 ) ;
  if ( s . length ( ) >= 2 ) {
    Set < String > b = new TreeSet < String > ( new HashSet < String > ( Arrays . asList ( s . split ( " " ) ) ) ) . subList ( 0 , 5 ) ;
    a . addAll ( b ) ;
  }
  if ( s . length ( ) >= 3 ) {
    Set < String > c = new TreeSet < String > ( new HashSet < String > ( Arrays . asList ( s . split ( " " ) ) ) ) . subList ( 0 , 5 ) ;
    a . addAll ( c ) ;
  }
  if ( s . length ( ) >= 4 ) {
    Set < String > d = new TreeSet < String > ( new HashSet < String > ( Arrays . asList ( s . split ( " " ) ) ) ) . subList ( 0 , 5 ) ;
    a . addAll ( d ) ;
  }
  if ( s . length ( ) >= 5 ) {
    Set < String > e = new TreeSet < String > ( new HashSet < String > ( Arrays . asList ( s . split ( " " ) ) ) ) ;
    a . addAll ( e ) ;
  }
  System . out . println ( new ArrayList < String > ( a ) . get ( k - 1 ) ) ;
}
