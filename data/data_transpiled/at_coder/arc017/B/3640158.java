public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int cont = 0 ;
  int i = 1 ;
  while ( i != N ) {
    if ( cont < K - 2 ) {
      if ( A [ i ] > A [ i - 1 ] ) {
        cont ++ ;
      }
      else {
        cont = 0 ;
      }
    }
    else {
      if ( A [ i ] > A [ i - 1 ] ) {
        ans ++ ;
      }
      else {
        cont ++ ;
      }
    }
    i ++ ;
  }
  if ( K == 1 ) {
    System . out . println ( N ) ;
    quit ( ) ;
  }
  return ans ;
}
