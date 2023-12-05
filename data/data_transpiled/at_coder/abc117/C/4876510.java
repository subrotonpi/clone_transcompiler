public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] array = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    array [ i ] = i ;
  }
  return array [ m - 1 ] - array [ 0 ] - sum ( l , 0 , n - 1 ) ;
}
