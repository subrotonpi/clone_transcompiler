public static void print ( String s ) {
  s = s . toString ( ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) / 2 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( s . length ( ) - 1 ) || s . charAt ( i ) == '*' || s . charAt ( s . length ( ) - 1 ) == '*' ) {
      c ++ ;
    }
  }
  if ( c == s . length ( ) / 2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
