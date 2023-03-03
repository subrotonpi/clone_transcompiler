static final Scanner IO = new Scanner ( System . in ) {
  private final Scanner in = new Scanner ( System . in ) ;
  private int maxMatching ( int [ ] [ ] G ) {
    final int N = G . length ;
    final int [ ] ymatch = new int [ N ] ;
    Arrays . fill ( ymatch , - 1 ) ;
    final boolean [ ] seen = new boolean [ N ] ;
    /* dfs the first match */
    if ( seen [ N ] ) {
      return 0 ;
    }
    seen [ N ] = 1 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( G [ i ] [ j ] && ( ( ymatch [ j ] == - 1 ) || dfs ( ymatch [ j ] ) ) ) {
        ymatch [ j ] = i ;
        return 1 ;
      }
    }
    return 0 ;
  }
  private int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    seen [ i ] = 0 ;
    res += dfs ( i ) ;
  }
  private boolean Less ( int [ ] a , int [ ] b ) {
    assert a . length == b . length ;
    return Arrays . binarySearch ( a , b ) < 0 ;
  }
}
