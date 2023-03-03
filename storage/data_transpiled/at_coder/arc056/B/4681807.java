public static int [ ] [ ] solve ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n = input . nextInt ( ) ;
  final int m = input . nextInt ( ) ;
  s -- ;
  final int [ ] [ ] edge = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int u = input . nextInt ( ) ;
    final int v = input . nextInt ( ) ;
    edge [ u - 1 ] [ i ] = v - 1 ;
    edge [ v - 1 ] [ i ] = u - 1 ;
  }
  final int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
  }
  final int [ ] rank = new int [ n ] ;
  /* find the first element in the list */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( par [ i ] == par [ i ] ) {
      /* unite the first element in the list */
      final int x = par [ i ] ;
      final int y = par [ i ] ;
      if ( x != y ) {
        if ( rank [ x ] < rank [ y ] ) {
          par [ i ] = y ;
        }
        else {
          par [ y ] = x ;
          if ( rank [ x ] == rank [ y ] ) {
            rank [ x ] ++ ;
          }
        }
      }
    }
  }
  /* same the first element in the list */
  final int [ ] res = new int [ n ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    if ( i > s ) {
      for ( int e : edge [ i ] ) {
        if ( e > i ) {
          /* unite the first element in the list */
        }
        continue ;
      }
      for ( int e : edge [ i ] ) {
        if ( e > i ) {
          /* unite the first element in the list */
        }
      }
      if ( same ( i , s , par ) ) {
        res [ i ] = i ;
      }
    }
  }
  for ( int i = res . length - 1 ;
  i >= 0 ;
  i -- ) {
    System . out . println ( res [ i ] + 1 ) ;
  }
  return res ;
}
