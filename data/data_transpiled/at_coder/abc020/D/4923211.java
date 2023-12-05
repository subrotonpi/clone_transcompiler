public static int [ ] [ ] map ( String input ) {
  int n = Integer . parseInt ( input ) , k = Integer . parseInt ( input ) ;
  int [ ] [ ] d = new int [ 31700 ] [ 2 ] ;
  for ( int i = 1 ;
  i < d . length ;
  i ++ ) {
    if ( i * i > k ) {
      break ;
    }
    else {
      if ( k % i == 0 ) {
        d [ i ] [ 0 ] = ( n / i ) * ( n / i + 1 ) / 2 * i ;
        if ( k != i * i ) {
          int p = k / i ;
          d [ i ] [ 0 ] = p ;
          d [ i ] [ 1 ] = ( n / p ) * ( n / p + 1 ) / 2 * p ;
        }
      }
    }
  }
  Arrays . sort ( d ) ;
  for ( int i = d . length - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 0 ;
    j < i ;
    j ++ ) {
      if ( d [ i ] [ j ] % d [ j ] [ 0 ] == 0 ) {
        d [ j ] [ 1 ] -= d [ i ] [ 1 ] ;
      }
    }
  }
  int a = 0 ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    a += d [ i ] [ i ] * ( k / i ) ;
  }
  System . out . println ( a % ( 10 * 9 + 7 ) ) ;
  return d ;
}
