static int [ ] [ ] findClosestPath ( int [ ] s_array , int [ ] s_array , int [ ] t_array , int [ ] point ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s_array = new int [ A ] ;
  int [ ] t_array = new int [ B ] ;
  int [ ] x = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Find the closest path */
  int [ ] s_array = new int [ A ] ;
  for ( int i = 0 ;
  i < A ;
  i ++ ) {
    s_array [ i ] = s_array [ i ] ;
  }
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    t_array [ i ] = t_array [ i ] ;
  }
  /* Find the shortest path */
  int shortest = 10 * 11 ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) {
    int s = s_array [ i ] ;
    int t = t_array [ i ] ;
    int length = Math . min ( Math . abs ( point - t ) , Math . abs ( point - s ) ) + Math . abs ( s - t ) ;
    if ( length < shortest ) shortest = length ;
  }
  /* Find the shortest path */
  for ( int i = 0 ;
  i < shortest ;
  i ++ ) {
    int s_idx = s_array [ i ] ;
    int t_idx = t_array [ i ] ;
    int [ ] answer ;
    if ( s_array . length > 1 ) {
      s_array [ i ] = s_array [ s_idx ] ;
      s_array [ i ] = s_array [ s_idx + 1 ] ;
    }
    else {
      s_array [ i ] = s_array [ 0 ] ;
      s_array [ i ] = s_array [ 0 ] ;
    }
    if ( t_array . length > 1 ) {
      t_array [ i ] = t_array [ t_idx ] ;
      t_array [ i ] = t_array [ 0 ] ;
    }
    answer = findClosestPath ( s_array , s_array , t_array , point ) ;
    System . out . println ( answer ) ;
  }
  return null ;
}
