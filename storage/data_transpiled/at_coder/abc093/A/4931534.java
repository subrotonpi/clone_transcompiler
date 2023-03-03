public static String input ( ) {
  int c = 0 ;
  for ( char i : "abc" . toCharArray ( ) ) {
    if ( s . indexOf ( i ) == 1 ) {
      c ++ ;
    }
  }
  return ( c == 3 ? "Yes" : "No" ) ;
}
