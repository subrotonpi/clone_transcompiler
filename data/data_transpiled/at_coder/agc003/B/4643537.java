public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i != n - 1 && a [ i ] % 2 == 1 ) {
      if ( a [ i + 1 ] != 0 ) {
        a [ i + 1 ] -- ;
        cnt ++ ;
      }
    }
    cnt += a [ i ] / 2 ;
  }
  System . out . println ( cnt ) ;
}
