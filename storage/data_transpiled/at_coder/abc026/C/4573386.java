public static int [ ] [ ] salary ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  b = new int [ n ] [ ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    b [ i ] [ 0 ] = 0 ;
  }
  b [ n ] [ 1 ] = Integer . parseInt ( input ( ) ) - 1 ;
  b = b . clone ( ) ;
  salary = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    salary [ i ] [ 0 ] = 1 ;
  }
  return salary ;
}
