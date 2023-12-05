public static void print ( String s ) {
  int sn = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    sn += Integer . parseInt ( s . charAt ( i ) ) ;
  }
  System . out . println ( ( int ) ( s ) % sn == 0 ? "Yes" : "No" ) ;
}
