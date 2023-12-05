public static void main ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  query = new int [ 1001 ] ;
  int mod = 10 * 9 + 7 ;
  int tmp = n ;
  for ( tmp = 1 ;
  tmp <= n ;
  tmp ++ ) {
    for ( int i = 2 ;
    i < 1002 ;
    i ++ ) {
      while ( tmp % i == 0 ) {
        query [ i - 1 ] ++ ;
        tmp = tmp / i ;
      }
    }
  }
  long ans = 1 ;
  for ( int i : query ) {
    ans = ans * ( 1 + i ) % mod ;
  }
  System . out . println ( ans % mod ) ;
}
