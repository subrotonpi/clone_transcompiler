public static void print ( int n , int m ) {
  int [ ] xy = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xy [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] R = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) R [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) R [ i ] [ i ] = xy [ i ] [ i ] ;
  dp [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < 2 * n ;
  i ++ ) {
    StringBuilder b = new StringBuilder ( Integer . toString ( i ) ) ;
    StringBuilder sb = new StringBuilder ( ) ;
    sb . append ( '0' ) ;
    sb . append ( b ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( sb . charAt ( j ) == '1' ) {
        break ;
      }
      else {
        dp [ i ] += dp [ i - ( 2 * ( n - 1 - j ) ) ] ;
      }
    }
  }
  System . out . println ( dp [ 2 * n - 1 ] ) ;
}
