@ Sys public static int solve ( ) {
  setRecursionLimit ( 10 * 7 ) ;
  {
    int N = Integer . parseInt ( stdin . readLine ( ) ) ;
    int [ ] [ ] Adj = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) Adj [ i ] = new int [ N ] ;
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) {
      int a = Integer . parseInt ( stdin . readLine ( ) ) - 1 ;
      Adj [ a ] [ i ] = i + 1 ;
    }
    int ans = dfs ( N , Adj , 0 , - 1 ) ;
    System . out . println ( ans ) ;
  }
  {
    int [ ] [ ] dl = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int u = Adj [ i ] [ 0 ] ;
      if ( u == p ) continue ;
      dl [ i ] = dfs ( N , Adj , u , v ) ;
    }
    Arrays . sort ( dl , Collections . reverseOrder ( ) ) ;
    if ( dl . length == 0 ) return 0 ;
    int res = Math . max ( dl [ 0 ] + i + 1 , dl [ 1 ] [ 0 ] ) ;
    return res ;
  }
}
