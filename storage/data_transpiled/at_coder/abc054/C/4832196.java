public static int oneStrokePath ( @ Nonnegative int N , int M , @ Nonnull List < Edge > edges ) {
  int [ ] [ ] g = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    g [ i ] = new int [ N ] ;
    for ( int u = 0 ;
    u < edges . size ( ) ;
    u ++ ) {
      g [ i ] [ u ] = edges . get ( u ) . getSecond ( ) - 1 ;
    }
  }
  boolean [ ] visited = new boolean [ N ] ;
  visited [ 0 ] = true ;
  {
    int current = 0 ;
    int visitedNum = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      visited [ i ] = false ;
    }
    int total = 0 ;
    for ( int i = 0 ;
    i < visited . length ;
    i ++ ) {
      int to = visited [ i ] ? g [ i ] [ 0 ] : 0 ;
      if ( ! visited [ to ] ) {
        return 1 ;
      }
      visited [ to ] = true ;
      total = sum ( dfs ( to , visitedNum + 1 ) , g [ i ] ) ;
      visited [ to ] = false ;
    }
    return total ;
  }
}
