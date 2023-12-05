static final int [ ] [ ] getHistory ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ed = new int [ n ] [ m ] ;
  int [ ] [ ] v = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input . readLine ( ) ) ;
    int r = Integer . parseInt ( input . readLine ( ) ) ;
    int d = Integer . parseInt ( input . readLine ( ) ) ;
    ed [ l - 1 ] [ r ] = new int [ r - 1 ] ;
    ed [ r - 1 ] [ l ] = new int [ d ] ;
  }
  visited = new boolean [ n ] ;
  /*dfs(start);*/
}
