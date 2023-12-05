@ VisibleForTesting static void dfs ( int i , List < Integer > g , int [ ] dist ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  dfs ( i , g , dist ) ;
  for ( int node : g . get ( i ) ) {
    if ( dist [ node ] == - 1 ) {
      dist [ node ] = dist [ i ] + 1 ;
      dfs ( node , g , dist ) ;
    }
  }
  /* main program */
  Map < Integer , Integer > g = new TreeMap < > ( ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int A = Integer . parseInt ( input ( ) ) ;
    int B = Integer . parseInt ( input ( ) ) ;
    g . put ( A , B ) ;
    g . put ( B , A ) ;
  }
  int [ ] dist = new int [ N + 1 ] ;
  dist [ 0 ] = - 1 ;
  dist [ 1 ] = 0 ;
  dfs ( 1 , g , dist ) ;
  int ans1 = dist . indexOf ( max ( dist ) ) ;
  dist = new int [ N + 1 ] ;
  dist [ 0 ] = - 1 ;
  dist [ 1 ] = 0 ;
  dfs ( ans1 , g , dist ) ;
  int ans2 = dist . indexOf ( max ( dist ) ) ;
  System . out . println ( ans1 + " " + ans2 ) ;
}
