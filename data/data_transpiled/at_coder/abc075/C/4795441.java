private static void dfs ( int n , int m ) {
  int [ ] [ ] a = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] l = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] [ 0 ] = 0 ;
  }
  for ( int [ ] a_ : a ) {
    l [ a_ [ 0 ] - 1 ] [ a_ [ 1 ] - 1 ] = 1 ;
    l [ a_ [ 1 ] - 1 ] [ a_ [ 0 ] - 1 ] = 1 ;
  }
  boolean [ ] visited = new boolean [ n ] ;
  /*dfs(v);*/
  visited [ v ] = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( l [ v ] [ i ] == 1 && ! visited [ i ] ) {
      dfs ( i ) ;
    }
  }
  int ans = 0 ;
  for ( int [ ] a_ : a ) {
    l [ a_ [ 0 ] - 1 ] [ a_ [ 1 ] - 1 ] = 0 ;
    l [ a_ [ 1 ] - 1 ] [ a_ [ 0 ] - 1 ] = 0 ;
  }
  System . out . println ( ans ) ;
}
