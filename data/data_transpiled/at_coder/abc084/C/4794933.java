public static int [ ] getTimes ( ) {
  int [ ] c = new int [ n ] ;
  int [ ] s = new int [ n ] ;
  int [ ] f = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int ci = Integer . parseInt ( input . nextLine ( ) ) ;
    int si = Integer . parseInt ( input . nextLine ( ) ) ;
    int fi = Integer . parseInt ( input . nextLine ( ) ) ;
    c [ i ] = ci ;
    s [ i ] = si ;
    f [ i ] = fi ;
  }
  int T ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T = 0 ;
    if ( s [ i ] >= t ) {
      T = s [ i ] ;
    }
    else {
      if ( ( t - s [ i ] ) % f [ i ] == 0 ) {
        T = t ;
      }
      else {
        T = t + f [ i ] - ( t - s [ i ] ) % f [ i ] ;
      }
    }
  }
  System . out . println ( T + c [ i ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    T = 0 ;
    for ( int j = i ;
    j < n - 1 ;
    j ++ ) {
      t = time ( t , j ) ;
    }
    System . out . println ( t ) ;
  }
  return c ;
}
