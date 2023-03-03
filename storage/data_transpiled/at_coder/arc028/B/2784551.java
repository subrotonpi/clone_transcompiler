static final int [ ] [ ] resize ( int [ ] input ) {
  int n = input . length ;
  int k = input . length ;
  int [ ] [ ] x = new int [ n ] [ k ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = input [ i ] ;
  }
  int [ ] [ ] h = new int [ k ] [ k ] ;
  for ( int r = 0 ;
  r < k ;
  r ++ ) {
    int a = x [ r ] [ 1 ] ;
    if ( r <= k ) {
      heapify ( h , - a , r ) ;
    }
    else {
      heapify ( h , - a , r ) ;
    }
    if ( r >= k ) {
      System . out . println ( h [ 0 ] [ 1 ] ) ;
    }
  }
  return h ;
}
