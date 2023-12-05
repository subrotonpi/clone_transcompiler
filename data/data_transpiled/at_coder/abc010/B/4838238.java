public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    int t = a [ i ] ;
    int cnt = 0 ;
    while ( t % 2 == 0 || ( t - 2 ) % 3 == 0 ) {
      t -- ;
      cnt ++ ;
    }
    res += cnt ;
  }
  System . out . println ( res ) ;
}
