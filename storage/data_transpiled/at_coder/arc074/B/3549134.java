@ VisibleForTesting static void heapSort ( int n , int [ ] a ) {
  int [ ] n = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] q = new int [ n ] ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapSort ( q , a [ i ] ) ;
    s += a [ i ] ;
  }
  int [ ] left = new int [ n ] ;
  left [ 0 ] = s ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    int x = heapSort ( q , a [ n + k ] ) ;
    s = s - x + a [ n + k ] ;
    left [ k ] = s ;
  }
  q = new int [ n ] ;
  s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    heapSort ( q , - 1 * a [ 3 * n - 1 - i ] ) ;
    s += a [ 3 * n - 1 - i ] ;
  }
  int [ ] right = new int [ n + 1 ] ;
  right [ n ] = s ;
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    right [ k ] = s ;
  }
  int m = 0 ;
  for ( int k = 0 ;
  k < n + 1 ;
  k ++ ) {
    if ( m == 0 ) {
      m = left [ k ] - right [ k ] ;
    }
    else {
      m = Math . max ( m , left [ k ] - right [ k ] ) ;
    }
  }
  System . out . println ( m ) ;
}
