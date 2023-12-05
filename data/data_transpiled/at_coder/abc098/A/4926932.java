public static void print ( String [ ] s ) {
  s = Arrays . stream ( input . split ( " " ) ) . map ( i -> Integer . parseInt ( i ) ) . collect ( Collectors . toList ( ) ) ;
  List < Integer > l = Arrays . asList ( s [ 0 ] + s [ 1 ] , s [ 0 ] - s [ 1 ] , s [ 0 ] * s [ 1 ] ) ;
  System . out . println ( max ( l ) ) ;
}
