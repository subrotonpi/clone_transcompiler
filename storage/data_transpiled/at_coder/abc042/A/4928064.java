public static void main ( String [ ] args ) {
  ArrayList < Integer > a = new ArrayList < Integer > ( Arrays . asList ( input . split ( " " ) ) ) ;
  if ( a . size ( ) == 5 || a . size ( ) == 7 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
