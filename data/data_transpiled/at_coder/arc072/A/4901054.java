public static void print ( int n ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int [ ] N = A . clone ( ) ;
  int ncount = 0 ;
  if ( N [ 0 ] >= 0 ) {
    ncount += Math . abs ( N [ 0 ] ) + 1 ;
    N [ 0 ] = - 1 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    N [ i ] += N [ i - 1 ] ;
    if ( i % 2 == 1 ) {
      if ( N [ i ] <= 0 ) {
        ncount += Math . abs ( N [ i ] ) + 1 ;
        N [ i ] = 1 ;
      }
    }
    else {
      if ( N [ i ] >= 0 ) {
        ncount += Math . abs ( N [ i ] ) + 1 ;
        N [ i ] = - 1 ;
      }
    }
  }
  int [ ] P = A . clone ( ) ;
  int pcount = 0 ;
  if ( P [ 0 ] <= 0 ) {
    pcount += Math . abs ( P [ 0 ] ) + 1 ;
    P [ 0 ] = 1 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    P [ i ] += P [ i - 1 ] ;
    if ( i % 2 == 0 ) {
      if ( P [ i ] <= 0 ) {
        pcount += Math . abs ( P [ i ] ) + 1 ;
        P [ i ] = 1 ;
      }
    }
    else {
      if ( P [ i ] >= 0 ) {
        pcount += Math . abs ( P [ i ] ) + 1 ;
        P [ i ] = - 1 ;
      }
    }
  }
  System . out . println ( Math . min ( ncount , pcount ) ) ;
}
