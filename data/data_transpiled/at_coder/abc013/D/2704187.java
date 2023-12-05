static void print ( int n , int m , int d ) {
  int [ ] a = ( int [ ] ) input . split ( " " ) ;
  int [ ] b = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) b [ i ] = input . split ( " " ) ;
  for ( int i = 0 ;
  i < b . length ;
  i ++ ) b [ i ] = a [ i ] ;
  int [ ] x = new int [ n + 1 ] , y = new boolean [ n + 1 ] , ans = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) x [ b [ i ] ] = i ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( y [ i ] != x [ i ] ) y [ i ] = true ;
  }
}
