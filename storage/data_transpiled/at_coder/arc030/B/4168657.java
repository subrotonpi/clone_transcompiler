public static void bTree ( int N , int X , int H , int [ ] Edges ) {
  int x = X - 1 ;
  int [ ] [ ] graph = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) graph [ i ] [ 0 ] = new int [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) graph [ i ] [ 0 ] = i ;
  for ( int b = 0 ;
  b < N ;
  b ++ ) graph [ i ] [ 1 ] = i ;
  boolean [ ] isVisited = new boolean [ N ] ;
  boolean [ ] isExistTreasure = new boolean [ H ] ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) isExistTreasure [ h ] = true ;
  int ans = 0 ;
  /*dfs(x);*/
}
