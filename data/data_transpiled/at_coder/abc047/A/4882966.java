public static boolean fightingOverCandies ( @ Nonnull int a , @ Nonnull int b , @ Nonnull int c ) {
  return ( a + b ) == c || ( b + c ) == a || ( c + a ) == b ;
}
if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean yes = fightingOverCandies ( a , b , c ) ;
  System . out . println ( yes ? "Yes" : "No" ) ;
}
