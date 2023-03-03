public static int atcodeerAndPaintCans ( @ Nonnull int a , @ Nonnull int b , @ Nonnull int c ) {
  return new HashSet < > ( Arrays . asList ( a , b , c ) ) . size ( ) ;
  if ( getClass ( ) . equals ( String . class ) ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    c = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = atcodeerAndPaintCans ( a , b , c ) ;
    System . out . println ( ans ) ;
  }
  return 0 ;
}
