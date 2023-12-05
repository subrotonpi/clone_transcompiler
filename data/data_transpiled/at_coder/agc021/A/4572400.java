public static int input ( ) {
  int ans = Integer . parseInt ( input ( ) ) ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    int tmp = Integer . parseInt ( input ( ) . substring ( 0 , i ) ) - 1 + 9 * ( S . length - i ) ;
    ans = Math . max ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
