public static void print ( String input ) {
  String [ ] s = input . split ( " " ) ;
  int S = Integer . parseInt ( s [ 0 ] ) ;
  int T = Integer . parseInt ( s [ 1 ] ) ;
  if ( 1 <= S && S <= T && T <= 1000 ) {
    System . out . println ( T - S + 1 ) ;
  }
}
