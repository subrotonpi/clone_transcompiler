public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( String i : input ( ) . split ( " " ) ) a [ i ] = Integer . parseInt ( i ) ;
  int [ ] b = new int [ n + 1 ] , l = new int [ n + 2 ] , r = new int [ n + 2 ] , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ a [ i ] ] = i ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    int m = b [ i ] ;
    int x = l [ m ] , y = r [ m ] ;
    ans += i * ( m - x + 1 ) * ( y - m + 1 ) ;
    l [ y + 1 ] = x ;
    r [ x - 1 ] = y ;
  }
  System . out . println ( ans ) ;
}
