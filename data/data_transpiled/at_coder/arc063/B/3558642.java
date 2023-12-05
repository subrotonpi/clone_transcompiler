public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = inpl ( ) ;
  int T = inpl ( ) ;
  int [ ] A = inpl ( ) ;
  int [ ] minA = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    minA [ i ] = 0 ;
  }
  minA [ 0 ] = A [ 0 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    minA [ i + 1 ] = Math . min ( minA [ i ] , A [ i + 1 ] ) ;
  }
  int ans = 1 ;
  int maxpro = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    if ( A [ i + 1 ] - minA [ i ] == maxpro ) ans ++ ;
    if ( A [ i + 1 ] - minA [ i ] > maxpro ) {
      ans = 1 ;
      maxpro = A [ i + 1 ] - minA [ i ] ;
    }
  }
  System . out . println ( ans ) ;
  return A ;
}
