@ SneakyThrows ( ClassCastException . class ) public static String sbef ( @ Cast ( "char[]" ) String input ) {
  char [ ] d = String . valueOf ( input . toCharArray ( ) ) ;
  Comparator < String > tr = new Comparator < String > ( ) {
    @ Override public int compare ( String n , String n ) {
      return ( Integer . parseInt ( n . replaceAll ( "\\s" , "" ) ) ) ;
    }
  }
  ;
  int n = Integer . parseInt ( input . toCharArray ( ) ) ;
  String [ ] a = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . toCharArray ( ) ;
  }
  Arrays . sort ( a , tr ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a [ 0 ] ;
}
