static int solve ( int R , int C , int N ) {
  final int [ ] [ ] mat = new int [ R + 1 ] [ C + 1 ] ;
  /* brute for a small number of unsat */
  if ( c > C ) {
    return brute ( r + 1 , 1 , n , unsat ) ;
  }
  if ( r > R ) {
    return unsat ;
  }
  int minunsat = Integer . MAX_VALUE ;
  if ( ( r - 1 ) * C + c + ( N - n ) <= R * C ) {
    mat [ r ] [ c ] = 0 ;
    minunsat = Math . min ( minunsat , brute ( r , c + 1 , n , unsat ) ) ;
  }
  if ( n < N ) {
    mat [ r ] [ c ] = 1 ;
    minunsat = Math . min ( minunsat , brute ( r , c + 1 , n + 1 , unsat + mat [ r ] [ c - 1 ] + mat [ r - 1 ] [ c ] ) ) ;
  }
  return minunsat ;
}
