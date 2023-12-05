static int n ( int a , int b , int c ) {
  int [ ] L = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  final int INF = 10 * 4 ;
  {
    if ( cou == n ) {
      return Math . min ( x , y ) > 0 ? Math . abs ( x - a ) + Math . abs ( y - b ) + Math . abs ( z - c ) - 30 : INF ;
    }
    int ret0 = search ( cou + 1 , x , y , z ) ;
    int ret1 = search ( cou + 1 , x + L [ cou ] , y , z ) + 10 ;
    int ret2 = search ( cou + 1 , x , y + L [ cou ] , z ) + 10 ;
    int ret3 = search ( cou + 1 , x , y , z + L [ cou ] ) + 10 ;
    return Math . min ( ret0 , ret1 , ret2 , ret3 ) ;
  }
}
