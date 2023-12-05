public static int [ ] [ ] group ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] group = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    group [ x - 1 ] [ y ] = y ;
    group [ y - 1 ] [ x ] = x ;
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < 1 << N ;
  i ++ ) {
    int [ ] [ ] subGroup = new int [ N ] [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ( i >> j ) & 1 ) {
        subGroup [ j ] [ N ] = j + 1 ;
      }
    }
    if ( subGroup . length > ans ) {
      if ( Arrays . equals ( group [ j - 1 ] , group [ j ] ) ) {
        ans = subGroup . length ;
      }
    }
  }
  System . out . println ( ans ) ;
  return group ;
}
