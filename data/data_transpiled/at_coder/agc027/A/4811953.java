public static int N ( int x ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a_ = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a_ [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a_ ) ;
  if ( x == Integer . MAX_VALUE ) {
    System . out . println ( N ) ;
  }
  else {
    int sumA = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( x >= sumA + a_ [ i ] ) {
        sumA += a_ [ i ] ;
      }
      else {
        break ;
      }
    }
    System . out . println ( i ) ;
  }
  return N ;
}
