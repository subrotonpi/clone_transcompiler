public static void setBit ( int n ) {
  int size = n ;
  int [ ] tree = new int [ n ] ;
  int i ;
  int s ;
  int x ;
  int i ;
  s = 0 ;
  i -- ;
  while ( i >= 0 ) {
    s += tree [ i ] ;
    i = ( i & ( i + 1 ) ) - 1 ;
  }
  /* add the i */
  while ( i < size ) {
    tree [ i ] += x ;
    i |= i + 1 ;
  }
  /* solve the number of bits */
  bit = new Bit ( n ) ;
  arr [ n ] = 0 ;
  q = 1 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    q *= n - i ;
    p = q / k ;
    q %= k ;
    if ( q == 0 ) p -- ;
    int lo = - 1 ;
    int hi = n ;
    while ( lo + 1 < hi ) {
      int mid = ( lo + hi + 1 ) / 2 ;
      int r = mid - bit . getSum ( mid + 1 ) ;
      if ( p < r ) hi = mid ;
      else lo = mid ;
    }
    System . out . println ( hi ) ;
    bit . add ( hi , 1 ) ;
    arr [ hi - 1 ] = 1 ;
    if ( q == 0 ) {
      for ( int j = n - 1 ;
      j >= 0 ;
      j -- ) {
        if ( arr [ j ] == 0 ) System . out . println ( j + 1 ) ;
      }
      break ;
    }
  }
  /* main program */
  n = input . nextInt ( ) ;
  k = input . nextInt ( ) ;
  n = Integer . parseInt ( n ) ;
  k = Integer . parseInt ( k ) ;
  solve ( n , k ) ;
}
