public static int f ( int [ ] r , int a ) {
  if ( r [ a ] != a ) {
    r [ a ] = f ( r , r [ a ] ) ;
  }
  /*union */
  a = f ( r , a ) ;
  b = f ( r , a ) ;
  if ( a != b ) {
    r [ a ] = b ;
  }
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ( ) ) ;
    int y = Integer . parseInt ( input ( ) ) ;
    x = x - 1 ;
    y = y - 1 ;
    union ( r , x , y ) ;
  }
  int c = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( f ( r , i ) == f ( r , p [ i ] - 1 ) ) {
      c ++ ;
    }
  }
  System . out . println ( c ) ;
  return c ;
}
