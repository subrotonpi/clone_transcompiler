public static int N = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( T ) ;
  int limit = T [ 0 ] ;
  int answer = 1 ;
  int counter = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    if ( T [ i ] - limit > K || counter == C ) {
      limit = T [ i ] ;
      counter = 1 ;
      answer ++ ;
    }
    else {
      counter ++ ;
    }
  }
  System . out . println ( answer ) ;
  return answer ;
}
