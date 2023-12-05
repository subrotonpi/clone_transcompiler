public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 0 ;
  int upCount = 1 ;
  int before = A [ 0 ] ;
  for ( int a = 1 ;
  a < A . length ;
  a ++ ) {
    if ( before < A [ a ] ) {
      upCount ++ ;
    }
    else {
      if ( upCount >= K ) {
        count += upCount - K + 1 ;
      }
      upCount = 1 ;
    }
    before = A [ a ] ;
  }
  System . out . println ( count ) ;
  return count ;
}
