public static void DFS ( int n ) {
  int [ ] s = new int [ n ] ;
  int geta = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( a % 10 == 0 ) {
      geta += a ;
    }
    else {
      s [ i ] = a ;
    }
  }
  n = s . length ;
  Arrays . sort ( s , Collections . reverseOrder ( ) ) ;
  int tmp = Integer . parseInt ( s [ n - 1 ] ) ;
  ruiseki = new int [ n ] ;
  ruiseki [ n - 1 ] = tmp ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ruiseki [ i ] = ruiseki [ i ] - s [ i ] ;
  }
  int ans = 0 ;
  /* DFS(depth, now); */
  if ( depth == n ) {
    if ( now % 10 != 0 ) ans = Math . max ( ans , now ) ;
    return ;
  }
  if ( now + ruiseki [ depth ] <= ans ) return ;
  DFS ( depth + 1 , now ) ;
  System . out . println ( ans ) ;
}
