public static int mod ( int mod ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  int [ ] y = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = i - x [ 0 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) y [ i ] = i - y [ 0 ] ;
  int sumx = sum ( x ) ;
  int sumy = sum ( y ) ;
  int allx = sumx ;
  int ally = sumy ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    sumx -= ( n - i ) * ( x [ i ] - x [ i - 1 ] ) ;
    allx = ( allx + sumx ) % mod ;
  }
  for ( int i = 1 ;
  i < m ;
  i ++ ) {
    sumy -= ( m - i ) * ( y [ i ] - y [ i - 1 ] ) ;
    ally = ( ally + sumy ) % mod ;
  }
  System . out . println ( allx * ally % mod ) ;
  return 0 ;
}
