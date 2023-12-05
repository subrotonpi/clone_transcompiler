public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( args [ 0 ] ) , m = Integer . parseInt ( args [ 1 ] ) ;
  int [ ] [ ] matrix = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    matrix [ i ] [ 0 ] = Integer . parseInt ( args [ 2 ] ) ;
  }
  int [ ] [ ] ee = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ee [ i ] [ 0 ] = matrix [ i ] [ 0 ] - 1 ;
  }
  int cnt = 0 ;
  int k = 0 ;
  for ( int L = 0 ;
  L < m ;
  L ++ ) {
    int [ ] xx = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      xx [ i ] = i ;
    }
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( ee [ j ] != k ) {
        xx [ j ] = ee [ j ] [ 1 ] ;
      }
    }
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    if ( ee [ j ] != j ) {
      ee [ j ] = ee [ j ] [ 0 ] ;
    }
  }
  for ( int j = 0 ;
  j < m ;
  j ++ ) {
    if ( ee [ j ] != j ) {
      ee [ j ] = ee [ j ] [ j ] ;
    }
  }
}
