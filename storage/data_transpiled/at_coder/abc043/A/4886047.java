public static int childrenAndCandies ( @ Nonnull int N ) {
  return N * ( N + 1 ) / 2 ;
  if ( getClass ( ) . equals ( String . class ) ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    int ans = childrenAndCandies ( N ) ;
    System . out . println ( ans ) ;
  }
  return N ;
}
