public static final double [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( ) ) ;
  double [ ] queLeft = new double [ n ] , queRight = new double [ n ] ;
  double [ ] left = new double [ 3 * n ] , right = new double [ 3 * n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapq . heapSort ( queLeft , A [ i ] ) ;
    if ( i == 0 ) left [ i ] = A [ i ] ;
    else left [ i ] = left [ i - 1 ] + A [ i ] ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    heapq . heapSort ( queLeft , A [ i ] ) ;
    double tmp = heapq . heappop ( queLeft ) ;
    left [ i ] = left [ i - 1 ] + A [ i ] - tmp ;
  }
  for ( int i = 2 * n ;
  i < 3 * n ;
  i ++ ) {
    heapq . heapSort ( queRight , - A [ i ] ) ;
    if ( i == 3 * n - 1 ) right [ i ] = A [ i ] ;
    else right [ i ] = right [ i + 1 ] + A [ i ] ;
  }
  for ( int i = n ;
  i < 2 * n ;
  i ++ ) {
    heapq . heapSort ( queRight , - A [ i ] ) ;
    double tmp = heapq . heappop ( queRight ) ;
    right [ i ] = right [ i + 1 ] + A [ i ] + tmp ;
  }
  double ans = - Double . MAX_VALUE ;
  for ( int i = n - 1 ;
  i < 2 * n ;
  i ++ ) ans = Math . max ( ans , left [ i ] - right [ i + 1 ] ) ;
  System . out . println ( ans ) ;
}
