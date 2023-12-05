public static void dfs ( int n , int m ) {
  int [ ] [ ] uv = new int [ m ] [ 2 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    uv [ i ] [ 0 ] = 0 ;
    uv [ i ] [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  boolean ans = true ;
  /* dfs(int num, int back, int[] arr) */
  if ( ans ) {
    ans = false ;
    return ;
  }
  arr [ 0 ] = num ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( uv [ i ] [ 0 ] == num && uv [ i ] [ 1 ] != back ) {
      dfs ( uv [ i ] [ 1 ] , num , arr ) ;
    }
    if ( uv [ i ] [ 1 ] == num && uv [ i ] [ 0 ] != back ) {
      dfs ( uv [ i ] [ 0 ] , num , arr ) ;
    }
  }
  int [ ] cand = new int [ n ] ;
  int cnt = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( ! cand [ i ] ) {
      cand = dfs ( i , 0 , cand ) ;
      if ( ans == true ) cnt ++ ;
      ans = true ;
    }
  }
  System . out . println ( cnt ) ;
}
