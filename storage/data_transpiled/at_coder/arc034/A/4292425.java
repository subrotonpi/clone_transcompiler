public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] scores = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      scores [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    ans = Math . max ( ans , Integer . valueOf ( scores [ 0 ] ) + scores [ scores . length - 1 ] * 110 / 900 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
