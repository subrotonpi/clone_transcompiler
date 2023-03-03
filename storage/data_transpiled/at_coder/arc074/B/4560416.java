@ VisibleForTesting static long heapSum ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] b = a . clone ( ) ;
  int [ ] leftQ = Arrays . copyOf ( a , n ) ;
  heapSort ( leftQ ) ;
  long sumLeft = Long . MAX_VALUE ;
  long [ ] left = new long [ n ] ;
  long [ ] rightQ = Arrays . copyOf ( b , n ) ;
  heapSort ( rightQ ) ;
  long sumRight = Long . MAX_VALUE ;
  long [ ] right = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i + n ] > leftQ [ 0 ] ) {
      long minA = Long . MAX_VALUE ;
      sumLeft -= minA ;
      sumLeft += a [ i + n ] ;
      heapSort ( leftQ , a [ i + n ] ) ;
    }
    left [ i ] = sumLeft ;
    if ( b [ i + n ] < - rightQ [ 0 ] ) {
      long minB = Long . MAX_VALUE ;
      sumRight -= minB ;
      sumRight += - b [ i + n ] ;
      heapSort ( rightQ , - b [ i + n ] ) ;
    }
    right [ i ] = sumRight ;
  }
  long ans = - Long . MAX_VALUE ;
  for ( int i = 0 , j = left . length ;
  i < right . length ;
  i ++ , j ++ ) ans = Math . max ( ans , j + i ) ;
  System . out . println ( ans ) ;
  return ans ;
}
