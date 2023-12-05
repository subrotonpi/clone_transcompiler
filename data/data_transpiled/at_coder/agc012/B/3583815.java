private static void updateDP ( int n , int m ) {
  int [ ] [ ] graph = new int [ n + 1 ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) graph [ i ] = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) graph [ i ] [ 0 ] = i ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) graph [ i ] [ i ] = i ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) graph [ i ] [ i ] = i ;
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > qlist = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) qlist . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  Collections . reverse ( qlist ) ;
  int [ ] [ ] dp = new int [ 11 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) dp [ i ] [ 0 ] = - 1 ;
  int [ ] col = new int [ n + 1 ] ;
  /* update dp */
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    if ( dp [ i ] [ 0 ] == - 1 ) {
      dp [ i ] [ 0 ] = t ;
      if ( i > 0 ) {
        /* dp[i][0] = t; if (i > 0) */
        for ( int u : graph [ i ] ) {
          /* dp[i][0] = t; if (i > 0) */
          dp [ i ] [ 1 ] = t ;
        }
      }
    }
  }
  int t = 0 ;
  for ( int i = 0 ;
  i < qlist . size ( ) ;
  i ++ ) {
    int v = qlist . get ( i ) ;
    int d = qlist . get ( i ) ;
    col [ i ] = c ;
    /* col[i] = col[i] + 1; */
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) System . out . println ( col [ dp [ i ] [ 0 ] + 1 ] ) ;
}
