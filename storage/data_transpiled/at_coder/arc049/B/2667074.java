public static int n = Integer . parseInt ( input ) {
  int [ ] [ ] p = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p [ i ] = new int [ 2 ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      p [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  /* com */
  int xa = p [ 0 ] [ 0 ] - n / p [ 0 ] [ 2 ] , xb = p [ 0 ] [ 0 ] + n / p [ 0 ] [ 2 ] , ya = p [ 0 ] [ 1 ] - n / p [ 0 ] [ 2 ] , yb = p [ 0 ] [ 1 ] + n / p [ 0 ] [ 2 ] ;
  for ( int i = 1 , j = 1 , k = p . length ;
  i < k ;
  i ++ ) {
    xa = Math . max ( xa , i - n / k ) ;
    xb = Math . min ( xb , i + n / k ) ;
    ya = Math . max ( ya , j - n / k ) ;
    yb = Math . min ( yb , j + n / k ) ;
  }
  int lo = 0 , hi = 10 * 9 ;
  for ( ;
  ;
  ) {
    int mid = ( lo + hi ) / 2 ;
    if ( com ( mid ) ) hi = mid ;
    else lo = mid ;
  }
  System . out . println ( hi ) ;
  return lo ;
}
