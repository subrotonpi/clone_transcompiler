public static double input ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  if ( x <= y ) {
    ans = Math . min ( ans , y - x ) ;
  }
  if ( x <= - y ) {
    ans = Math . min ( ans , - y + x + 2 ) ;
  }
  return ans ;
}
