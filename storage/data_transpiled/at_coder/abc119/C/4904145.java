public static int n ( ) {
  int a = Integer . parseInt ( input . readLine ( ) ) ;
  int b = Integer . parseInt ( input . readLine ( ) ) ;
  int c = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] ls = new int [ n ] ;
  for ( int i = 0 ;
  i < ls . length ;
  i ++ ) ls [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  int min_ans = 10 * 10 ;
  for ( int i = 0 ;
  i < 4 * n ;
  i ++ ) {
    int [ ] [ ] mm = new int [ 3 ] [ 4 ] ;
    int tmp = i ;
    for ( int i2 = 0 ;
    i2 < n ;
    i2 ++ ) {
      int g = tmp / ( 4 * ( n - i2 - 1 ) ) ;
      tmp = tmp % ( 4 * ( n - i2 - 1 ) ) ;
      mm [ g % 4 ] [ i2 ] = ls [ i2 ] ;
    }
    if ( mm [ 0 ] . length * mm [ 1 ] . length * mm [ 2 ] . length == 0 ) continue ;
    int ans = Math . abs ( Integer . valueOf ( mm [ 0 ] ) - a ) + Math . abs ( Integer . valueOf ( mm [ 1 ] ) - b ) + Math . abs ( Integer . valueOf ( mm [ 2 ] ) - c ) + ( mm [ 0 ] . length - 1 ) * 10 + ( mm [ 1 ] . length - 1 ) * 10 + ( mm [ 2 ] . length - 1 ) * 10 ;
    min_ans = Math . min ( ans , min_ans ) ;
  }
  System . out . println ( min_ans ) ;
  return min_ans ;
}
