public static void init ( int n ) {
  par = new int [ n ] ;
  rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  /* find the first element */
  int x , y ;
  /* unite the first element */
  x = find ( par [ 0 ] ) ;
  y = find ( par [ 1 ] ) ;
  if ( x == y ) return ;
  if ( rank [ x ] < rank [ y ] ) par [ x ] = y ;
  else {
    par [ y ] = x ;
    if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
  }
  /* same the first element */
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  init ( N ) ;
  p = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    y = Integer . parseInt ( input . nextLine ( ) ) ;
    unite ( x - 1 , y - 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( same ( i , p [ i ] - 1 ) ) ans ++ ;
  }
  System . out . println ( ans ) ;
}
