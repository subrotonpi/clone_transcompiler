public static int [ ] inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int mod = 10 * 9 + 7 ;
  int n = inpl ( ) ;
  int m = inpl ( ) ;
  int [ ] x = inpl ( ) ;
  int [ ] y = inpl ( ) ;
  int [ ] H = new int [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    H [ i ] = ( x [ i + 1 ] - x [ i ] ) * ( i + 1 ) * ( n - i - 1 ) % mod ;
  }
  int [ ] W = new int [ m ] ;
  for ( int j = 0 ;
  j < m - 1 ;
  j ++ ) {
    W [ j ] = ( y [ j + 1 ] - y [ j ] ) * ( j + 1 ) * ( m - j - 1 ) % mod ;
  }
  System . out . println ( Arrays . toString ( H ) * Arrays . toString ( W ) % mod ) ;
}
