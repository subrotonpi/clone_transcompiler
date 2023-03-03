private static double solve ( ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = 10 * 100 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    int s = Integer . parseInt ( input . nextLine ( ) ) ;
    ans = Math . min ( ans , d * s / ( d - k ) ) ;
  }
  return ans ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < t ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( ) ) ;
  }
  return ans ;
}
