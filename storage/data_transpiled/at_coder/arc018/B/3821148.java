public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] lattice = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = ( Integer ) input . next ( ) ;
    int y = ( Integer ) input . next ( ) ;
    lattice [ i ] [ 0 ] = x ;
    lattice [ i ] [ 1 ] = y ;
  }
  int triangles = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        int x0 = lattice [ i ] [ 0 ] ;
        int y0 = lattice [ i ] [ 1 ] ;
        int x1 = lattice [ j ] [ 0 ] - x0 ;
        int y1 = lattice [ j ] [ 1 ] - y0 ;
        int x2 = lattice [ k ] [ 0 ] - x0 ;
        int y2 = lattice [ k ] [ 1 ] - y0 ;
        int doubleArea = Math . abs ( x1 * y2 - y1 * x2 ) ;
        if ( doubleArea % 2 == 0 && doubleArea != 0 ) {
          triangles ++ ;
        }
      }
    }
  }
  System . out . println ( triangles ) ;
  return triangles ;
}
