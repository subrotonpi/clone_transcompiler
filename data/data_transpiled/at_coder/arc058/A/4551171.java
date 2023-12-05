public static void main ( String input ) {
  n , _ = input . split ( " " ) ;
  s = new HashSet < > ( Collections . singletonList ( input ) ) ;
  n = Integer . parseInt ( n ) ;
  System . out . println ( n + Arrays . asList ( s . toArray ( ) ) . stream ( ) . filter ( b -> b . equals ( "" ) ) . count ( ) ) ;
}
