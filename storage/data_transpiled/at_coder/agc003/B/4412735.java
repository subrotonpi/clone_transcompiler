public static void input ( ) {
  n = Integer . parseInt ( input . readLine ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( a [ i ] % 2 == 0 && a [ i + 1 ] > 0 ) {
      a [ i + 1 ] -- ;
      ans ++ ;
    }
    ans += a [ i ] / 2 ;
  }
  ans += a [ n - 1 ] / 2 ;
  System . out . println ( ans ) ;
}
