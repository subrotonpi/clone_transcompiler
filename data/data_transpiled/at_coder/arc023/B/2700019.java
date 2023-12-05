public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] A = new int [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) {
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      if ( r + c <= D && ( D - ( r + c ) ) % 2 == 0 ) {
        ans = Math . max ( ans , A [ r ] [ c ] ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
