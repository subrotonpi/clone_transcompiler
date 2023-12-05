static final double sqrt ( double input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] arr = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = new int [ ] {
      Integer . parseInt ( input ) }
      ;
    }
    double tmp = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = i ;
      j < n ;
      j ++ ) {
        if ( ( arr [ j ] [ 0 ] - arr [ i ] [ 0 ] ) * ( arr [ j ] [ 1 ] - arr [ i ] [ 1 ] ) + ( arr [ j ] [ 1 ] - arr [ i ] [ 1 ] ) * ( arr [ j ] [ 0 ] - arr [ i ] [ 0 ] ) > tmp ) {
          tmp = ( arr [ j ] [ 0 ] - arr [ i ] [ 0 ] ) * ( arr [ j ] [ 1 ] - arr [ i ] [ 1 ] ) + ( arr [ j ] [ 1 ] - arr [ i ] [ 1 ] ) * ( arr [ j ] [ 1 ] - arr [ i ] [ 1 ] ) ;
        }
      }
    }
    System . out . println ( Math . sqrt ( tmp ) ) ;
    return tmp ;
  }
  