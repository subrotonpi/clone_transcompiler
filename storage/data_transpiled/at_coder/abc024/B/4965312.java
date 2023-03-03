public static long autodoor ( @ Nonnegative int N , @ Nonnegative int T , @ Nonnegative int [ ] A ) {
  long openTime = 0 , closeTime = 0 ;
  long totalOpeningTime = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] > closeTime ) {
      totalOpeningTime += closeTime - openTime ;
      openTime = A [ i ] ;
    }
    closeTime = A [ i ] + T ;
  }
  if ( getClass ( ) . isEnum ( ) ) {
    N = 0 ;
    N = Integer . parseInt ( input ( ) ) ;
    T = Integer . parseInt ( input ( ) ) ;
    A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input ( ) ) ;
    }
    long ans = autodoor ( N , T , A ) ;
    System . out . println ( ans ) ;
  }
  return totalOpeningTime ;
}
