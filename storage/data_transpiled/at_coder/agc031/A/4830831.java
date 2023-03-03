private static void solve ( ) {
  int mod = 10 * 9 + 7 ;
  String query = "abcdefghijklmnopqrstuvwxyz" ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Scanner s = new Scanner ( query ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( s . nextInt ( ) >= 1 ) {
      ans *= 1 + s . nextInt ( ) ;
      ans %= mod ;
    }
  }
  System . out . println ( ( ans - 1 ) % mod ) ;
}
