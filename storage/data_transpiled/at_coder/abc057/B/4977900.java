public static int [ ] [ ] piv ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  int [ ] [ ] piv = new int [ n ] [ m ] ;
  int [ ] [ ] check = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    piv [ i ] = new int [ a ] ;
    piv [ i ] [ 0 ] = a ;
    piv [ i ] [ 1 ] = b ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = input . nextInt ( ) ;
    int d = input . nextInt ( ) ;
    check [ i ] = new int [ c ] ;
    check [ i ] [ 1 ] = c ;
    check [ i ] [ 0 ] = d ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = 1000000000 ;
    int ans = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      int x = Math . abs ( piv [ i ] [ 0 ] - check [ j ] [ 0 ] ) + Math . abs ( piv [ i ] [ 1 ] - check [ j ] [ 1 ] ) ;
      if ( tmp > x ) {
        ans = j + 1 ;
        tmp = x ;
      }
    }
    System . out . println ( ans ) ;
  }
  return piv ;
}
