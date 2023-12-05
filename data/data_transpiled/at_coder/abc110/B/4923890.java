private static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < Integer > c1 = new HashSet < Integer > ( ) ;
  Set < Integer > c2 = new HashSet < Integer > ( ) ;
  return c1 . stream ( ) . filter ( x -> y ) . filter ( y -> y ) . collect ( Collectors . toSet ( ) ) ;
}
