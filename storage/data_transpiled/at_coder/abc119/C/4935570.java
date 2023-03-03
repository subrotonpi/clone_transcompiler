public static String Base_10_to_n ( double X , int n ) {
  if ( ( ( int ) ( X / n ) ) != 0 ) return Base_10_to_n ( ( int ) ( X / n ) , n ) + String . valueOf ( X % n ) ;
  /* Score calc */
  int ans ;
  if ( a . length ( ) == 0 ) {
    ans = 10 * 9 ;
  }
  else {
    ans = 10 * ( a . length ( ) - 1 ) ;
    ans += Math . abs ( Integer . parseInt ( a ) - target ) ;
  }
  return ans ;
}
