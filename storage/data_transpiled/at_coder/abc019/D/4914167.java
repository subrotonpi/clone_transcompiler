public static int n = Integer . parseInt ( input ) {
  int u = 0 ;
  int dmax = 0 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    System . out . print ( "?" + 1 + " " + i ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( d > dmax ) {
      dmax = d ;
      u = i ;
    }
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( i == u ) continue ;
    System . out . print ( "?" + u + " " + i ) ;
    ans = Math . max ( ans , Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  return ans ;
}
