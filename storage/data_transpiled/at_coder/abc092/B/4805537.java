public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int tmp = 1 ;
    do {
      if ( tmp * i + 1 <= d ) {
        a [ tmp * i + 1 ] = Integer . parseInt ( input ) ;
        tmp ++ ;
      }
      else {
        ans += tmp ;
        break ;
      }
    }
    while ( tmp < a . length ) ;
  }
  System . out . println ( ans + x ) ;
}
