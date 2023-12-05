private static int [ ] [ ] group ( Scanner input ) {
  int n = input . nextInt ( ) , m = input . nextInt ( ) ;
  int [ ] [ ] group = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = input . nextInt ( ) , y = input . nextInt ( ) ;
    group [ x - 1 ] [ y ] = input . nextInt ( ) ;
    group [ y - 1 ] [ x ] = input . nextInt ( ) ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < 1 << n ;
  i ++ ) {
    int [ ] subgroup = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i >> j & 1 == 1 ) {
        subgroup [ j ] = subgroup [ j + 1 ] ;
      }
    }
    if ( subgroup . length > ans ) {
      if ( ( Arrays . binarySearch ( group [ j - 1 ] , subgroup ) > 0 ) > 0 ) ans = subgroup . length ;
    }
  }
  return group ;
}
