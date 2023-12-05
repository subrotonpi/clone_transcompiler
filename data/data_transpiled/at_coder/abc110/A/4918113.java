public static void print ( String s ) {
  l = Arrays . asList ( input . split ( s ) ) ;
  l . sort ( ) ;
  int a = ( int ) ( l . length - 1 + l . length ) ;
  System . out . println ( a + ( int ) l . length ) ;
}
