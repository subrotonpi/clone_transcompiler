public static void input ( ) {
  s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . count ( s [ i ] ) % 2 == 1 ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "Yes" ) ;
}
