public static int tnum = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int test = 0 ;
  test < tnum ;
  test ++ ) {
    int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] p = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) p [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int ans = Math . max ( p [ 0 ] , p [ 1 ] ) ;
    for ( int u = 1 ;
    u < 1001 ;
    u ++ ) {
      int s = Integer . parseInt ( scanner . nextLine ( ) ) ;
      ans = Math . min ( ans , u + s ) ;
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ans ) ;
  }
  return ans ;
}
