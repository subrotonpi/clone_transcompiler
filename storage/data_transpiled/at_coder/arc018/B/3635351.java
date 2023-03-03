static final int [ ] [ ] xy ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] xy = new int [ N ] [ N ] ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xy [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int k = 0 ;
    k < N ;
    k ++ ) {
      for ( int l = 0 ;
      l < N ;
      l ++ ) {
        if ( l != k && i != k && l != i ) {
          int x1 = xy [ i ] [ 0 ] ;
          int y1 = xy [ i ] [ 1 ] ;
          int x2 = xy [ k ] [ 0 ] ;
          int y2 = xy [ k ] [ 1 ] ;
          int x3 = xy [ l ] [ 0 ] ;
          int y3 = xy [ l ] [ 1 ] ;
          int S = ( x1 - x3 ) * ( y2 - y3 ) - ( x2 - x3 ) * ( y1 - y3 ) ;
          if ( S % 2 == 0 && S != 0 ) ans ++ ;
        }
      }
    }
  }
  System . out . println ( ans / 6 ) ;
  return xy ;
}
