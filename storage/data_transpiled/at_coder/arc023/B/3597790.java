public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    List < Integer > A = Lists . newArrayList ( ) ;
    for ( int k = 0 + ( D - i ) % 2 ;
    k <= Math . min ( C - 1 , D - i ) ;
    k += 2 ) {
      ans = Math . max ( ans , A . get ( k ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
