public static double sum ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new int [ n ] ;
  b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  k = sum ( a ) / n ;
  l = sum ( b ) / n ;
  double s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s += ( a [ i ] - k ) * ( a [ i ] - k ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s += ( b [ i ] - l ) ;
  }
  return s ;
}
