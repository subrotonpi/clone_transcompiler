public static void print ( int n ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int a = 1 ;
  int ans = 0 ;
  while ( a != 2 ) {
    a = l [ a - 1 ] ;
    ans ++ ;
    if ( ans == n + 1 ) {
      ans = - 1 ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
