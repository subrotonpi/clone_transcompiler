static int [ ] s ( ) {
  s = list ( input ) ;
  int n = s . length ;
  int [ ] can = new int [ n ] ;
  {
    dfs ( i , left , sum ) ;
  }
  {
    dfs ( i + 1 , left , sum ) ;
    dfs ( i + 1 , i + 1 , sum + Integer . parseInt ( s . substring ( left , i + 1 ) ) ) ;
    return can ;
  }
}
