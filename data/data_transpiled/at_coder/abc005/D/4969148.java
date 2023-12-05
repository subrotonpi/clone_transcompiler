public static int calc ( int x0 , int y0 , int x1 , int y1 ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> d = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ q ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] value = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j > 0 ) {
        value [ j ] [ i ] = value [ j - 1 ] [ i ] + Integer . parseInt ( d . get ( j ) . subList ( 0 , i + 1 ) ) ;
      }
      else {
        value [ j ] [ i ] = Integer . parseInt ( d . get ( j ) . subList ( 0 , i + 1 ) ) ;
      }
    }
  }
  /* calc(x0, y0, x1, y1) */
  int [ ] ans = new int [ n * n + 1 ] ;
  for ( int x1 = 0 ;
  x1 < n ;
  x1 ++ ) {
    for ( int y1 = 0 ;
    y1 < n ;
    y1 ++ ) {
      for ( int x0 = - 1 ;
      x0 < x1 ;
      x0 ++ ) {
        for ( int y0 = - 1 ;
        y0 < y1 ;
        y0 ++ ) {
          ans [ ( x1 - x0 ) * ( y1 - y0 ) ] = Math . max ( ans [ ( x1 - x0 ) * ( y1 - y0 ) ] , calc ( x0 , y0 , x1 , y1 ) ) ;
        }
      }
    }
  }
  int m = 0 ;
  for ( int i = 0 ;
  i < n * n + 1 ;
  i ++ ) {
    if ( m < ans [ i ] ) {
      m = ans [ i ] ;
    }
    else {
      ans [ i ] = m ;
    }
  }
  for ( int pi : p ) {
    System . out . println ( ans [ pi ] ) ;
  }
  return 0 ;
}
