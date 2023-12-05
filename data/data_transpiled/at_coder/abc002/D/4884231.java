public static void dfs ( int n , int m ) {
  int [ ] [ ] xy = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) xy [ i ] = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) xy [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) xy [ i ] [ i ] = new int [ n ] ;
  cand = new ArrayList < > ( ) ;
  /*dfs(i, arr);*/
  if ( i == n ) {
    cand . add ( arr ) ;
    return ;
  }
  /*friend(arr);*/
  for ( int i = 0 ;
  i < arr . length ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < arr . length ;
    j ++ ) {
      if ( xy [ arr [ i ] ] [ j ] == xy [ i ] [ j ] ] || xy [ arr [ j ] [ i ] ] == xy [ i ] [ j ] ) {
      }
    }
  }
}
