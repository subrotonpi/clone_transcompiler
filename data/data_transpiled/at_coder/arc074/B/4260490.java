static final int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] first = new int [ n ] ;
  int [ ] second = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    first [ i ] = a [ i ] ;
  }
  for ( int i = 2 * n ;
  i < 3 * n ;
  i ++ ) {
    second [ i ] = - a [ i ] ;
  }
  heapifyFirst ( first ) ;
  heapifySecond ( second ) ;
  int [ ] sumfirst = new int [ n + 1 ] ;
  int [ ] sumsecond = new int [ n + 1 ] ;
  sumfirst [ 0 ] = Math . max ( first [ 0 ] , sumfirst [ 1 ] ) ;
  sumsecond [ n ] = - Math . max ( second [ 0 ] , sumsecond [ 1 ] ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    int k = 0 ;
    k += a [ n - 1 + i ] ;
    heapifyFirst ( first , a [ n - 1 + i ] ) ;
    k -= Integer . MAX_VALUE ;
    sumfirst [ i ] = sumfirst [ i - 1 ] + k ;
  }
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int k = 0 ;
    k += a [ n + i ] ;
    heapifySecond ( second , - a [ n + i ] ) ;
  }
  int res = sumfirst [ 0 ] - sumsecond [ 0 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    res = Math . max ( res , sumfirst [ i ] - sumsecond [ i ] ) ;
  }
  System . out . println ( res ) ;
  return first ;
}
