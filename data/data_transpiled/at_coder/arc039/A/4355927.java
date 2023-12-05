public static int convert ( String A , String B ) {
  int ans = - 1000 ;
  char [ ] alt = new char [ 10 ] ;
  for ( int i = 0 ;
  i < alt . length ;
  i ++ ) {
    alt [ i ] = String . valueOf ( i ) ;
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( char item : alt ) {
      if ( ! ( i == 0 && item == '0' ) ) {
        char [ ] copyA = A . toCharArray ( ) ;
        copyA [ i ] = item ;
        int diff = Integer . parseInt ( new String ( copyA ) ) - Integer . parseInt ( new String ( copyB ) ) ;
        ans = Math . max ( ans , diff ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( char item : alt ) {
      if ( ! ( i == 0 && item == '0' ) ) {
        char [ ] copyB = B . toCharArray ( ) ;
        copyB [ i ] = item ;
        int diff = Integer . parseInt ( new String ( A ) ) - Integer . parseInt ( new String ( copyB ) ) ;
        ans = Math . max ( ans , diff ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
