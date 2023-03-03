static final long [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] FN = new int [ n ] ;
  int [ ] SN = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    FN [ i ] = a [ i ] ;
  }
  for ( int i = 2 * n ;
  i < 3 * n ;
  i ++ ) {
    SN [ i ] = - a [ i ] ;
  }
  heapify ( FN ) ;
  heapify ( SN ) ;
  int [ ] sumFN = new int [ n + 1 ] ;
  int [ ] sumSN = new int [ n + 1 ] ;
  sumFN [ 0 ] = sum ( FN ) ;
  sumSN [ n ] = - sum ( SN ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int k = 0 ;
    k += a [ n - 1 + i ] ;
    heapify ( FN , a [ n - 1 + i ] ) ;
    k -= heapify ( FN ) ;
    sumFN [ i ] = sumFN [ i - 1 ] + k ;
  }
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int k = 0 ;
    k += a [ n + i ] ;
    heapify ( SN , - a [ n + i ] ) ;
    k -= - heapify ( SN ) ;
    sumSN [ i ] = sumSN [ i + 1 ] + k ;
  }
  long res = sumFN [ 0 ] - sumSN [ 0 ] ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    res = Math . max ( res , sumFN [ i ] - sumSN [ i ] ) ;
  }
  System . out . println ( res ) ;
}
