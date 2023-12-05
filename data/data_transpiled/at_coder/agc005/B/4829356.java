public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int [ ] b = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) b [ a [ i ] ] = i + 1 ;
  int [ ] l = new int [ N + 2 ] ;
  int [ ] r = new int [ N + 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) r [ i ] = i ;
  int ans = 0 ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    int m = b [ i ] ;
    int x = l [ m ] ;
    int y = r [ m ] ;
    ans += ( m - x + 1 ) * ( y - m + 1 ) * i ;
    r [ x - 1 ] = y ;
    l [ y + 1 ] = x ;
  }
  System . out . println ( ans ) ;
}
