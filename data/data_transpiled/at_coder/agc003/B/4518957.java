public static void input ( ) {
  n = Integer . parseInt ( input . readLine ( ) ) ;
  a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  long ans = 0 ;
  long tmp = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] == 0 ) {
      ans += tmp / 2 ;
      tmp = 0 ;
    }
    else {
      tmp += a [ i ] ;
    }
  }
  ans += tmp / 2 ;
  System . out . println ( ans ) ;
}
