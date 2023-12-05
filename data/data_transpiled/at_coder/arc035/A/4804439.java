public static void input ( String s ) {
  s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) / 2 ;
  i ++ ) {
    if ( s . charAt ( i ) != s . charAt ( s . length ( ) - i - 1 ) ) {
      if ( ! ( s . charAt ( i ) == '*' || s . charAt ( s . length ( ) - i - 1 ) == '*' ) ) {
        System . out . println ( "NO" ) ;
        break ;
      }
    }
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
