public static int n ( ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int cnt = 0 ;
  do {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( a [ i ] % 2 != 0 ) {
        System . out . println ( cnt ) ;
        exit ( ) ;
      }
      a [ i ] /= 2 ;
    }
    cnt ++ ;
  }
  while ( cnt < n ) ;
  return cnt ;
}
