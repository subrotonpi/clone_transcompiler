public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = - y ;
  }
  int p = 0 ;
  int q = 0 ;
  int ans = 0 ;
  while ( true ) {
    while ( p < n ) {
      if ( a [ p ] >= b [ q ] + y ) break ;
      else p ++ ;
    }
    else break ;
    while ( q < m + 1 ) {
      if ( a [ p ] <= x ) {
        ans ++ ;
        break ;
      }
      else q ++ ;
    }
  }
  System . out . println ( ans ) ;
}
