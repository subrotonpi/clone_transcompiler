public static void print ( String s ) {
  s = new HashSet < String > ( input ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . contains ( "N" ) ) ans ++ ;
    else if ( s . contains ( "W" ) ) ans += - 2 ;
    else ans += 2 ;
  }
  System . out . println ( ans == 0 ? "Yes" : "No" ) ;
}
