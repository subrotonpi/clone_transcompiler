public static int S ( ) {
  StringBuilder s = new StringBuilder ( ) ;
  int s_len = S . length ( ) ;
  int ans ;
  for ( int i = 0 ;
  i < s_len ;
  i ++ ) {
    s . delete ( 0 , s . length ( ) ) ;
    if ( s . length ( ) % 2 == 0 && s . substring ( 0 , s . length ( ) / 2 ) . equals ( s . substring ( s . length ( ) / 2 ) ) ) {
      ans = s . length ( ) ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
