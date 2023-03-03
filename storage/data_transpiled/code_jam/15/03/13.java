@ Nonnull public static Iterable < String > accumulate ( @ Nonnull final Predicate < String > qmul ) {
  final Predicate < String > mul = a -> a ^ b ^ ( a & 6 == b & 6 ) ^ ( 6 * ( a / 2 ^ a / 4 ) & 6 == b & 6 ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    int rep = Integer . parseInt ( input . nextLine ( ) . split ( " " ) [ 1 ] ) ;
    rep = Math . min ( rep , rep % 4 + 8 ) ;
    final List < String > list = accumulate ( ( ) -> 2 * ( Character . getNumericValue ( input . charAt ( 0 ) ) - 208 ) , mul ) ;
    final String ans = 2 == seq && 6 == seq && list . size ( ) - 1 == 1 ? "YES" : "NO" ;
    System . out . println ( "Case #" + testCase + ": " + ans ) ;
  }
  return list ;
}
