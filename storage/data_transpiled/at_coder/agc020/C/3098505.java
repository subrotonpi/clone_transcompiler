@ VisibleForTesting static void inpl ( ) {
  final double INF = Double . MAX_VALUE ;
  final double mod = 10 * * 9 + 7 ;
  final double eps = 10 * * - 7 ;
  {
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final int [ ] aa = inpl ( N ) ;
    int b = 1 ;
    for ( int a : aa ) {
      b |= b << a ;
    }
    final int S = Integer . parseInt ( aa [ 0 ] ) ;
    final int half = ( S + 1 ) / 2 ;
    b >>= half ;
    System . out . println ( ( b & - b ) . bitLength ( ) + half - 1 ) ;
  }
}
