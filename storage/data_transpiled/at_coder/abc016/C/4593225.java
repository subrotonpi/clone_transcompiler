public static int [ ] [ ] [ ] map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  int [ ] [ ] dist = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dist [ i ] [ i ] = 10 * 5 ;
  int [ ] [ ] res = new int [ N ] [ N ] ;
  /* WarshallFloyd the distance */
  for ( int k = 0 ;
  k < V ;
  k ++ ) for ( int i = 0 ;
  i < V ;
  i ++ ) for ( int j = 0 ;
  j < V ;
  j ++ ) d [ i ] [ j ] = Math . min ( d [ i ] [ j ] , d [ i ] [ k ] + d [ k ] [ j ] ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    A [ i ] [ 0 ] -- ;
    A [ i ] [ 1 ] -- ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) if ( i == j ) dist [ i ] [ j ] = 0 ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    dist [ A [ i ] [ 0 ] ] [ A [ i ] [ 1 ] ] = 1 ;
    dist [ A [ i ] [ 1 ] ] [ A [ i ] [ 0 ] ] = 1 ;
  }
  int [ ] [ ] distance = warshallFloyd ( dist , N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) if ( distance [ i ] [ j ] == 2 ) res [ i ] ++ ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) System . out . println ( res [ i ] ) ;
  return res ;
}
