public static double n ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] b = a . clone ( ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      b [ j ] = Math . min ( b [ j ] , a [ j ] - i ) ;
    }
    ans = Math . min ( ans , Math . pow ( b [ i ] , x ) + x * i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
