public static void main ( String [ ] args ) {
  final int numTests = Integer . parseInt ( args [ 0 ] ) ;
  for ( int caseNo = 1 ;
  caseNo <= numTests ;
  caseNo ++ ) {
    final int N = Integer . parseInt ( args [ caseNo ] ) ;
    final int K = Integer . parseInt ( args [ caseNo ] ) ;
    final int B = Integer . parseInt ( args [ caseNo ] ) ;
    final int T = Integer . parseInt ( args [ caseNo ] ) ;
    final int [ ] X = Integer . parseInt ( args [ caseNo ] ) ;
    final int [ ] V = Integer . parseInt ( args [ caseNo ] ) ;
    final boolean [ ] bad = new boolean [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      bad [ i ] = ( B - X [ i ] > T * V [ i ] ) ;
    }
    final int [ ] costs = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( bad [ i ] ) continue ;
      int cost = 0 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( bad [ j ] && V [ j ] < V [ i ] && X [ j ] > X [ i ] ) {
          cost ++ ;
        }
      }
      costs [ i ] = cost ;
    }
    Arrays . sort ( costs ) ;
    final String ans ;
    if ( costs . length < K ) ans = "IMPOSSIBLE" ;
    else ans = Arrays . toString ( costs , 0 , K ) ;
    System . out . println ( "Case #" + caseNo + ": " + ans ) ;
  }
}
