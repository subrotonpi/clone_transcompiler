public static int [ ] getN ( ) {
  int [ ] H = new int [ N ] ;
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /* Check P */
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  ArrayList < Integer > sortedIndex_T = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Collections . sort ( sortedIndex_T ) ;
  Iterator < Integer > it = sortedIndex_T . iterator ( ) ;
  int i ;
  while ( it . hasNext ( ) ) {
    i = it . next ( ) ;
    if ( ( T [ i ] < i ) && ( T [ i ] > i ) ) {
      return false ;
    }
  }
  P_low = 0 ;
  P_high = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = H [ i ] ;
    if ( ( P_low < p ) && ( T [ i ] < p ) ) {
      P_low = p ;
    }
    p = H [ i ] + S [ i ] * ( N - 1 ) ;
    if ( ( P_high < p ) && ( T [ i ] < p ) ) {
      P_high = p ;
    }
  }
  P_low -- ;
  while ( ( P_high <= ( P_low + 1 ) ) && ( T [ i ] > i ) ) {
    System . out . println ( P_high ) ;
    break ;
  }
  return T ;
}
